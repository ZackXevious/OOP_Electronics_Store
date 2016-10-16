/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronicsstore;

import java.util.ArrayList;

/**
 * Electronics Store
 * Class: StandardAccount
 * Description: (Type description here)
 * Notes: This is the superclass for the Geek account (GeekAccount.java), and
 * as such is a requirement for that class
 * @author(s) Zachary Kirchens 
 */
public class StandardAccount    //Class Name
        extends Account         //Super Class
{
    //Variables-----------------------------------------------------------------
    String paypalAccount;
    ArrayList<StoreObject> cart=new ArrayList<StoreObject>();
    ArrayList<StoreObject> history=new ArrayList<StoreObject>();
    
    
    //Constructors--------------------------------------------------------------
    public StandardAccount()
    {
        super();
        this.setPayPal("HerpDerp");
    }
    public StandardAccount(String sFirstName, String sLastName, char cMiddleInitial,
            String sGender, String sPassword, String sEmail, int iPermissions,
            String sPayAccount)
    {
        super(sFirstName, sLastName, cMiddleInitial, sGender, sPassword, sEmail, iPermissions);
        this.setPayPal(sPayAccount);
    }
    
    
    //Mutators------------------------------------------------------------------
    public void setPayPal(String sPayAccount)
    {/*The "setPayPal" Method: This method takes a String argument, 
        "sPayAccount", which is then applied to the "paypalAccount" variable*/
        paypalAccount=sPayAccount;
    }
    public void addToCart(StoreObject item)
    {/*The "addToCart" Method: This method takes a StoreObject argument, "item",
        which is then added to the "cart" ArrayList object using said object's 
        "remove" method*/
        cart.add(item);
    }
    public void removeFromCart(StoreObject item)
    {/*The "removeFromCart" Method: This method takes a StoreObject argument, 
        "item", which is then removed from the "cart" ArrayList object, using 
        said object's "remove" method*/
        cart.remove(item);
    }
    public void clearCart()
    {/*The "clearCart" Method: This method clears all the the objects from the
        "cart" Arraylist object, using said object's "clear" method*/
        cart.clear();
    }
    public void makePurchase()
    {/*The "makePurchase" Method: This method adds all the StoreObject objects 
        to the "history" ArrayList, using said object's "addAll" method. Then
        the paypal account is "used", and the "clearCart" method is called*/
        history.addAll(cart);
        System.out.println("A purchase was made");
        this.clearCart();
    }
    //Accessors-----------------------------------------------------------------
    public String getHistory()
    {/*The "getHistory" Method: This method returns a list of all the 
        StoreObject objects contained in the ArrayList "history". This is done 
        by looping through the ArrayList and agregating the names of each of the
        objects inside the "history" ArrayList*/
        String end="";
        for(int x=0; x<history.size(); x++)
        {
            end+=history.get(x).getName()+" ";
        }
        return end;
    }
}
