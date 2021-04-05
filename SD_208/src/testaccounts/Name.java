/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaccounts;

/**
 *
 * @author 2ndyrGroupB
 */
public class Name {

    private String title;
    private String firstName;
    private String middleName;
    private String lastName;
    private String extention;

    //Create your constructr and overload them
    //Create your necessary setter and getter
    public Name(){
    
    }
    
    public Name (String title,String firstName,String middleName, String lastName){
           this.setTitle(title);
           this.setFirstName(firstName);
           this.setMiddleName(middleName);
           this.setLastName(lastName);    
    }
     public Name (String title,String firstName,String middleName, String lastName, String extention){
            this.title = title;
            this.firstName = firstName;
            this.middleName = middleName;
            this.lastName = lastName;
            this.extention =extention;        
    }
    
    //Setter
    public void setTitle( String title){
        this.title = title;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setMiddleName(String middleName){
        this.middleName = middleName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setExtention(String extention){
        this.extention = extention;
    }
    
    //Getter
    public String getTitle(){
        return title;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getMiddleName(){
        
        return middleName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getExtention(){
        return extention;
    }
    
   

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s", title, firstName, middleName, lastName, this.extention == null?"":this.extention);  
    }
  
   
}
