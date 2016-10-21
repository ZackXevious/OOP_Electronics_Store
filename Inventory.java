/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronicsstore;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Zachary Kirchens
 */
public class Inventory implements Serializable 
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
    public Inventory(String sName)
    {
        this.setName(sName);
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
    public StoreObject Search(String sSearch)
    {
        for(StoreObject item : inventoryList)
        {
            if(item.getName().contains(sSearch)
                    ||item.getDescription().contains(sSearch)
                    ||(""+item.getItemNumber()).contains(sSearch))//Check Name
                    {
                        return item;
                    }

        }
        return null;
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
    public String toString()
    {
        return String.format("%12s\n:", this.getName());
    }
    //FileSystem Interaction----------------------------------------------------
    public void saveInventory()
    {
        try
        {
            FileOutputStream fileOut=
                new FileOutputStream(new File(""+this.getName()+".ser"));
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(this);
            out.flush();
            out.close();
            fileOut.close();
        }catch(IOException i){
            System.out.println("Could Not Write file");
            i.printStackTrace();
        }
    }
    public Inventory loadInventory()
    {
                try
        (FileInputStream fileIn = new FileInputStream(""+this.getName()+".ser"); 
                ObjectInputStream in = new ObjectInputStream(fileIn)) {
            return (Inventory)in.readObject();
        }
        catch(IOException i)
        {
            System.out.println("Could Not Load File");
        }
        catch(ClassNotFoundException c)
        {
            System.out.println("Class not found");
        }
        return null;
    }
    
}
