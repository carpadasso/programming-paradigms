import java.io.*;
import java.util.Scanner;

public class PiecewiseFunction
{
   public static void main(String args[]) throws IOException
   {
      double x;
      Scanner teclado = new Scanner(System.in);

      System.out.print("Digite um número: ");
      x = teclado.nextDouble();

      System.out.print("f(" + x + ") = ");
      if (0 <= x && x < 5){
         System.out.println(x);
      }
      else if (x < 10){
         System.out.println(2*x + 1);
      }
      else {
         System.out.println(x - 3);
      }
   }
}
