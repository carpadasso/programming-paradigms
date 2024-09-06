import java.io.*;

public class PeopleAge
{
   public static void main(String args[]) throws IOException
   {
      int idades[] = new int[10];
      BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

      // Leitura das Idades
      System.out.print("Digite 10 idades: ");
      for (int i = 0; i < idades.length; i++)
         idades[i] = Integer.parseInt(teclado.readLine());
      
      // Cálculo da Média
      int soma = 0;
      double media;
      for (int i = 0; i < idades.length; i++)
         soma += idades[i];
      media = soma / idades.length;
      System.out.println("A média das idades é: " + media);

      // Idades ABAIXO da média
      System.out.print("Idades ABAIXO da média: ");
      for (int i = 0; i < idades.length; i++)
         if (idades[i] < media)
            System.out.print(idades[i] + " ");
      System.out.println(" ");

      // Idades ACIMA da média
      System.out.print("Idades ACIMA da média: ");
      for (int i = 0; i < idades.length; i++)
         if (idades[i] > media)
            System.out.print(idades[i] + " ");
      System.out.println(" ");
   }
}
