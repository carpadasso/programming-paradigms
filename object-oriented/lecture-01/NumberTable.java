import java.io.*;
import java.util.Scanner;

public class NumberTable
{
   public static void main(String args[]) throws IOException
   {
      int n, i;
      Scanner teclado = new Scanner(System.in);

      System.out.print("Digite um número: ");
      n = teclado.nextInt();
      
      for (i = 1; i <= 10; i++){
         System.out.println(n + " x " + i + " = " + n*i);
      }
   }
}
