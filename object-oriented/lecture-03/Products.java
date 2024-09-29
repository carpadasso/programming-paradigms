import java.util.Scanner;

public class Products {
   public static void main(String args[])
   {
      Scanner teclado = new Scanner(System.in);

      Product p = new Product(102, "Cereal", 2, 10.50);

      p.mostraPreco();
      p.atualizaPreco(20);
      p.mostraPreco();

      teclado.close();
   }
}

class Product
{
   int codigo, quantidade;
   double preco;
   String nome;

   // Construtores
   public Product() { }

   public Product(int codigo, String nome, int quantidade, double preco)
   {
      this.codigo = codigo;
      this.nome = nome;
      this.quantidade = quantidade;
      this.preco = preco;
   }

   public void setCodigo(int codigo) { this.codigo = codigo; }
   public void setQuantidade(int qtd) { this.quantidade = qtd; }
   public void setPreco(double p) { this.preco = p; }
   public void setNome(String n) { this.nome = n; }

   public int getCodigo() { return codigo; }
   public int getQuantidade() { return quantidade; }
   public double getPreco() { return preco; }
   public String getNome() { return nome; }

   public void mostraPreco() { System.out.println(preco); }
   public void atualizaPreco(double perc) { preco += preco*perc/100; }
}
