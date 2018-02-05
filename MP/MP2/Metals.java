/* Author - Catalin Alexandru
Mini Project
*/

import java.util.*; // it imports the entire java util library and makes it available to use

public class Metals
{
    protected String MetalName;
    protected double MetalValue;
    public Metals()
    {
    }   
    public Metals(String name, double value)
    {
        MetalName = name;
        MetalValue = value;
    }   
    public String getMetalName()
    {
        return MetalName;
    }
    public double getMetalValue()
    {
        return MetalValue;
    }
    public void setMetalsVAlue(double value)
    {
        MetalValue = value;
    }
}