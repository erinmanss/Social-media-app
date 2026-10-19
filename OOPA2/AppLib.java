package OOPA2;

import java.util.ArrayList;
import java.time.*;
import java.time.format.*;

public class AppLib {

    public static Menu scrMenu;
    public static Login scrLogin;
    public static frmRegister scrRegister;
    public static frmMainMenu scrMainMenu;
    public static Splash scrSplash;
    public static ViewMyPosts scrViewMyPosts;
    public static ViewPublicPosts scrPublicPosts;
    public static frmAddPost frmAddpost;
    public static frmAddFriend frmAddFriend;
    public static ViewFriendsMenu frmViewFriendsMenu;
    public static ViewFriendsPosts frmFriendsPost;

    public static ArrayList usersAL = new ArrayList();
    public static ArrayList postsAL = new ArrayList();
    public static ArrayList friendsAL = new ArrayList();

    public static User loggedOn;

    public static String genDate() {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
        String dateStr = today.format(formatter);
        return dateStr;

    }//gendate

    public static String getDateTime() {
        LocalDateTime todayDT = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss");
        String dateTimeStr = todayDT.format(formatter);
        return dateTimeStr;
    }//gendateTime

    public static boolean isUniqueID(int id) {
        for (int index = 0; index < usersAL.size(); index++) {
            User auser = (User) usersAL.get(index);
            if (auser.getUserID() == id) {
                return false;
            }

        }//for loop

        return true;

    }//isUniqueID

    public static boolean isUniquePostID(int pid) {
        for (int index = 0; index < postsAL.size(); index++) {
            Posts post = (Posts) postsAL.get(index);
            if (post.getPostID() == pid) {
                return false;
            }

        }//for loop

        return true;

    }//isUniquePostId

    public static boolean validLogin(String email, String password) {
        for (int index = 0; index < usersAL.size(); index++) {
            User auser = (User) usersAL.get(index);
            if (auser.getEmail().equals(email) && auser.getPassword().equals(password)) {
                loggedOn = auser;
                loggedOn.setLastLogin(getDateTime());

                return true;
            }

        }//for loop

        return false;
    }
    
    public static Posts findPost(int pid){
          for (int index = 0; index < postsAL.size(); index++) {
            Posts post = (Posts) postsAL.get(index);
            if (post.getPostID() == pid) {
                return post;
            }

        }//for loop

        return null;

    }//find post
    
        public static User findUser(int uid){
          for (int index = 0; index < usersAL.size(); index++) {
            User foundUser = (User) usersAL.get(index);
            if (foundUser.getUserID()== uid) {
                return foundUser;
            }

        }//for loop

        return null;

    }//find user
        
        
        public static boolean friendAlready(int uid,int fid)
        {
            
            
            for (int index = 0; index < friendsAL.size(); index++)
            {
                
                Friends fr = (Friends)friendsAL.get(index);
                
               
                Friends frd = (Friends)friendsAL.get(index);
                if (frd.getUserID() == uid && frd.getFriendID() == fid)
                {
                    return true;
                }
            }
            return false;
        }


    public static void loadData() {
        User tmpUser = new User(3355, "Erin", "McManus", "23/11/04", "emcm@mail.com", "pwd", "09/05/26");
        tmpUser.setLocked(false);
        tmpUser.setFriends(0);
        tmpUser.setLastLogin("11/05/26");
        usersAL.add(tmpUser);
        tmpUser = new User(4242, "Zach", "Watson", "20/12/05", "ZWats@mail.com", "pwd", "09/05/26");
        tmpUser.setLocked(false);
        tmpUser.setFriends(0);
        tmpUser.setLastLogin("N/A");
        usersAL.add(tmpUser);
        tmpUser = new User(4944, "Jenny", "McALernon", "30/12/70", "JMcA@mail.com", "123", "09/05/26");
        tmpUser.setLocked(false);
        tmpUser.setFriends(0);
        tmpUser.setLastLogin("N/A");
        usersAL.add(tmpUser);
        tmpUser = new User(1007, "Bianca", "Silevu", "11/05/05", "Bianca@mail.com", "pass", "09/05/26");
        tmpUser.setLocked(false);
        tmpUser.setFriends(0);
        tmpUser.setLastLogin("N/A");
        usersAL.add(tmpUser);
        tmpUser = new User(8888, "Ted", "Bear", "12/10/01", "t@b.com", "pass", "07/05/26");
        tmpUser.setLocked(false);
        tmpUser.setFriends(0);
        tmpUser.setLastLogin("N/A");
        usersAL.add(tmpUser);

        Image imgPost;
        Text txtPost;

        imgPost = new Image(23456, 3355, "public", "08/05/26 11:54:20", "myfile.txt", "big file", "c:/temp");
        AppLib.postsAL.add(imgPost);
        txtPost = new Text(23467, 3355, "private", "08/05/26 11:54:30", "mary had dinner");
        AppLib.postsAL.add(txtPost);
        imgPost = new Image(23400, 4242, "public", "08/05/26 11:55:20", "myfile.txt", "big file", "c:/temp");
        AppLib.postsAL.add(imgPost);
        txtPost = new Text(23404, 4242, "private", "08/05/26 11:56:30", "mary had supper");
        AppLib.postsAL.add(txtPost);
        imgPost = new Image(23401, 4242, "public", "08/05/26 11:55:20", "yourfile.txt", "small file", "c:/temp");
        AppLib.postsAL.add(imgPost);
        txtPost = new Text(23444, 3355, "public", "08/05/26 11:56:30", "mary had breakfast");
        AppLib.postsAL.add(txtPost);
    }//loadData

}//class
