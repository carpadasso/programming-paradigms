import java.io.*;

public class MultMatriz
{
   public static void main(String args[]) throws IOException
   {
      int a[][] = { {2,3,1} , {4,5,1} , {2,4,8} };
      int mult[][] = new int[3][3];

      for (int i = 0; i < a.length; i++)
         for (int j = 0; j < a[i].length; j++)
            mult[i][j] = 3*a[i][j];
      
      for (int i = 0; i < a.length; i++)
      {
         for (int j = 0; j < a[i].length; j++)
            System.out.print("\t" + a[i][j]);
         System.out.println("\t");
      }

      System.out.println("\t------------------");

      for (int i = 0; i < a.length; i++)
      {
         for (int j = 0; j < a[i].length; j++)
            System.out.print("\t" + mult[i][j]);
         System.out.println("\t");
      }
   }
}
