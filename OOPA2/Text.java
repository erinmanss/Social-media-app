/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOPA2;

/**
 *
 * @author 50035329
 */
public class Text extends Posts {
    private String text;
    
    public Text(int postID, int userID, String postSecurity, String date, String text){
        super(postID, userID, postSecurity, date);
        this.text = text; 
        if(text.length()> 300)
            throw new 
        IllegalArgumentException("Text has exceeded 300 characters");
    }//constructor
    
    
    public String getPostDetails(){
        String details = "<html>Post Details<br>";
        details += "Post Text: " + getText() + "<br>";
        return details;
    }

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }
    

}//class
