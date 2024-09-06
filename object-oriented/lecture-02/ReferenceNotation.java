import java.io.*;

public class ReferenceNotation
{
   public static void main(String args[]) throws IOException
   {
      String nome;
      BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

      System.out.print("Digite um nome (Formato comum - NOME SOBRENOME): ");
      nome = teclado.readLine();

      System.out.print("Nome em formato de Referência (SOBRENOME, N.): ");
      System.out.println(nome.substring(nome.indexOf(' ') + 1) + ", " + nome.charAt(0) + ".");
   }
}
