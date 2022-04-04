
/**
 * Testklasse fuer die Liste
 */

import java.util.ArrayList;
import com.google.gson.GsonBuilder;




public class ARBEIT
{
    LISTE liste;
    DATENELEMENT p1;
    DATENELEMENT p2;
    DATENELEMENT p3;
    DATENELEMENT p4;
    int x =1;
    
    public static int difficulty = 5;
    
    
    /**
     * Constructor for objects of class ARBEIT
     */
    public ARBEIT()
    {
        liste = new LISTE();
        
        // Liste fuellen
        
        p1 = new PATIENT2("Genesis Block", "0");
        p1.mineBlock(difficulty);
        liste.VorneEinfuegen(p1);
        System.out.println("Block "+x +" Created!!! Great Success!");
        x++;
        
    
        
        
        p2 = new PATIENT2("1 Drachma, from Theodoros, to Joe" , liste.EndeDatei().HashAusgeben());
        p2.mineBlock(difficulty);
        liste.VorneEinfuegen(p2);
        System.out.println("Block "+x +" Created!!! Great Success!");
        x++;
        
        p3 = new PATIENT2("15 Drachma, from Joe, to Tountas" , liste.EndeDatei().HashAusgeben());
        p3.mineBlock(difficulty);
        liste.VorneEinfuegen(p3);
        System.out.println("Block "+x +" Created!!! Great Success!");
        x++;
        
        p4 = new PATIENT2("420 Drachma, from Joe, to Tountas" , liste.EndeDatei().HashAusgeben());
        p4.mineBlock(difficulty);
        liste.VorneEinfuegen(p4);
        System.out.println("Block "+x +" Created!!! Great Success!");
        x++;
        
        
        
        
        
        
        
    }
    
    public void CreatAlot()
    {
        for (int i =0 ; i<10;i++)
        {
            DATENELEMENT p5 = new PATIENT2("SMTH" , liste.EndeDatei().HashAusgeben());
            p5.mineBlock(difficulty);
            liste.VorneEinfuegen(p5);
        }
    }
    
    
}
