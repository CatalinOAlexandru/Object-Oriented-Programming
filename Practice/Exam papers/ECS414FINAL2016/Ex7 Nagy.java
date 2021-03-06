import java.util.*;
import java.io.*;   

public class Ex7 {
    
    public static ArrayList<Record> readRecords(String fName) throws IOException{
        ArrayList<Record> a = new ArrayList<Record>();
        String line;
        String [] splitted = new String[2];
        try{
            BufferedReader inputstream = new BufferedReader(new FileReader(fName));
            while((line = inputstream.readLine()) !=null)
            {
                splitted = line.split(" ");
                a.add(new Record(splitted[0], Integer.parseInt(splitted[1])));
            }
            return a;
        }
        catch(IOException e)
        {
            System.out.println("Problem reading file: Error");
            return null;
        }
    }
      
    public static void main(String[] args) throws IOException{ //you can use this main method to test your code
        try{
            ArrayList<Record> result=readRecords("dati.txt");
                for (int i=0;i<result.size();i++){
                    System.out.print(result.get(i).getID()+" "+result.get(i).getLength()+" ");
                }
                System.out.println();
        }catch(Exception e){
            System.out.println("Error");
        }
    }
}