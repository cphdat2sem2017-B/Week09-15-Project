package exceptions;

import java.util.Arrays;

public class ExceptionsUnchecked
{
    public static void main(String[] args)
    {
        System.out.println("Program started");
        
        int[] TalArray = new int[5];
        String Tekst = null;
        
        //Unchecked exception
        //System.out.println(10 / 0); //Generates arithmetic exception
        //System.out.println(Integer.parseInt(Tekst)); //Generates numberformat exception
        //System.out.println(TalArray[8]); //Generates indexoutofboundsexception
        //System.out.println(Tekst.charAt(4)); //Generates nullpointerexception
                
        try
        {
            System.out.println("Enter try");
            
            //System.out.println(10 / 0); //Generates arithmetic exception
            //System.out.println(Integer.parseInt(Tekst)); //Generates numberformat exception
            //System.out.println(TalArray[8]); //Generates indexoutofboundsexception
            //System.out.println(Tekst.charAt(4)); //Generates nullpointerexception         
        }
        //catch (NumberFormatException | ArithmeticException Excep){}
        catch (ArithmeticException Excep)
        {
            System.out.println("Enter catch arithmetic");
            
            System.out.println(Excep.getMessage());
            System.out.println(Excep.getStackTrace());
            System.out.println(Arrays.toString(Excep.getStackTrace()));
        }
        catch (NumberFormatException Excep)
        {
            System.out.println("Enter catch numberformat");
            
            System.out.println(Excep.getMessage());
            System.out.println(Excep.getStackTrace());
            System.out.println(Arrays.toString(Excep.getStackTrace()));
        }
        catch (Exception Excep)
        {
            System.out.println("Enter catch general");
            
            System.out.println(Excep.getMessage());
            System.out.println(Excep.getStackTrace());
            System.out.println(Arrays.toString(Excep.getStackTrace()));
        }
        finally
        {
            System.out.println("Enter finally");
        }
        
        System.out.println("Program finished");
    }    
}