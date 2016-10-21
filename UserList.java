package electronicsstore;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zachary Kirchens
 */
public class UserList //Class name
        implements Serializable //implemented interface
{
    //Variables-----------------------------------------------------------------
    private ArrayList<Account> listofAccounts;
    
    
    //Constructors--------------------------------------------------------------
    public UserList()
    {
        
    }
    
    
    //Mutators------------------------------------------------------------------
    public void addAccount(Account aUser)
    {
        
    }
    public void RemoveAccount(String sSearch, Account currAccount)
    {
        if (currAccount.getPermissions()>0)
        {
            listofAccounts.remove(this.Search(sSearch));
        }
        else
        {
            System.out.println("Insufficient permissions!");
        }
    }
    
    
    //Accessors-----------------------------------------------------------------
    public Account Search(String sSearch)
    {
        for(Account person : listofAccounts)
        {
            if(person.getEmail().contains(sSearch))//Check Name
                    {
                        return person;
                    }

        }
        return null;
    }
    //FileSystem Interaction----------------------------------------------------
    public void saveUsers()
    {
        try
        {
            FileOutputStream fileOut=
                new FileOutputStream(new File("uList.ser"));
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
    public UserList loadUsers()
    {
                try
        (FileInputStream fileIn = new FileInputStream("uList.ser"); 
                ObjectInputStream in = new ObjectInputStream(fileIn)) {
            return (UserList)in.readObject();
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
