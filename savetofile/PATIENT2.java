
/**
 * Beschreibung der Klasse PATIENT
 */
import java.lang.String.*;
import java.util.Date;
import java.lang.*;
import java.io.Serializable;
import java.io.IOException;
import java.io.*;



class PATIENT2 implements DATENELEMENT,Serializable
{
    /** Name des Patienten */
    private String name;
    public String hash;
    public String previousHash; 
    private String data; 
    private long Datum; 
    private int nonce;
    String p = "A";
    
    /**
    * Konstruktor des Patienten
    * @param s Name des Patienten
    */
    PATIENT2(String data,String previousHash)
    {
        name = p;
        this.data = data;
        this.previousHash = previousHash;
        this.Datum = new Date().getTime();
        
        this.hash = calculateHash();
    }
    
    public String calculateHash() {
        String calculatedhash =  previousHash +Long.toString(Datum) +Integer.toString(nonce) + data ;
                
        
        String sha256hex = org.apache.commons.codec.digest.DigestUtils.sha256Hex(calculatedhash);   


                
                
                
        
        return sha256hex;
    }
    
    
    public String HashAusgeben()
    {
        return hash;
    }
    
    public String PreviousHashAusgeben()
    {
        return previousHash;
    }
    
    //Increases nonce value until hash target is reached.
    public void mineBlock(int difficulty) {
        String target = StringUtil.getDificultyString(difficulty); //Create a string with difficulty * "0" 
        while(!hash.substring( 0, difficulty).equals(target)) {
            nonce ++;
            hash = calculateHash();
        }
        System.out.println("Block Mined!!! : " + hash);
    }

    
     /**
     * Gibt Information &uuml;ber den Patienten aus.
     */
    public void InformationAusgeben()
    {
        System.out.println(name);
    }

    
     /**
     * Gibt den Namen aus
     * @return Name des Patienten
     */
    public String NameGeben()
    {
        return hash;
    }
    
      /**
     * Vergleich zweier Datenelemente bez&uuml;glich einer Ordnungsrelation
     * @param dvergleich Datenelement zum Vergleich
     */
    public boolean IstKleinerAls(DATENELEMENT dvergleich)
    {
        PATIENT2 p = (PATIENT2) dvergleich;
        if(name.compareTo(p. NameGeben()) < 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

     /**
     * Identifikation eines Datenelements aufgrund seines Schl&uuml;ssels (Arzt)
     * @param s Schl&uuml;ssel vom Typ String
     */
    public boolean SchluesselIstGleich(String s)
    {
        if (name.compareTo(s) == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    
    
    
    
    
    
    
    
}
