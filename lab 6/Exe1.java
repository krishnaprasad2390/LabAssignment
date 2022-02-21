import java.util.*;

class Exe1
{
   public static  List<String> getValues(HashMap<Integer,String> map)
   {
      List<String> list = new ArrayList<>(map.values());
      Collections.sort(list);
      return list;
   }
   public static void main(String[] args)
   {
      HashMap<Integer,String> hashmap = new HashMap<>();
     
      hashmap.put(5,"abc"); 
      hashmap.put(3,"pqr");
      hashmap.put(1,"xyz"); 
      hashmap.put(4,"$@#"); 
      hashmap.put(2,"lmn"); 

      List<String> list = getValues(hashmap);
      
      System.out.println(list);
   }
} 