import java.util.Scanner;

public class Exe2
{
       String s;
       public String getImage(String str)
       {
              StringBuffer sbr = new StringBuffer(str);
              sbr.append('|');
              StringBuffer sb = new StringBuffer(str);
              sb.reverse();
              sbr.append(sb);
              s = sbr.toString();
              return s;
       }
       public static void main(String[] ar)
       {
              Exe2 e2 = new Exe2();
              Scanner sc = new Scanner(System.in);
              System.out.println("Enter a String");
              String str = sc.next();
              System.out.println(e2.getImage(str));
       }
}