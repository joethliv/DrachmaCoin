
/**
 * Testklasse fuer die Liste
 */

import java.util.ArrayList;
import com.google.gson.GsonBuilder;




public class Arbeit2
{
    LISTE liste;
    DATENELEMENT p1;
    DATENELEMENT p2;
    DATENELEMENT p3;
    DATENELEMENT p4;
    int x =1;
    int a =0;
    
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
        
        // Liste fuellen
        
        p1 = new PATIENT2("Genesis Block", "0");
        p1.mineBlock(difficulty);
        liste.HintenEinfuegen(p1);
        System.out.println("Block "+x +" Created!!! Great Success!");
        x++;
        a++;
        
    
        
        
        p2 = new PATIENT2("1 Drachma, from Theodoros, to Joe" , liste.EndeDatei().HashAusgeben());
        p2.mineBlock(difficulty);
        liste.HintenEinfuegen(p2);
        System.out.println("Block "+x +" Created!!! Great Success!");
        x++;
        a++;
        
        p3 = new PATIENT2("15 Drachma, from Joe, to Tountas" , liste.EndeDatei().HashAusgeben());
        p3.mineBlock(difficulty);
        liste.HintenEinfuegen(p3);
        System.out.println("Block "+x +" Created!!! Great Success!");
        x++;
        a++;
        
        p4 = new PATIENT2("420 Drachma, from Joe, to Tountas" , liste.EndeDatei().HashAusgeben());
        p4.mineBlock(difficulty);
        liste.HintenEinfuegen(p4);
        System.out.println("Block "+x +" Created!!! Great Success!");
        x++;
        a++;
        
        
        
        
        
        
        
        
        
    }
    
    public void CreatAlot(int limit)
    {
        int templimit = limit;
        for (int i =0 ; i<limit;i++)
        {
            DATENELEMENT p5 = new PATIENT2("SMTH" , liste.EndeDatei().HashAusgeben());
            p5.mineBlock(difficulty);
            System.out.println("Block "+(x+i) +" Created!!! Great Success!");
            liste.HintenEinfuegen(p5);
        }
        x = liste.LaengeGeben() +1;
        
    }
    
    
    
    
}
