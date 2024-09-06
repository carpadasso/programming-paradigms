import java.io.*;
import java.util.Scanner;

public class MatrixSum {
   public static void main(String args[]) throws IOException
   {
      int m1[][] = new int[3][3];
      int m2[][] = new int[3][3];
      int soma[][] = new int[3][3];
      Scanner teclado = new Scanner(System.in);

      // Leitura da matriz 01
      System.out.println("MATRIZ 01");
      for (int i = 0; i < m1.length; i++){
         System.out.print("Digite os números da linha " + (i+1) + ": ");
         for (int j = 0; j < m1[i].length; j++)
            m1[i][j] = teclado.nextInt();
      }

      System.out.println(" ");

      // Leitura da matriz 02
      System.out.println("MATRIZ 02");
      for (int i = 0; i < m2.length; i++){
         System.out.print("Digite os números da linha " + (i+1) + ": ");
         for (int j = 0; j < m2[i].length; j++)
            m2[i][j] = teclado.nextInt();
      }
      System.out.println(" ");

      // Gera a matriz SOMA
      for (int i = 0; i < soma.length; i++)
         for (int j = 0; j < soma[i].length; j++)
            soma[i][j] = m1[i][j] + m2[i][j];
      
      // Imprime a formulação da soma
      for (int i = 0; i < m1.length; i++){
         for (int j = 0; j < m1[i].length; j++)
            System.out.print(m1[i][j] + " ");
         System.out.println(" ");
      }
      
      System.out.println(" ");
      System.out.println("  +");
      System.out.println(" ");

      for (int i = 0; i < m2.length; i++){
         for (int j = 0; j < m2[i].length; j++)
            System.out.print(m2[i][j] + " ");
         System.out.println(" ");
      }

      System.out.println(" ");
      System.out.println("  =");
      System.out.println(" ");

      for (int i = 0; i < soma.length; i++){
         for (int j = 0; j < soma[i].length; j++)
            System.out.print(soma[i][j] + " ");
         System.out.println(" ");
      }
   }
}
