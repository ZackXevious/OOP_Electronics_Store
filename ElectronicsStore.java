/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electronicsstore;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Zachary Kirchens
 */
public class ElectronicsStore implements Serializable{

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException 
    {
        Scanner kb=new Scanner(System.in);
        /*UserList users=new UserList();
        users.saveUsers();
        users=users.loadUsers();*/
        Inventory TV=new Inventory("TV");
        TV=TV.loadInventory();
        System.out.println(TV.getName());
        System.out.println(TV.getDescription());
        TV.addToInventory(new StoreObject("Television", "A standard television", 000001, 40.5, 10, 5));
        TV.saveInventory();
        //users=(UserList)loadChanges(users);
        // TODO code application logic here
    }
    
    /*public void CreateAccount(UserList uList)
    {
        String sFirstName="";
        String sLastName="";
        char cMiddleInitial=' ';
        String sGender="";
        String sPassword="";
        String sEmail="";
        int iPermissions=0;
        String sPayAccount="";
        //Getting the Actual Values
        System.out.println("Please Type Email Address>>");
        sEmail=kb.next();
        if(uList.Search(sEmail)!=null)
        {
            System.out.println("An account with this email already exists!");
        }
        else
        {
            System.out.println("Please Type Password>>");
            sPassword=kb.next();
            System.out.println("Please Type First Name>>");
            sFirstName=kb.next();
            System.out.println("Please Type Middle Initial>>");
            cMiddleInitial=kb.next().charAt(0);
            System.out.println("Please Type Last Name>>");
            sLastName=kb.next();
            System.out.println("Please Type Gender>>");
            sGender=kb.next();
            System.out.println("Please Type Paypal Account Name>>");
            sPayAccount=kb.next();
            iPermissions=0;
             uList.addAccount(new StandardAccount(sFirstName, sLastName, cMiddleInitial,
            sGender, sPassword, sEmail, iPermissions, sPayAccount));
        }
    }*/
    
}
