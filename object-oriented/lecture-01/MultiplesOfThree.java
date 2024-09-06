import java.io.*;

public class MultiplesOfThree
{
   public static void main(String args[]) throws IOException
   {
      int i, soma;

      soma = 0;
      for (i = 1; i <= 10; i++){
         soma += 3*i;
      }

      System.out.println("A soma dos 10 primeiros múltiplos de 3 é " + soma);
   }
}
