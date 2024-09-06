import java.io.*;
import java.util.Scanner;

public class StudentsGrades {
   public static void main(String args[]) throws IOException
   {
      int i;
      double p1, p2, p3, p4, maior;
      Scanner teclado = new Scanner(System.in);

      maior = 0;
      for (i = 0; i < 30; i++){
         System.out.print("Digite as notas: ");
         p1 = teclado.nextDouble();
         p2 = teclado.nextDouble();
         p3 = teclado.nextDouble();
         p4 = teclado.nextDouble();

         System.out.println("Maior nota do " + (i+1) + " aluno: " + Math.max(Math.max(Math.max(p1, p2), p3), p4));
         maior = Math.max(Math.max(Math.max(Math.max(p1, p2), p3), p4), maior);
      }

      System.out.println("Maior nota da turma: " + maior);
   }
}
