/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package foodorderingsystem;

/**
 *
 * @author Sera
 */
public class Student {
    private String firstName;
    private String userid;
    private String password;
    private String lastName;

    /**
     * @return the firstName
     */
    public Student(String firstName, String userid, String lastName,String password) {
        this.firstName = firstName;
        this.userid = userid;
        this.lastName = lastName;
        this.password=password;
    }


    public String getFirstName() {
        return firstName;
    }

    /**
     * @return the year
     */
    public String getuserid() {
        return userid;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }
    public String getpassword() {
        return password;
    }
    
}
