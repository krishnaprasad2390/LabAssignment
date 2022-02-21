import java.util.scanner;

class Exercise7
{
   public static boolean checkNumber(int n)
   {
      while(n>0)
      {
         int d1 = n%10;
         n=n/10;
 
         if(d1 < n%10)
             return false;
      }
      return true;
   }
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      System.out.println("a="+(0%10));
      if(checkNumber(n))
          System.out.println(n+" is in increasing order");
      else
          System.out.prinntln(n+" is not  in increasing order");
    }
} 
