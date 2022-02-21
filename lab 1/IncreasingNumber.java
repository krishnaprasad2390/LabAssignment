class IncreasingNumber
{
    static boolean checkNumber(int number)
    {
        while(number>0)
        {
           int d1 = number%10;
           number/=10;
           int d2 = number%10;
           if(d2>d1)
           {
              return false;
           }
        
        }
        return true;
     }
     public static void main(String[] args)
     {
         System.out.println(checkNumber(134468));
      }
}