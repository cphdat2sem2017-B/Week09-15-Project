package exceptions;

import java.util.Arrays;

public class Exceptions
{
    public static void main(String[] args)
    {
        try
        {
            int result = 2 / 0;
            System.out.println("Unchecked");
        }
        catch(Exception ex)
        {
        }
        
        try
        {
            a();
            System.out.println("Checked");
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            //System.out.println(Excep.getMessage());
            //System.out.println("printStackTrace: " + ex.getStackTrace()[0].toString());
            //System.out.println("printStackTraceArrays" + Arrays.toString(ex.getStackTrace()));
        }
    }

    public static void a() throws Exception
    {
        b();
    }

    public static void b() throws Exception
    {
        throw new Exception();
    }
}
