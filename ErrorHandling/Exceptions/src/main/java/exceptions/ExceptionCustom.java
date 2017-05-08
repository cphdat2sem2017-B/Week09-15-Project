package exceptions;

public class ExceptionCustom extends Exception
{
    private double amount;

    public ExceptionCustom(double amount)
    {
       this.amount = amount;
    } 

    public double getAmount()
    {
       return amount;
    }
}
