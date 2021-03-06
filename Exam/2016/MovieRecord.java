import java.util.*;

public class MovieRecord extends Record
{
    String genre;
    String[] keywords;

    public MovieRecord(String iid, int len, String gen, String[] keys )
    {
        super(iid, len);
        genre = gen;
        keywords = keys;
    }

    public String getGenre()
    {return genre;}
    
    public String[] getKeywords()
    {return keywords;}
    
    public int getRating()
    {
        for(int i=0; i<keywords.length; i++)
        {
            if(keywords[i].equals("violence"))
                return 16;
        }
        return 0;
    }
}
