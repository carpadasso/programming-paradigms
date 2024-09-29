import java.util.*;
public class Comissions
{
   public static void main(String args[])
   {
      int qtde;
      double produto = 100.0;
      double valcomissao;

      Scanner teclado = new Scanner(System.in);
      for (int i = 1; i <30; i++)
      {
         System.out.println("digite quantidade vendida");
         qtde = teclado.nextInt();
         if (qtde < 10)
         valcomissao = comissao(10, qtde, produto);
         else if (qtde >=30)
         valcomissao = comissao(15, qtde, produto);
         else
         valcomissao = comissao(12, qtde, produto);
         System.out.println("O valor da comissao e "+valcomissao);
      }
   }

   public static double comissao (double perc, int quantidade, double valorProduto)
   {
      double valorComissao = (valorProduto * perc * quantidade) / 100;
      if (valorComissao > 1000) valorComissao *= 1.02;
      return valorComissao;
   }
}

