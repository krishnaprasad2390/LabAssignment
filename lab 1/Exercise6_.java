import java.util.scanner;
public class Exercise6_
{
   public static int calculateDifference(int n)
   {
      int sum1,sum2,sum;
     
      sum1= (n*n+1)/2;

      sum2 = (n(n+1)(2n+1))/6;

      Sum = sum2 * sum2 - sum1 * sum1;

      return sum;
   }
    public static void main(String[] args)
    {
       System.out.println(Sum);
    }
}