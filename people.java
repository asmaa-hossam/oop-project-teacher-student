
package javaapplication8;


public class people {
    
   public static int idCounter=1;
   private String firstName ;
   private String lastName ;
    private String phoneNum;
    private String email;
    private int id;

    public people(String firstName, String lastName, String phoneNum, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNum = phoneNum;
        this.email = email;
        this.id = idCounter;
        idCounter++;
    }

    public  int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "people{" + "firstName=" + firstName + ", lastName=" + lastName + ", phoneNum=" + phoneNum + ", email=" + email + ", id=" + id + '}';
    }
    
    
    
}
