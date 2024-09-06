/* PT-BR 
 * Fazer um programa em java que calcule 
 * e imprima a tabuada de 6
 * 
 * EN-US
 * Do a java program that evaluates and print
 * the six multiplication table
 */

import java.io.*;

public class SixTable
{
   public static void main(String args[]) throws IOException
   {
      int i;

      for (i = 0; i <= 10; i++){
         System.out.println("6 x " + i + " = " + 6*i);
      }
   }
}