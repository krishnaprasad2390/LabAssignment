import java.util.*; 
 
class SecondSmallestInArray
{  
   public static int getSecondSmallest(Integer[] a)
   {  
      List<Integer> list = Arrays.asList(a);  
      Collections.sort(list);  
      int res = list.get(1);  
      return res;  
   }  
   public static void main(String args[])
   {  
        
      Integer a[]={44,66,99,77,33,22,55}; 
 
      System.out.println("Second Smallest: "+getSecondSmallest(a));  
     
   }
}  