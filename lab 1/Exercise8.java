class Exercise8
{
   public static boolean powerOfTwo(int n)
   {
      while(n%2==0)
      {
         n=n/2;
      }
      if(n==1)
      {
         return true;
      }
      else
      {
         return false;
      }
    }
    public static void main(String[] args)
    {
       System.out.println(powerOfTwo(16));
    }
}