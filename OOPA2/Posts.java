/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOPA2;

/**
 *
 * @author 50035329
 */
public class Posts {
        private int postID;
    private int userID;
    private String postSecurity;
    private String date;

  public Posts(int postID, int userID, String postSecurity, String date ){
      this.postID = postID;
      this.userID = userID;
      this.postSecurity = postSecurity;
      this.date = date;
      
  }//construtor 
  
      public String getPostDetails() {
        String details = "<html>Post Details<br>";
        details += "Post ID: " + getPostID() + "<br>";
        details += "User ID: " + getUserID() + "<br>";
        details += "Security status: " + postSecurity + "<br>";
        details += "Date posted: " + getDate() + "<br>";
        return details;

    }//PostDetails
    public int getPostID() {
        return postID;
    }//get post ID

  
    public int getUserID() {
        return userID;
    }//Get User ID

    
    public String getPostSecurity() {
        return postSecurity;
    }//get Post Security public or private 

   
    //public void setPostSecurity(boolean PostSecurity) {
        //this.postSecurity = PostSecurity;
    //}//set Post Security public or private 

    
    public String getDate() {
        return date;
    }//get date 

   
    public void setDate(String date) {
        this.date = date;
    }//set date 
    
}
    

