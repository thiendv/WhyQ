package whyq.service.pushnotification;

import whyq.WhyqMain;
import whyq.adapter.WhyqMenuAdapter;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseInstallation;
import com.parse.PushService;

import com.parse.ParseUser;

import android.app.Application;
import android.content.Context;

public class ParseApplication {

	
	private static final String APPLICATION_ID = "b6Aq0s7gZq2XK79XJJMxCJu2GAi8FAarj2X3QRXS";
	private static final String CLIENT_KEY = "nbVoZs1qjWcOCMk4ztIQP0pZzIXPamBk4gfuT0bH";

	public static void registerPushNotification(Context context) {

		// Add your initialization code here
		Parse.initialize(context, APPLICATION_ID, CLIENT_KEY);

		ParseUser.enableAutomaticUser();
		ParseACL defaultACL = new ParseACL();

		// If you would like all objects to be private by default, remove this
		// line.
		defaultACL.setPublicReadAccess(true);

		ParseACL.setDefaultACL(defaultACL, true);
	}
	
	public static void exePushNotification(Context context){
        // inform the Parse Cloud that it is ready for notifications
        PushService.setDefaultPushCallback(context, WhyqMain.class);
        ParseInstallation.getCurrentInstallation().saveInBackground();
	}
}
