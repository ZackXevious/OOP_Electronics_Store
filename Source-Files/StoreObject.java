/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Electronic Store
 * Class: Store Object
 * This class will set the descriptions of the objects
 * in the electronic store inventory.
 * To be implemented with class Inventory and the
 * membership classes.
 * @author Abraham Galaviz
 */
public class StoreObject {
    
    //variables
    private String name;
    private String description;
    private Integer itemNumber;
    private Double price;
    private Integer quantity;
    
    /*Default Constructor: This constructor sets a few default values for the 5 variables. 
        This is done by calling the mutator methods: 
        variable "name" is set to "name",(?)
        variable "description" is set to "description",(?)
        variable "itemNumber" is set to "itemNumber",(?)
        variable "price" is set to "price",(?)
        variable "quantity" is set to "quantity".(?)
    */
    public StoreObject()
    {
        this.setName(name);
        this.setDescription(description);
        this.setItemNumber(itemNumber);
        this.setPrice(price);
        this.setQuantity(quantity);
        /*"Overridable method in constructor" Not quite sure what to fix here.*/
        
    }
    /*Advanced Constructor: This constructor takes 5 arguments to set the 
        values for the 5 variables.  
        This is done by calling the mutator methods: 
        variable "name" is set to argument "sName", which is of type String,
        variable "description" is set to argument "sDescription", which is of type String,
        variable "itemNumber" is set to argument "iItemNumber", which is of type Integer,
        variable "price" is set to argument "dPrice", which is of type Double,
        variable "quantity" is set to argument "iQuantity", which is of type Integer.
    */
    public StoreObject(String sName, String sDescription, Integer iItemNumber, Double dPrice, Integer iQuantity)
    {
        this.setName(sName);
        this.setDescription(sDescription);
        this.setItemNumber(iItemNumber);
        this.setPrice(dPrice);
        this.setQuantity(iQuantity);
        /*"Overridable method in constructor" Same warning as before*/
    }
    
    
    //mutators
    //The "setName" Method: This method takes a String argument, "sName", 
    //which is then applied to the "name" variable.
    public void setName(String sName){
        name = sName;
    }
    
    //The "setDescription" Method: This method takes a String argument, "sDescription", 
    //which is then applied to the "description" variable.
    public void setDescription(String sDescription){
        description = sDescription;
    }
    
    //The "setItemNumber" Method: This method takes a String argument, "iItemNumber", 
    //which is then applied to the "itemNumber" variable.
    public void setItemNumber(Integer iItemNumber){
        itemNumber = iItemNumber;
    }
    
    //The "setPrice" Method: This method takes a String argument, "dPrice", 
    //which is then applied to the "price" variable.
    public void setPrice(Double dPrice){
        price = dPrice;
    }
    
    //The "setQuantity" Method: This method takes a String argument, "iQuantity", 
    //which is then applied to the "quantity" variable.
    public void setQuantity(Integer iQuantity){
        quantity = iQuantity;
    }
    
    
    
    //accessors
    //The "getName" Method: This method returns the value of the "name"
    //variable, which is of type String.
    public String getName()
    {
        return name;
    }
    
    //The "getDescription" Method: This method returns the value of the "description"
    //variable, which is of type String.
    public String getDescription()
    {
        return description;
    }
    
    //The "getItemNumber" Method: This method returns the value of the "itemNumber"
    //variable, which is of type Integer.
    public Integer getItemNumber()
    {
        return itemNumber;
    }
    
    //The "getPrice" Method: This method returns the value of the "price"
    //variable, which is of type Double.
    public Double getPrice()
    {
        return price;
    }
    
    //The "getQuantity" Method: This method returns the value of the "quantity"
    //variable, which is of type Integer.
    public Integer getQuantity()
    {
        return quantity;
    }

}
