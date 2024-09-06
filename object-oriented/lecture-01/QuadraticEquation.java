import java.io.*;
import java.util.Scanner;

public class QuadraticEquation
{
   public static void main(String args[]) throws IOException
   {
      int a, b, c;
      double raiz;
      Scanner teclado = new Scanner(System.in);
      
      System.out.println("Escreva os coeficientes da equação (a, b, c):");
      a = teclado.nextInt();
      b = teclado.nextInt();
      c = teclado.nextInt();

      // Cálculo da Raiz 01
      raiz = (-b + Math.sqrt(b*b - 4*a*c)) / 2*a;
      System.out.println("A primeira raiz é: " + raiz);

      // Cálculo da Raiz 02
      raiz = (-b - Math.sqrt(b*b - 4*a*c)) / 2*a;
      System.out.println("A segunda raiz é: " + raiz);
   }
}
