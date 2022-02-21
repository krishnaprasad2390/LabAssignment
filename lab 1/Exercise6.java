import java.util.Scanner;

class Exercise6
{
   public int calculateDifference(int n)
   {
     int a1=0;
     int a2=0;
     for (int i=1;i<=n;i++)
     {
        a1=a1+(i*i);
     }
     for (int j=0;j<=n;j++)
     {
        a2=a2+j;
     }
     a2=a2*a2;
     return a1-a2;
   }
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      Exercise6 e1 = new Exercise6();
      int sum = e1.calculateDifference(sc.nextInt());
      System.out.println(sum);
   }
}