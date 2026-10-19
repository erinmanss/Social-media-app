/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOPA2;

/**
 *
 * @author 50035329
 */
public class User {
    private int userID;
    private String  firstName;
    private String surname;
    private String dateOfBirth;
    private String email;
    private String password;
    private boolean locked;
    private String lastLogin;
    private String  registeredDate;
    private int friends;

 
    public User(int userID,String firstName,String surname,String dateOfBirth,String email,String password,String registeredDate){
    
        this.userID = userID;
        this.firstName = firstName;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        locked = false;
        lastLogin = " ";
        this.registeredDate = registeredDate;
        friends = 0;
        
}//construtor 
    public int getUserID() {
        return userID;
    }//getUserID

 
    public String getFirstName() {
        return firstName;
    }//getFname

   
  
    public String getSurname() {
        return surname;
    }//getsurname


  
    public String getDateOfBirth() {
        return dateOfBirth;
    }//getDOB

   
    public String getEmail() {
        return email;
    }//get Email


    
    public String getPassword() {
        return password;
    }//get password

    public boolean getLocked() {
        return locked;
    }//locked
  

  
    public String getLastLogin() {
        return lastLogin;
    }//get Last login

   
    public String getRegisteredDate() {
        return registeredDate;
    }//get reg date

  
    public int getFriends() {
        return friends;
    }// Friend count 
    
    public String getDetails()
    {
        String details = "<html>Users info<br>";
        details += "UserID: " + userID + "<br>";
        details += "Name: " + firstName + " " + surname + "<br>";
        details += "DOB: " + dateOfBirth +  "<br>";
        details += "Email : " + email + "<br>";
        details += "Locked : " + locked + "<br>";
        details += "Last Login : " + this.getLastLogin() + "<br>";
        details += "RegDate : " + registeredDate + "<br>";
        details += "Friends: " + friends + "<br>";
        return details;
        
    }//getDetails

    /**
     * @param locked the locked to set
     */
    public void isLocked(boolean locked) {
        this.locked = locked;
    }
    
        public void setLocked(boolean yn) {
        locked = yn;
    }
    
    public String basicInfo()

            {

                return userID+ "  " + this.firstName + "   " + surname;

            }

    /**
     * @param lastLogin the lastLogin to set
     */
    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    /**
     * @param friends the friends to set
     */
    public void setFriends(int friends) {
        this.friends = friends;
    }
    
}//end of class 

