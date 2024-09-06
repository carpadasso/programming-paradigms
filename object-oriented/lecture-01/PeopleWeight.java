import java.io.*;
import java.util.Scanner;

public class PeopleWeight
{
   public static void main(String args[]) throws IOException
   {
      int cont = 0;
      double altura, peso;
      Scanner teclado = new Scanner(System.in);

      System.out.print("Informe altura e peso: ");
      altura = teclado.nextDouble();
      peso = teclado.nextDouble();
      while (altura != -1 && peso != -1){
         if ((peso / (altura*altura)) > 25){
            cont++;
         }
         System.out.print("Informe altura e peso: ");
         altura = teclado.nextDouble();
         peso = teclado.nextDouble();
      }

      System.out.println("Pessoas acima do peso: " + cont);
   }
}
