/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronicsstore;

import java.util.ArrayList;

/**
 *
 * @author Zachary Kirchens
 */
public class Inventory 
{
    //Variables-----------------------------------------------------------------
    private String name;
    private String description;
    private ArrayList<StoreObject> inventoryList;
    
    
    //Constructors--------------------------------------------------------------
    public Inventory()
    {
        this.setName("Default");
        this.setDescription("A temporary, default inventory list");
        inventoryList=new ArrayList<StoreObject>();
    }
    public Inventory(String sName, String sDescription)
    {
        this.setName(sName);
        this.setDescription(sDescription);
        inventoryList=new ArrayList<StoreObject>();
    }
    
    
    //Mutators------------------------------------------------------------------
    public void setName(String sName)
    {
        name=sName;
    }
    public void setDescription(String sDescription)
    {
        description=sDescription;
    }
    public void addToInventory(StoreObject item)
    {/*The "addToInventory" Method: This method takes a StoreObject argument, 
        "item", which is then added to the "inventoryList" ArrayList object 
        using said object's "remove" method*/
        inventoryList.add(item);
    }
    public void removeFromInventory(StoreObject item)
    {/*The "removeFromInventory" Method: This method takes a StoreObject 
        argument, "item", which is then removed from the "inventoryList" 
        ArrayList object, using said object's "remove" method*/
        inventoryList.remove(item);
    }
    
    
    //Accessors-----------------------------------------------------------------
    public String getName()
    {
        return name;
    }
    
    public String getDescription()
    {
        return description;
    }
    public ArrayList<StoreObject> getList()
    {
        return inventoryList;
    }
    
}
