package pn202.mar01;

public class Name {
    private String title;
    private String firstName;
    private String middleName;
    private String lastName;
    private String extention;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getExtention() {
        return extention;
    }

    public void setExtention(String extention) {
        this.extention = extention;
    }
    
    

    @Override
    public String toString() {
        return String.format("%s, %s", this.lastName, this.firstName);
    }
    
    
    //create your constructors and overload them
    //create your necessary setters and getters
    /**
     * Display name will print the name in the following format:
     * <title> <first name> <middle initial>. <last name> <extention>
     * Mr. Edrian B. Guanzon
     * Engr. Patrick Troy M. Elalto II
     */
    /**
     * override the toString() that will return a string equivalent 
     * Guanzon, Edrian B.
     * Elalto II, Patrick Troy M. 
     */
}
