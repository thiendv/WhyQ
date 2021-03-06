/**
 * 
 */
package whyq.handler;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

import whyq.model.TotalCount;
import whyq.model.UserProfile;


/**
 * @author Linh Nguyen
 *
 */
public class UserProfileHandler extends BaseHandler {
	
	// UserProfile constant
	private static final String TAG_ID = "id";
	private static final String TAG_EMAIL = "email";
	private static final String TAG_ROLE_ID = "role_id";
	private static final String TAG_IS_ACTIVE = "is_active";
	private static final String TAG_TWITTER_ID = "twitter_id";
	private static final String TAG_FACEBOOK_ID = "facebook_id";
	private static final String TAG_TOKEN = "token";
	private static final String TAG_STATUS = "status";
	private static final String TAG_CREATEDATE = "createdate";
	private static final String TAG_UPDATEDATE = "updatedate";
	private static final String TAG_FIRST_NAME = "first_name";
	private static final String TAG_LAST_NAME = "last_name";
	private static final String TAG_BIO = "bio";
	private static final String TAG_GENDER = "gender";
	private static final String TAG_AVATAR = "avatar";
	private static final String TAG_CITY = "city";
	private static final String TAG_ADDRESS = "address";
	private static final String TAG_PHONE_NUMBER = "phone_number";
	private static final String TAG_PAYPAL_EMAIL = "paypal_email";
	private static final String TAG_STATUS_USER = "status_user";
	private static final String TAG_TOTAL_COUNT = "total_count";

	// TotalCount constant
	private static final String TAG_TOTAL_MONEY = "total_money";
	private static final String TAG_TOTAL_SAVING_MONEY = "total_saving_money";
	private static final String TAG_TOTAL_COMMENT_LIKE = "total_comment_like";
	private static final String TAG_TOTAL_COMMENT = "total_comment";
	private static final String TAG_TOTAL_FRIEND = "total_friend";
	private static final String TAG_TOTAL_FAVOURITE = "total_favourite";
	private static final String TAG_TOTAL_CHECK_BILL = "total_check_bill";
	private static final String TAG_TOTAL_PLACE_CHECK_BILL = "total_place_check_bill";

	
	private UserProfile user = new UserProfile();
	private TotalCount totalCount = new TotalCount();
	
	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {

		if (totalCount != null) {
			if (localName.equals(TAG_TOTAL_CHECK_BILL)) {
				totalCount.setTotal_check_bill(getInt());
			} else if (localName.equals(TAG_TOTAL_COMMENT)) {
				totalCount.setTotal_comment(getInt());
			}  else if (localName.equals(TAG_TOTAL_COMMENT_LIKE)) {
				totalCount.setTotal_comment_like(getInt());
			}  else if (localName.equals(TAG_TOTAL_FAVOURITE)) {
				totalCount.setTotal_favourite(getInt());
			}  else if (localName.equals(TAG_TOTAL_FRIEND)) {
				totalCount.setTotal_friend(getInt());
			} else if (localName.equals(TAG_TOTAL_MONEY)) {
				totalCount.setTotal_money(getString());
			} else if (localName.equals(TAG_TOTAL_PLACE_CHECK_BILL)) {
				totalCount.setTotal_place_check_bill(getInt());
			} else if (localName.equals(TAG_TOTAL_SAVING_MONEY)) {
				totalCount.setTotal_saving_money(getString());
			}
		}
		
		if (user != null) {
			if (localName.equals(TAG_TOTAL_COUNT)) {
				user.setTotal_count(totalCount);
			}  else if (localName.equals(TAG_ADDRESS)) {
				user.setAddress(getString());
			} else if (localName.equals(TAG_AVATAR)) {
				user.setAvatar(getString());
			} else if (localName.equals(TAG_BIO)) {
				user.setBio(getString());
			} else if (localName.equals(TAG_CITY)) {
				user.setCity(getString());
			} else if (localName.equals(TAG_CREATEDATE)) {
				user.setCreatedate(getString());
			} else if (localName.equals(TAG_EMAIL)) {
				user.setEmail(getString());
			}  else if (localName.equals(TAG_FACEBOOK_ID)) {
				user.setFacebook_id(getString());
			} else if (localName.equals(TAG_FIRST_NAME)) {
				user.setFirst_name(getString());
			} else if (localName.equals(TAG_LAST_NAME)) {
				user.setLast_name(getString());
			} else if (localName.equals(TAG_GENDER)) {
				user.setGender(getString());
			} else if (localName.equals(TAG_ID)) {
				user.setId(getString());
			}
		}
		builder.setLength(0);
	}
	
	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		super.startElement(uri, localName, qName, attributes);
		if (localName.equals("user")) {
			user = new UserProfile();
		} else if (localName.equals(TAG_TOTAL_COUNT)) {
			totalCount = new TotalCount();
		}
	}
	
	public UserProfile getUser() {
		return user;
	}
	
}
