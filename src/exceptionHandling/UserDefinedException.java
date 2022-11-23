package exceptionHandling;

class NegativeDimensionException extends Exception
{
    public String toString()
    {
        return "Dimensions of a Rectangle cannot be Negative";
    }
}

public class UserDefinedException {
    static int area(int l,int b) throws NegativeDimensionException
    {
        if(l<0 || b<0)
            throw new NegativeDimensionException();
        return l*b;
    }
    static void meth2() throws NegativeDimensionException
    {
        System.out.println("Area is "+area(10,-40));
    }
    public static void main(String[] args) {
        try {
            meth2();
        }
        catch (NegativeDimensionException e)
        {
            System.out.println(e);
        }
    }
}
