import java.io.*;
import java.util.Scanner;

public class SumOfNumbers
{
   public static void main(String args[]) throws IOException
   {
      int i, soma;
      Scanner teclado = new Scanner(System.in);

      soma = 0;

      System.out.print("Digite um número: ");
      i = teclado.nextInt();
      while (i != -1){
         soma += i;
         System.out.print("Digite um número: ");
         i = teclado.nextInt();
      }

      System.out.println("A soma total é " + soma);
   }
}
