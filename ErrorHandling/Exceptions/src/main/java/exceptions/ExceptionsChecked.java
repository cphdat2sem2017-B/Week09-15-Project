package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsChecked
{
    public static void main(String[] args)
    {
        System.out.println("Program started");
        
        File f = new File("Tekstfile.txt");
        
        try
        {
            System.out.println("Enter try");
            FileReader fr = new FileReader(f);
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("Enter catch");
            //Logger.getLogger(Excep.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            System.out.println("Enter finally");
        }
        
        System.out.println("Program finished");
    }
}
