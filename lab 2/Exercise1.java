import.java.util.Arrays;
Class Exercise1
{
   static int getSecondSmallest(int[] arr)
   {
      Arrays.sort(arr);
      System.out.println("The sorted array:"+ Arrays.toString(arr));
      int res = arr[1];
      return res;
   }
   public static void main(String[] args)
   {
      int arr[] = {8,6,7,2,5};
      System.out.println("The smallest number is:" + getSecondSmallest(arr));
   }
}