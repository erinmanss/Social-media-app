/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOPA2;

/**
 *
 * @author 50035329
 */
public class Friends {
    private int userID;
    private int friendID;
    private String date;

    public Friends(int userID, int friendID, String date) {
        this.userID = userID;
        this.friendID = friendID;
        this.date = date;



    }//constructor

    public int getFriendID() {
        return friendID;
    }

    /**
     * @return the userID
     */
    public int getUserID() {
        return userID;
    }

    /**
     * @param userID the userID to set
     */
    public void setUserID(int userID) {
        this.userID = userID;
    }

    /**
     * @param friendID the friendID to set
     */
    public void setFriendID(int friendID) {
        this.friendID = friendID;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }
    
    public String details()
    {
        return userID +  "  " + friendID;
    }
    
}//class
