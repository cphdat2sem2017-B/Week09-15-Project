package exceptions;

import java.io.IOException;
import java.util.Arrays;

public class ExceptionThrow
{
    public static void main(String[] args)
    {
        System.out.println("Program started");
        
        //throw new Exception();
        //throw new IOException();
        
        
        try
        {
            throw new ExceptionCustom(100);
        }
        catch (ExceptionCustom Excep)
        {
            System.out.println(Excep.getMessage());
            System.out.println(Excep.getStackTrace());
            System.out.println(Arrays.toString(Excep.getStackTrace()));
            System.out.println(Excep.getAmount());
        }
        
        
        System.out.println("Program finished");
    }
}
