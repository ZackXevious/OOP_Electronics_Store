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

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
public class StoreFront 
{
    //Variables:----------------------------------------------------------------
    Inventory InventoryLists[]=new Inventory[10];
    //Constructors:-------------------------------------------------------------
    public StoreFront()
    {
        
    }
    //Mutators:-----------------------------------------------------------------
    
    //Accessors:----------------------------------------------------------------
    /*public StoreObject search(String sSearch)
    {
        for(StoreObject item : inventoryList)
        {
            if((item.getName() != null //Name exists
                    && item.getName().contains(sSearch))//Check Name
            ||(item.getDescription() != null //Description exists
                    && item.getDescription().contains(sSearch)))//Check Description
                    {
                        return item;
                    }

        }
        return null;
    }*/
    //FileSystemInteraction:----------------------------------------------------
    public void loadAccounts()
    {
        
    }
    public void saveAccounts()
    {
        
    }
    public void loadInventory()
    {
        
    }
    public void saveInventory()
    {
        
    }
}
