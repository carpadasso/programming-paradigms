import java.io.*;

public class PeopleDraw
{
   public static void main(String args[]) throws IOException
   {
      String participantes[] = { "Aristóteles", "Bacon", "Confúcio", 
                                 "Diógenes", "Euclides" };
      int sorteio = (int) (Math.random() * 5);

      System.out.println("O vencedor do sorteio é: " + participantes[sorteio]);
   }
}
