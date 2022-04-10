
/**
 * Testklasse fuer die Liste
 */

import java.util.ArrayList;
import com.google.gson.GsonBuilder;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.security.*;




public class Arbeit2 implements Serializable
{
    LISTE liste;
    LISTE liste2;
    DATENELEMENT p1;
    DATENELEMENT p2;
    DATENELEMENT p3;
    DATENELEMENT p4;
    int x =1;
    int a =0;
    public static Wallet walletA;
    public static Wallet walletB;
    
    public static int difficulty = 5;
    
    
    /**
     * Constructor for objects of class Arbeit2
     */
    public LISTE GiveList()
    {
        return liste;
    }
    public Arbeit2()
    {
        liste = new LISTE();
       
        //Verify the signature works and verify it from the public key
    
        
        // Liste fuellen
        
        p1 = new PATIENT2("Genesis Block", "0");
        p1.mineBlock(difficulty);
        liste.HintenEinfuegen(p1);
        System.out.println("Block "+x +" Created!!! Great Success!");
        x++;
        a++;
        
    
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    public void CreatAlot(double limit)
    {
        double templimit = limit;
        for (int i =0 ; i<limit;i++)
        {
            DATENELEMENT p5 = new PATIENT2("SMTH" , liste.EndeDatei().HashAusgeben());
            p5.mineBlock(difficulty);
            System.out.println("Block "+(x+i) +" Created!!! Great Success!");
            liste.HintenEinfuegen(p5);
        }
        double x = liste.LaengeGeben() +1;
        
    }
    public String MakeTransaction(String Sender, String Receiver, String Amount)
    
    {
        
        
        if(liste !=null)
        {
            DATENELEMENT p6 = new PATIENT2(Amount +" Drachma, from "+Sender+ ", to "+ Receiver , liste.EndeDatei().HashAusgeben());
            p6.mineBlock(difficulty);
            liste.HintenEinfuegen(p6);
            return "Transaction Sucessfull";
            
        
        }
        
        
        
        
        
        return "No transaction Made";
    }
    public void StoreFile()
    {
        liste.Write();
    }
        public void Write(String Namedata)
    {
        String fileName = Namedata;
        try{
        ObjectOutputStream os = new  ObjectOutputStream(new FileOutputStream(fileName));
        os.writeObject(liste);
        os.close();
        System.out.println("Save Successfull");
        }
        catch(FileNotFoundException e){
        e.printStackTrace();
        System.out.println("Did Not Save");
        }
        catch(IOException e)
        {
            e.printStackTrace();
            System.out.println("Did Not Save");

        }
        
        
    }
    public LISTE Read(String fileName)
    {
        
        try{
        ObjectInputStream is = new ObjectInputStream(new FileInputStream(fileName));
        LISTE s = (LISTE) is.readObject();
        System.out.println("read");
        
        
        is.close();
        liste2 = s;
        return s;
    }
        catch(FileNotFoundException e){
        e.printStackTrace();
        
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
                    e.printStackTrace();

            
        }
        
        
        return null;
    
    

    // getters and setters, toString() .... (omitted for brevity)
}
    public void Read()
    {
        LISTE n = liste.Read("data.bin");
        System.out.println(n.LaengeGeben());
    }
    
    
    
    
    
}
