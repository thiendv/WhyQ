
package whyq.utils;
public class API {

	
	public static final String hostURL = "http://v2.whyq.net.au";//"http://permping.com/services";
	
	public static final String popularBusinessListURL = hostURL + "/m/business";
	public static final String searchBusinessListURL = hostURL + "/m/business";
	public static final String authorizeURL    = hostURL + "/m/login";
	public static final String createAccountURL = hostURL + "/m/register";//"/userservice/createaccount";

	public static final String xmlSample = "<popularPerms> <item> <permId>810</permId> <permDesc></permDesc> <permCategory>130</permCategory> <permImage>http://permping.autwin.com/Permping/public/pinimages/thumb/1332250225.jpg</permImage> <permComments> <comment/> </permComments> <permRepinCount>0</permRepinCount> <permLikeCount>0</permLikeCount> <permCommentCount>0</permCommentCount> <user> <userId>118</userId> <userName>demo</userName> <status>2</status> <userAvatar>http://permping.autwin.com/Permping/public/profileimages/smallthumb/user-img.jpg</userAvatar> </user> </item> <item> <permId>809</permId> <permDesc></permDesc> <permCategory>130</permCategory> <permImage>http://permping.autwin.com/Permping/public/pinimages/thumb/1332250146.jpg</permImage> <permComments> <comment/> </permComments> <permRepinCount>0</permRepinCount> <permLikeCount>0</permLikeCount> <permCommentCount>0</permCommentCount> <user> <userId>118</userId> <userName>demo</userName> <status>2</status> <userAvatar>http://permping.autwin.com/Permping/public/profileimages/smallthumb/user-img.jpg</userAvatar> </user> </item> <item> <permId>800</permId> <permDesc></permDesc> <permCategory>122</permCategory> <permImage>http://permping.autwin.com/Permping/public/pinimages/thumb/1332248989.jpg</permImage> <permComments> <comment/> </permComments> <permRepinCount>0</permRepinCount> <permLikeCount>0</permLikeCount> <permCommentCount>0</permCommentCount> <user> <userId>116</userId> <userName>rock</userName> <status>2</status> <userAvatar>http://permping.autwin.com/Permping/public/profileimages/smallthumb/user-img.jpg</userAvatar> </user> </item> <item> <permId>805</permId> <permDesc></permDesc> <permCategory>129</permCategory> <permImage>http://permping.autwin.com/Permping/public/pinimages/thumb/1332249872.jpg</permImage> <permComments> <comment/> </permComments> <permRepinCount>0</permRepinCount> <permLikeCount>0</permLikeCount> <permCommentCount>0</permCommentCount> <user> <userId>118</userId> <userName>demo</userName> <status>2</status> <userAvatar>http://permping.autwin.com/Permping/public/profileimages/smallthumb/user-img.jpg</userAvatar> </user> </item> <item> <permId>793</permId> <permDesc>nice not?</permDesc> <permCategory>112</permCategory> <permImage>http://permping.autwin.com/Permping/public/pinimages/thumb/1332248535.jpg</permImage> <permComments> <comment/> </permComments> <permRepinCount>0</permRepinCount> <permLikeCount>0</permLikeCount> <permCommentCount>0</permCommentCount> <user> <userId>114</userId> <userName>mia</userName> <status>2</status> <userAvatar>http://permping.autwin.com/Permping/public/profileimages/smallthumb/user-img.jpg</userAvatar> </user> </item> <item> <permId>791</permId> <permDesc></permDesc> <permCategory>111</permCategory> <permImage>http://permping.autwin.com/Permping/public/pinimages/thumb/1332244475.jpg</permImage> <permComments> <comment/> </permComments> <permRepinCount>0</permRepinCount> <permLikeCount>0</permLikeCount> <permCommentCount>0</permCommentCount> <user> <userId>113</userId> <userName>avi</userName> <status>2</status> <userAvatar>http://permping.autwin.com/Permping/public/profileimages/smallthumb/user-img.jpg</userAvatar> </user> </item> <item> <permId>811</permId> <permDesc></permDesc> <permCategory>129</permCategory> <permImage>http://permping.autwin.com/Permping/public/pinimages/thumb/1332302594.jpg</permImage> <permComments> <comment> <user> <userId>113</userId> <userName>avi</userName> <status>2</status> <userAvatar>http://permping.autwin.com/Permping/public/profileimages/smallthumb/user-img.jpg</userAvatar> </user> <content>poor..twoods</content> </comment> <comment> <user> <userId>114</userId> <userName>mia</userName> <status>2</status> <userAvatar>http://permping.autwin.com/Permping/public/profileimages/smallthumb/user-img.jpg</userAvatar> </user> <content>hellow</content> </comment> <comment> <user> <userId>113</userId> <userName>avi</userName> <status>2</status> <userAvatar>http://permping.autwin.com/Permping/public/profileimages/smallthumb/user-img.jpg</userAvatar> </user> <content>so funny...</content> </comment> </permComments> <permRepinCount>0</permRepinCount> <permLikeCount>0</permLikeCount> <permCommentCount>3</permCommentCount> <user> <userId>118</userId> <userName>demo</userName> <status>2</status> <userAvatar>http://permping.autwin.com/Permping/public/profileimages/smallthumb/user-img.jpg</userAvatar> </user> </item> <item> <permId>797</permId> <permDesc>Hottie</permDesc> <permCategory>116</permCategory> <permImage>http://permping.autwin.com/Permping/public/pinimages/thumb/1332248786.jpg</permImage> <permComments> <comment/> </permComments> <permRepinCount>0</permRepinCount> <permLikeCount>0</permLikeCount> <permCommentCount>0</permCommentCount> <user> <userId>115</userId> <userName>neon</userName> <status>2</status> <userAvatar>http://permping.autwin.com/Permping/public/profileimages/smallthumb/user-img.jpg</userAvatar> </user> </item> <item> <permId>798</permId> <permDesc></permDesc> <permCategory>120</permCategory> <permImage>http://permping.autwin.com/Permping/public/pinimages/thumb/1332248874.jpg</permImage> <permComments> <comment/> </permComments> <permRepinCount>0</permRepinCount> <permLikeCount>0</permLikeCount> <permCommentCount>0</permCommentCount> <user> <userId>116</userId> <userName>rock</userName> <status>2</status> <userAvatar>http://permping.autwin.com/Permping/public/profileimages/smallthumb/user-img.jpg</userAvatar> </user> </item> <item> <permId>804</permId> <permDesc></permDesc> <permCategory>125</permCategory> <permImage>http://permping.autwin.com/Permping/public/pinimages/thumb/1332249385.jpg</permImage> <permComments> <comment/> </permComments> <permRepinCount>0</permRepinCount> <permLikeCount>0</permLikeCount> <permCommentCount>0</permCommentCount> <user> <userId>117</userId> <userName>nancy</userName> <status>2</status> <userAvatar>http://permping.autwin.com/Permping/public/profileimages/smallthumb/user-img.jpg</userAvatar> </user> </item> <item> <permId>794</permId> <permDesc></permDesc> <permCategory>114</permCategory> <permImage>http://permping.autwin.com/Permping/public/pinimages/thumb/1332248576.jpg</permImage> <permComments> <comment/> </permComments> <permRepinCount>0</permRepinCount> <permLikeCount>0</permLikeCount> <permCommentCount>0</permCommentCount> <user> <userId>114</userId> <userName>mia</userName> <status>2</status> <userAvatar>http://permping.autwin.com/Permping/public/profileimages/smallthumb/user-img.jpg</userAvatar> </user> </item> <item> <permId>795</permId> <permDesc>cutie</permDesc> <permCategory>114</permCategory> <permImage>http://permping.autwin.com/Permping/public/pinimages/thumb/1332248619.jpg</permImage> <permComments> <comment/> </permComments> <permRepinCount>0</permRepinCount> <permLikeCount>0</permLikeCount> <permCommentCount>0</permCommentCount> <user> <userId>114</userId> <userName>mia</userName> <status>2</status> <userAvatar>http://permping.autwin.com/Permping/public/profileimages/smallthumb/user-img.jpg</userAvatar> </user> </item> <item> <permId>796</permId> <permDesc>wow</permDesc> <permCategory>116</permCategory> <permImage>http://permping.autwin.com/Permping/public/pinimages/thumb/1332248727.jpg</permImage> <permComments> <comment/> </permComments> <permRepinCount>0</permRepinCount> <permLikeCount>0</permLikeCount> <permCommentCount>0</permCommentCount> <user> <userId>115</userId> <userName>neon</userName> <status>2</status> <userAvatar>http://permping.autwin.com/Permping/public/profileimages/smallthumb/user-img.jpg</userAvatar> </user> </item> <item> <permId>803</permId> <permDesc></permDesc> <permCategory>125</permCategory> <permImage>http://permping.autwin.com/Permping/public/pinimages/thumb/1332249258.jpg</permImage> <permComments> <comment/> </permComments> <permRepinCount>0</permRepinCount> <permLikeCount>0</permLikeCount> <permCommentCount>0</permCommentCount> <user> <userId>117</userId> <userName>nancy</userName> <status>2</status> <userAvatar>http://permping.autwin.com/Permping/public/profileimages/smallthumb/user-img.jpg</userAvatar> </user> </item> <item> <permId>799</permId> <permDesc></permDesc> <permCategory>123</permCategory> <permImage>http://permping.autwin.com/Permping/public/pinimages/thumb/1332248940.jpg</permImage> <permComments> <comment/> </permComments> <permRepinCount>0</permRepinCount> <permLikeCount>0</permLikeCount> <permCommentCount>0</permCommentCount> <user> <userId>116</userId> <userName>rock</userName> <status>2</status> <userAvatar>http://permping.autwin.com/Permping/public/profileimages/smallthumb/user-img.jpg</userAvatar> </user> </item> <item> <permId>802</permId> <permDesc></permDesc> <permCategory>124</permCategory> <permImage>http://permping.autwin.com/Permping/public/pinimages/thumb/1332249236.jpg</permImage> <permComments> <comment/> </permComments> <permRepinCount>0</permRepinCount> <permLikeCount>0</permLikeCount> <permCommentCount>0</permCommentCount> <user> <userId>117</userId> <userName>nancy</userName> <status>2</status> <userAvatar>http://permping.autwin.com/Permping/public/profileimages/smallthumb/user-img.jpg</userAvatar> </user> </item> <item> <permId>808</permId> <permDesc></permDesc> <permCategory>130</permCategory> <permImage>http://permping.autwin.com/Permping/public/pinimages/thumb/1332250069.jpg</permImage> <permComments> <comment/> </permComments> <permRepinCount>0</permRepinCount> <permLikeCount>0</permLikeCount> <permCommentCount>0</permCommentCount> <user> <userId>118</userId> <userName>demo</userName> <status>2</status> <userAvatar>http://permping.autwin.com/Permping/public/profileimages/smallthumb/user-img.jpg</userAvatar> </user> </item> <item> <permId>792</permId> <permDesc></permDesc> <permCategory>115</permCategory> <permImage>http://permping.autwin.com/Permping/public/pinimages/thumb/1332248500.jpg</permImage> <permComments> <comment/> </permComments> <permRepinCount>0</permRepinCount> <permLikeCount>0</permLikeCount> <permCommentCount>0</permCommentCount> <user> <userId>114</userId> <userName>mia</userName> <status>2</status> <userAvatar>http://permping.autwin.com/Permping/public/profileimages/smallthumb/user-img.jpg</userAvatar> </user> </item> <item> <permId>801</permId> <permDesc></permDesc> <permCategory>120</permCategory> <permImage>http://permping.autwin.com/Permping/public/pinimages/thumb/1332249053.jpg</permImage> <permComments> <comment/> </permComments> <permRepinCount>0</permRepinCount> <permLikeCount>0</permLikeCount> <permCommentCount>0</permCommentCount> <user> <userId>116</userId> <userName>rock</userName> <status>2</status> <userAvatar>http://permping.autwin.com/Permping/public/profileimages/smallthumb/user-img.jpg</userAvatar> </user> </item> <item> <permId>807</permId> <permDesc></permDesc> <permCategory>130</permCategory> <permImage>http://permping.autwin.com/Permping/public/pinimages/thumb/1332250023.jpg</permImage> <permComments> <comment/> </permComments> <permRepinCount>0</permRepinCount> <permLikeCount>0</permLikeCount> <permCommentCount>0</permCommentCount> <user> <userId>118</userId> <userName>demo</userName> <status>2</status> <userAvatar>http://permping.autwin.com/Permping/public/profileimages/smallthumb/user-img.jpg</userAvatar> </user> </item> <item> <permId>806</permId> <permDesc></permDesc> <permCategory>130</permCategory> <permImage>http://permping.autwin.com/Permping/public/pinimages/thumb/1332249972.jpg</permImage> <permComments> <comment/> </permComments> <permRepinCount>0</permRepinCount> <permLikeCount>0</permLikeCount> <permCommentCount>0</permCommentCount> <user> <userId>118</userId> <userName>demo</userName> <status>2</status> <userAvatar>http://permping.autwin.com/Permping/public/profileimages/smallthumb/user-img.jpg</userAvatar> </user> </item> </popularPerms> ";
	public static final String categoryListURL = hostURL + "/permservice/getcategories";
	public static final String boardListFromCategoryUrl = hostURL + "/permservice/getboardswithcategoryid/"; //Add category id when make request
	public static final String permListFromBoardUrl = hostURL + "/permservice/getpermwithboardid/"; //Add board id when make request
	public static final String addNewPermUrl = hostURL + "/permservice/uploadperm";
	public static final String repermUrl = hostURL + "/permservice/reperm";
	public static final String commentUrl = hostURL + "/permservice/comment";
	public static final String getProfileURL  = hostURL + "/userservice/getprofile/"; //Not implemented yet on server
	public static final String createBoardURL = hostURL + "/permservice/createboard";
	public static final String followingPerm = hostURL + "/permservice/getfollowingperm/"; //Add user id when make request
	public static final String permListFromCategory = hostURL + "/permservice/getpermwithcategoryid/"; //Add category id when make request
	public static final String likeURL = hostURL + "/permservice/like";
	public static final String getPermsByDate = hostURL + "/permservice/getpermwithdate/"; // Add the date as yyyy-dd-mm
	public static String getPermsByDateWithMonth = hostURL + "/permservice/getthirdpermswithmonth/"; // Add the date as yyyy-dd-mm
	public static final String logoutURL = hostURL + "/userservice/logout/";
	public static final String getNewPerm = hostURL + "/permservice/getnewperm";
	public static final String follow  = hostURL + "/userservice/followuser";
	public static final String deleteUrl  = hostURL + "/permservice/delete";
	
}
