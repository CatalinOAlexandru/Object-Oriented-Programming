
public class Info
{
    // instance variables - replace the example below with your own
    private String capital;
    private int population;
    private String country;

    /**
     * Constructor for objects of class Info
     */
    public Info(String capital, int population, String country)
    {
        // initialise instance variables
        this.capital = capital;
        this.population = population;
        this.country = country;
    }
    
    public String getCapital()
    {
        return this.capital;
    }
    public void setCapital(String capital)
    {
        this.capital = capital;
    }
    public int getPopulation()
    {
        return this.population;
    }
    public void setPopulation(int population)
    {
        this.population = population;
    }
    public String getCountry()
    {
        return this.country;
    }
    public void setCountry(String country)
    {
        this.country = country;
    }
    
}
