import java.util.Scanner;

public class CelsiusToFarenheit {
   public static void main(String args[])
   {
      try
      {
         double c, f;
         Scanner teclado = new Scanner(System.in);

         System.out.println("Valor a converter:");
         c = teclado.nextDouble();

         f = convertCelsiusToFarenheit(c);
         System.out.println("\nCelsius: " + c);
         System.out.println("Farenheit: " + f);

         teclado.close();
      }
      catch (ArithmeticException e)
      {
         System.out.println("Erro aritmético.");
      }
      finally
      {
         System.out.println();
      }
   }

   public static double convertCelsiusToFarenheit(double c)
   {
      return (9.0*c / 5.0) + 32;
   }
}
