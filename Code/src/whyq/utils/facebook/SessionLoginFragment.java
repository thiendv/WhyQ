/**
 * Copyright 2010-present Facebook.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package whyq.utils.facebook;

import whyq.interfaces.IFacebookLister;
import whyq.utils.WhyqUtils;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.LoggingBehavior;
import com.facebook.Session;
import com.facebook.SessionState;
import com.facebook.Settings;
import com.whyq.R;

public class SessionLoginFragment extends DialogFragment {
	private static final String URL_PREFIX_FRIENDS = "https://graph.facebook.com/me/friends?access_token=";

	private TextView textInstructionsOrLink;
	private Button buttonLoginLogout;
	private Session.StatusCallback statusCallback = new SessionStatusCallback();
	private Activity activity;
	private IFacebookLister listener;

	private WhyqUtils whyqUtil;

	@Override
	public void onAttach(Activity activity) {
		// TODO Auto-generated method stub
		super.onAttach(activity);
		this.activity = activity;
		this.listener = (IFacebookLister) activity;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment, container, false);

		whyqUtil = new WhyqUtils();
		buttonLoginLogout = (Button) view.findViewById(R.id.buttonLoginLogout);
		textInstructionsOrLink = (TextView) view
				.findViewById(R.id.instructionsOrLink);

		Settings.addLoggingBehavior(LoggingBehavior.INCLUDE_ACCESS_TOKENS);

		Session session = Session.getActiveSession();
		if (session == null) {
			if (savedInstanceState != null) {
				session = Session.restoreSession(getActivity(), null,
						statusCallback, savedInstanceState);
			}
			if (session == null) {
				session = new Session(activity);
			}
			Session.setActiveSession(session);
			if (session.getState().equals(SessionState.CREATED_TOKEN_LOADED)) {
				session.openForRead(new Session.OpenRequest(this)
						.setCallback(statusCallback));
			}
		}

		updateView();

		return view;
	}

	@Override
	public void onStart() {
		super.onStart();
		Session.getActiveSession().addCallback(statusCallback);
	}

	@Override
	public void onStop() {
		super.onStop();
		Session.getActiveSession().removeCallback(statusCallback);
	}

	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		Session.getActiveSession().onActivityResult(getActivity(), requestCode,
				resultCode, data);
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		Session session = Session.getActiveSession();
		Session.saveSession(session, outState);
	}

	private void updateView() {
		try {

			Session session = Session.getActiveSession();
			if (session.isOpened()) {
				textInstructionsOrLink.setText(URL_PREFIX_FRIENDS
						+ session.getAccessToken());
				buttonLoginLogout.setText(R.string.logout);
				buttonLoginLogout.setOnClickListener(new View.OnClickListener() {
					public void onClick(View view) {
						onClickLogout();
					}
				});
				if(session.getAccessToken()!=null){
					whyqUtil.saveFacebookToken("oauth_token", session.getAccessToken(), activity);
					if(getActivity()!=null)
						getActivity().finish();
					listener.onCompled(true);	
				}
				
			} else {
				textInstructionsOrLink.setText("a");
				buttonLoginLogout.setText(R.string.login);
				buttonLoginLogout.setOnClickListener(new View.OnClickListener() {
					public void onClick(View view) {
						onClickLogin();
					}
				});
				onClickLogin();
				if(session.getAccessToken()!=null){
					whyqUtil.saveFacebookToken("oauth_token", session.getAccessToken(), activity);
					listener.onCompled(true);
					if(getActivity()!=null)
						getActivity().finish();					
				}

			}
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	private void onClickLogin() {
		Session session = Session.getActiveSession();
		if (!session.isOpened() && !session.isClosed()) {
			session.openForRead(new Session.OpenRequest(this)
					.setCallback(statusCallback));
		} else {
			Session.openActiveSession(getActivity(), this, true, statusCallback);
		}
	}

	private void onClickLogout() {
		Session session = Session.getActiveSession();
		if (!session.isClosed()) {
			session.closeAndClearTokenInformation();
		}
	}

	private class SessionStatusCallback implements Session.StatusCallback {
		@Override
		public void call(Session session, SessionState state,
				Exception exception) {
			final WhyqUtils mPermutils = new WhyqUtils();
			if(session.getAccessToken()!=null)
				mPermutils.saveFacebookToken("oauth_token", session.getAccessToken(), activity);
			updateView();
		}
	}
}
