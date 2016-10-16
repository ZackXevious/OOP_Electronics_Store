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
    ArrayList<StoreObject> TV=new ArrayList<StoreObject>();
    ArrayList<StoreObject> CellPhone=new ArrayList<StoreObject>();
    ArrayList<StoreObject> Wearables=new ArrayList<StoreObject>();
    ArrayList<StoreObject> PC_Accessories=new ArrayList<StoreObject>();
    ArrayList<StoreObject> VideoGameConsoles=new ArrayList<StoreObject>();
    ArrayList<StoreObject> Cameras=new ArrayList<StoreObject>();
    ArrayList<StoreObject> Speakers=new ArrayList<StoreObject>();
    ArrayList<StoreObject> CarElectronics=new ArrayList<StoreObject>();
    ArrayList<StoreObject> MusicalInstruments=new ArrayList<StoreObject>();
    ArrayList<StoreObject> OfficeElectronics=new ArrayList<StoreObject>();
    
    
    //Constructors--------------------------------------------------------------
    public Inventory()
    {
        
    }
    
    
    //Mutators------------------------------------------------------------------
    //TV:
    public void addToTV(StoreObject item)
    {/*The "addToCart" Method: This method takes a StoreObject argument, "item",
        which is then added to the "TV" ArrayList object using said object's 
        "remove" method*/
        TV.add(item);
    }
    public void removeFromTV(StoreObject item)
    {/*The "removeFromCart" Method: This method takes a StoreObject argument, 
        "item", which is then removed from the "TV" ArrayList object, using 
        said object's "remove" method*/
        TV.remove(item);
    }
    //Cellphone:
    public void addTo CellPhone (StoreObject item)
    {/*The "addToCart" Method: This method takes a StoreObject argument, "item",
        which is then added to the "CellPhone" ArrayList object using said 
        object's "remove" method*/
        CellPhone.add(item);
    }
    public void removeFrom _(StoreObject item)
    {/*The "removeFromCart" Method: This method takes a StoreObject argument, 
        "item", which is then removed from the "" ArrayList object, using 
        said object's "remove" method*/
        _.remove(item);
    }
    ArrayList<StoreObject> CellPhone=new ArrayList<StoreObject>();
    ArrayList<StoreObject> Wearables=new ArrayList<StoreObject>();
    ArrayList<StoreObject> PC_Accessories=new ArrayList<StoreObject>();
    ArrayList<StoreObject> VideoGameConsoles=new ArrayList<StoreObject>();
    ArrayList<StoreObject> Cameras=new ArrayList<StoreObject>();
    ArrayList<StoreObject> Speakers=new ArrayList<StoreObject>();
    ArrayList<StoreObject> CarElectronics=new ArrayList<StoreObject>();
    ArrayList<StoreObject> MusicalInstruments=new ArrayList<StoreObject>();
    ArrayList<StoreObject> OfficeElectronics=new ArrayList<StoreObject>();
    
    
    //Accessors-----------------------------------------------------------------
}
