/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronicsstore;

/**
 *
 * @author Zachary Kirchens
 */
public class AdminAccount extends Account
{
    //Variables-----------------------------------------------------------------
    String title;
    
    
    //Constructors--------------------------------------------------------------
    public AdminAccount()
    {
        super();
        this.setPermissions(1);
        this.setTitle("Intern");
    }
    public AdminAccount(String sFirstName, String sLastName, char cMiddleInitial,
            String sGender, String sPassword, String sEmail, String sTitle)
    {
        super(sFirstName, sLastName, cMiddleInitial, sGender, sPassword, sEmail);
        this.setPermissions(1);
        this.setTitle(sTitle);
        
    }
    
    
    //Mutators------------------------------------------------------------------
    public void setTitle(String sTitle)
    {
        title=sTitle;
    }
    
    
    //Accessors-----------------------------------------------------------------
    public String getTitle()
    {
        return title;
    }
}
