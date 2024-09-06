import java.io.*;

class Exceptions
{
   public static void main(String args[])
   {
      int num1, num2;
      try
      {
         BufferedReader teclado;
         teclado = new BufferedReader(new InputStreamReader(System.in));

         System.out.print("Digite um número: ");
         num1 = Integer.parseInt(teclado.readLine());
         System.out.print("Digite outro número: ");
         num2 = Integer.parseInt(teclado.readLine());

         System.out.println("Soma = " + (num1+num2));
         System.out.println("Subtração = " + (num1-num2));
         System.out.println("Multiplicação = " + (num1*num2));
         System.out.println("Divisão = " + (num1/num2));
      }
      catch (ArithmeticException aex)
      {
            System.out.println("Erro de divisão por zero! " + aex);
      }
      catch (IOException ioex)
      {
         System.out.println("Número de argumentos inválidos! " + ioex);
      }
      catch (NumberFormatException nfex)
      {
         System.out.println("Digite apenas números inteiros! " + nfex);
      }
      finally
      {
         System.out.println("Fim!");
      }
   }
}
