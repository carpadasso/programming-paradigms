import java.io.*;

public class VerifyName {
   public static void main(String args[]) throws IOException
   {
      String nomes[] = new String[10];
      BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

      // Leitura dos Nomes
      for (int i = 0; i < nomes.length; i++){
         System.out.print("Digite o " + (i+1) + "o nome: ");
         nomes[i] = teclado.readLine();
         System.out.println(" ");
      }

      System.out.println(" ");

      // Leitura do Nome de Busca
      String buscaNome;
      System.out.print("Forneça um nome para busca: ");
      buscaNome = teclado.readLine();

      // Verifica se o Nome de Busca está na Lista
      boolean achouNome = false;
      for (int i = 0; i < nomes.length; i++)
         if (nomes[i].equals(buscaNome))
            achouNome = true;
      
      if (achouNome)
         System.out.println("Achou o nome " + buscaNome);
      else
         System.out.println("Não achou o nome " + buscaNome);
   }
}
