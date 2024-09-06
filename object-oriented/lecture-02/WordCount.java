import java.io.*;

public class WordCount
{
   public static void main(String args[]) throws IOException
   {
      String frase;
      BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

      System.out.print("Digite uma frase: ");
      frase = teclado.readLine();

      int num_palavras = 1;
      for (int i = 0; i < frase.length(); i++)
         if (frase.charAt(i) == ' ')
            num_palavras++;
      
      System.out.println("Número de palavras na frase: " + num_palavras);
   }
}
