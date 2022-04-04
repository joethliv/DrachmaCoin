
/**
 * Beschreibung der Klasse PATIENT
 */
import java.lang.String.*;

class PATIENT implements DATENELEMENT
{
    /** Name des Patienten */
    private String name;
    
    /**
    * Konstruktor des Patienten
    * @param s Name des Patienten
    */
    PATIENT(String p)
    {
        name = p;
    }

    
     /**
     * Gibt Information &uuml;ber den Patienten aus.
     */
    public void InformationAusgeben()
    {
        System.out.println(name);
    }
    public void mineBlock(int difficulty) {
        
    }
    public String HashAusgeben()
    {
       return "a"; 
    }
    

    
     /**
     * Gibt den Namen aus
     * @return Name des Patienten
     */
    public String NameGeben()
    {
        return name;
    }
    
      /**
     * Vergleich zweier Datenelemente bez&uuml;glich einer Ordnungsrelation
     * @param dvergleich Datenelement zum Vergleich
     */
    public boolean IstKleinerAls(DATENELEMENT dvergleich)
    {
        PATIENT p = (PATIENT) dvergleich;
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
