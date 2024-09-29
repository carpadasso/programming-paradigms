import java.util.Scanner;

public class ReverseString {
   public static void main(String args[])
   {
      Scanner teclado = new Scanner(System.in);
      String s;
      
      System.out.println("Digite a string:");
      s = teclado.nextLine();

      inverteString(s);

      teclado.close();
   }

   public static void inverteString(String s)
   {
      for (int i = 0; i < s.length(); i++)
         System.out.print(s.charAt(s.length() - i - 1));
      System.out.println();
   }
}
