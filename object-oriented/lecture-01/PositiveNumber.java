import java.io.*;
import java.util.Scanner;

public class PositiveNumber {
   public static void main(String args[]) throws IOException
   {
      int n;
      Scanner teclado = new Scanner(System.in);
      
      System.out.print("Digite um número: ");
      n = teclado.nextInt();

      if (n > 0){
         System.out.println("Número é positivo");
      }
      if (n < 0) {
         System.out.println("Número é negativo");
      }
      if (n == 0){
         System.out.println("Número é nulo");
      }
   }
}