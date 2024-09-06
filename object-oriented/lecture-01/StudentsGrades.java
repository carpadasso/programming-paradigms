import java.io.*;
import java.util.Scanner;

public class StudentsGrades
{
   public static void main(String args[]) throws IOException
   {
      int i, j;
      double nota, maior, maiorAluno;
      Scanner teclado = new Scanner(System.in);

      maior = 0;
      for (i = 0; i < 30; i++){
         maiorAluno = 0;
         System.out.print("Digite as notas: ");
         for (j = 0; j < 4; j++){
            nota = teclado.nextDouble();
            if (nota > maiorAluno) maiorAluno = nota;
            if (nota > maior) maior = nota;
         }

         System.out.println("Maior nota do " + (i+1) + " aluno: " + maiorAluno);
      }

      System.out.println("Maior nota da turma: " + maior);
   }
}
