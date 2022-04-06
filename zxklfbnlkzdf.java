
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
    
    public boolean isValid()
    {
        boolean result = true;
        KNOTEN k = l.anfangGeben();
        while (k.NachfolgerGeben() != null)
        {
            String hash;
            hash = k.DatenelementGeben().HashAusgeben();
            if (k.NachfolgerGeben() != null)
            {
                String hash2 = k.NachfolgerGeben().DatenelementGeben().PreviousHashAusgeben();
                if (hash2 != hash){
                    result = false;
                }
            }
        }
        return result;
    }
}

