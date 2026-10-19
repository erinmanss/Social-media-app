/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOPA2;

/**
 *
 * @author 50035329
 */
public class Image extends Posts {
    private String imgName;
    private String imgDescription;
    private String imgLocation;
    
    public Image (int postID, int userID, String postSecurity, String date, String imgName, String imgDescription, String imgLocation){
        super(postID, userID, postSecurity, date);
        this.imgName = imgName;
        this.imgDescription = imgDescription;
        this.imgLocation = imgLocation;
    }//constructor
    
    
    @Override
    public String getPostDetails() {
        String details = "<html>Post Details<br>";
        details += "Image Name: " + getImgName() + "<br>";
        details += "Description: " + getImgDescription() + "<br>";
        details += "Location : " + getImgLocation() + "<br>";
        return details;
    }// getpostdetails 

    /**
     * @return the imgName
     */
    public String getImgName() {
        return imgName;
    }

    /**
     * @param imgName the imgName to set
     */
    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    /**
     * @return the imgDescription
     */
    public String getImgDescription() {
        return imgDescription;
    }

    /**
     * @param imgDescription the imgDescription to set
     */
    public void setImgDescription(String imgDescription) {
        this.imgDescription = imgDescription;
    }

    /**
     * @return the imgLocation
     */
    public String getImgLocation() {
        return imgLocation;
    }

    /**
     * @param imgLocation the imgLocation to set
     */
    public void setImgLocation(String imgLocation) {
        this.imgLocation = imgLocation;
    }

}//class
