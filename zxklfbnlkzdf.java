
/**
 * Beschreiben Sie hier die Klasse zxklfbnlkzdf.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class zxklfbnlkzdf
{
    Arbeit2 a;
    LISTE l;
    zxklfbnlkzdf()
    {
        a = new Arbeit2();
        l = a.GiveList(); 
    }
    
    private boolean isValidRecursive(KNOTEN k)
    {
       if (k.NachfolgerGeben() == null)
       {
           return true;
        }else {
            String hash = k.DatenelementGeben().HashAusgeben();
            String hash2 = k.NachfolgerGeben().DatenelementGeben().PreviousHashAusgeben();
            if (hash2 != hash)
            {
                return false;
            }
            return isValidRecursive(k.NachfolgerGeben());
        }
    }
    public boolean isValid()
    {
        return isValidRecursive(l.anfangGeben());
    }
}

