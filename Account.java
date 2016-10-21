/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronicsstore;

import java.io.Serializable;

/**
 * Electronics Store
 * Class: Account
 * Description: (Type description here)
 * Notes: This is the main superclass for all accounts in the Electronics store
 *      project, including: 
 *      the Standard account (StandardAccount.java), 
 *      the Geek account (GeekAccount.java), and
 *      the Admin account (AdminAccount.java).
 *  And as such is a requirement for those classes
 * @author(s) Zachary Kirchens 
 */
public class Account implements Serializable 
{
    //Variables-----------------------------------------------------------------
    private String firstName;
    private String lastName;
    private char middleInitial;
    private String gender;
    private String password;
    private String email;
    private int permissions;
    
    //Constructors--------------------------------------------------------------
    public Account()
    {/*Default Constructor: This Constructor sets a few default values for the 
        7 variables. 
        This is done by calling the mutator methods: 
        variable "firstName" is set to "John"
        variable "lastName" is set to "Doe"
        variable "middleInitial" is set to "F"
        variable "gender" is set to "Male"
        variable "password" is set to "1234567890"
        variable "email" is set to "JohnDoe@NotReal.com"
        variable "permissions" is set to 0*/
        this.setFirstName("John");
        this.setLastName("Doe");
        this.setMiddleInitial('F');
        this.setGender("Male");
        this.setPassword("1234567890");
        this.setEmail("JohnDoe@NotReal.com");
        this.setPermissions(0);
    }
    public Account(String sFirstName, String sLastName, char cMiddleInitial,
            String sGender,
            String sPassword, String sEmail)
    {/*Advanced Constructor: This Constructor takes 6 arguments to set the 
        values for the 7 variables.
        This is done by calling the mutator methods: 
        variable "firstName" is set to argument "sFirstName", which is of type 
        String
        variable "lastName" is set to argument "sLastName", which is of type 
        String
        variable "middleInitial" is set to argument "cMiddleInitial", which is 
        of type char
        variable "gender" is set to argument "sGender", which is of type String
        variable "password" is set to argument "sPassword", which is of type 
        String
        variable "permissions" is set to 0*/
        this.setFirstName(sFirstName);
        this.setLastName(sLastName);
        this.setMiddleInitial(cMiddleInitial);
        this.setGender(sGender);
        this.setPassword(sPassword);
        this.setEmail(sEmail);
        this.setPermissions(0);
    }
    
    
    //Mutators------------------------------------------------------------------
    public void setFirstName(String sFirstName)
    {/*The "setFirstName" Method: This method takes a String argument, 
        "sFirstName", which is then applied to the "firstName" variable*/
        firstName=sFirstName;
    }
    public void setLastName(String sLastName)
    {/*The "setLastName" Method: This method takes a String argument, 
        "sLastName", which is then applied to the "lastName" variable*/
        lastName=sLastName;
    }
    public void setMiddleInitial(char cMiddleInitial)
    {/*The "setMiddleInitial" Method: This method takes a char argument, 
        "cMiddleInitial", which is then applied to the "middleInitial" variable*/
        middleInitial=cMiddleInitial;
    }
    public void setGender(String sGender)
    {/*The "setGender" Method: This method takes a String argument, "sGender", 
        which is then applied to the "gender" variable*/
        gender=sGender;
    }
    public void setPassword(String sPassword)
    {/*The "setPassword" Method: This method takes a String argument, 
        "sPassword", which is then applied to the "password" variable*/
        password=sPassword;
    }
    public void setEmail(String sEmail)
    {/*The "setEmail" Method: This method takes a String argument, "sEmail", 
        which is then applied to the "email" variable*/
        email=sEmail;
    }
    protected void setPermissions(int iPermissions)
    {/*The "setPermissions" Method: This method takes an int argument, 
        "iPermissions", which is then applied to the "permissions" variable*/
        permissions=iPermissions;
    }
    
    
    //Accessors-----------------------------------------------------------------
    public String getName()
    {/*The "getName" Method: This method returns the combined values of the 
        "firstName, middleInitial, and lastName" variables, which, in total, 
        is of type String*/
        return firstName+" "+middleInitial+" "+lastName;
    }
    public String getPassword()
    {/*The "getPassword" Method: This method returns the value of the "password"
       variable, which is of type String*/
        return password;
    }
    public String getEmail()
    {/*The "getEmail" Method: This method returns the value of the "email" 
        variable, which is of type String*/
        return email;
    }
    public String toString()
    {/*The "toString" Method: This method combines and returns the results from
        the "getName", "getPassword", and "getEmail" methods, in a readable 
        format of type String*/
        return this.getName()+"\n"+this.getPassword()+"\n"+this.getEmail()+"\n";
    }
    public int getPermissions()
    {
        return permissions;
    }
}
