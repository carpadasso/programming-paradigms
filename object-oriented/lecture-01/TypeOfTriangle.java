import java.io.*;
import java.util.Scanner;

public class TypeOfTriangle {
   public static void main(String args[]) throws IOException
   {
      double l1, l2, l3;
      Scanner teclado = new Scanner(System.in);

      System.out.print("Digite os lados do triângulo: ");
      l1 = teclado.nextDouble();
      l2 = teclado.nextDouble();
      l3 = teclado.nextDouble();

      // Verifies if the triangle exists
      if (!(l1 + l2 > l3) || !(l1 + l3 > l2) || !(l2 + l3 > l1)){
         System.out.println("Triângulo impossível");
      }
      // Verifies the type of the triangle
      else {
         if ((l1 != l2) && (l1 != l3) && (l2 != l3)){
            System.out.println("Triângulo é Escaleno");
         }
         else if ((l1 == l2) && (l1 == l3) && (l2 == l3)){
            System.out.println("Triângulo é Equilátero");
         }
         else {
            System.out.println("Triângulo é Isósceles");
         }
      }
   }
}
