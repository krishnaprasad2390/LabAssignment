import java.util.*; 
 
public class ReversingArray
{ 
 
    public static void getSorted(Integer Array[]) 
    { 
        Collections.reverse(Arrays.asList(Array)); 
        System.out.println("Reversed Array:" + Arrays.asList(Array)); 
    } 
 
     public static void main(String[] args) 
    { 
        Integer [] Array = {44,66,99,77,33,22,55}; 
        System.out.println("Original Array:" + Arrays.asList(Array));
        reverse(Array); 
    } 
}