/* Author - Catalin Alexandru
This file was created as a start template
*/

import java.util.*; // it imports the entire java util library and makes it available to use

public class StartTemplate
{  
  	// Program starting point
    public static void main (String[] param)
    {

    	System.exit(0);
    }   // END Main



    // a method which will allow me to print messages faster
    public static void Print(String p)
	{
		System.out.println(p);
		return;
	} // END Print

	// a method which will allow me to print numbers faster
	public static void PrintInt(int pi)
	{
		System.out.println(pi);
		return;
	} // END Print

	// a method which will allow me to get a string input from the user faster
	public static String InputString(String s)
	{
		Scanner scanner = new Scanner(System.in);
		Print(s);
		return scanner.nextLine();
	} // END Input String

	// a method which will allow me to get a integer input from the user faster
	public static int InputInt(String message)
	{
		Scanner scanner = new Scanner(System.in);
		Print(message);
		return Integer.parseInt(scanner.nextLine());
	} // END Input Integer

} // END class 