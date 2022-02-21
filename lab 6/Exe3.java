import java.util.*;

public class Exe3
{
    public static HashMap getSquares(int[] ar){
       
       HashMap<Integer, Integer> map = new HashMap<>();
       
       for (int n: ar){

          map.put(n, n*n);
       }
       return map;
    }
    public static void main(String[] args) 
    {
        int arr[] = new int[] {1,2,3,4,5,6};
        HashMap<Integer, Integer> map = getSquares(arr);

        Iterator<Integer> it = map.keySet().iterator();
        while(it.hasNext())
        {
           Integer key = it.next();
           System.out.println(key +" : "+map.get(key));
        }
     }
}