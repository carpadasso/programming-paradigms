import java.io.*;
import java.util.Scanner;

public class ScannerAndPeople
{
   public static void main(String args[]) throws IOException
   {
      Pessoa p[] = new Pessoa[4];
      int i;

      Scanner teclado = new Scanner(System.in);

      for (i = 0; i < 4; i++)
         p[i] = new Pessoa();

      for (i = 0; i < 4; i++)
      {
         System.out.println("Digite os dados do " + (i+1) + "o indivíduo:");
         System.out.print("Nome: ");
         p[i].setNome(teclado.nextLine());
         System.out.print("Endereço: ");
         p[i].setEndereco(teclado.nextLine());
         System.out.print("Telefone: ");
         p[i].setTelefone(teclado.nextLine());
         System.out.print("Email: ");
         p[i].setEmail(teclado.nextLine());
         System.out.println();
      }

      System.out.println("Dados de cada usuário:");
      for (i = 0; i < 4; i++)
         p[i].imprimeDados();
      
      teclado.close();
   }
}

class Pessoa
{
   private String nome;
   private String endereco;
   private String telefone;
   private String email;

   public void setNome(String n)
   {
      this.nome = n;
   }

   public void setEndereco(String end)
   {
      this.endereco = end;
   }

   public void setTelefone(String tel)
   {
      this.telefone = tel;
   }

   public void setEmail(String email)
   {
      this.email = email;
   }

   public void imprimeDados()
   {
      System.out.println("Nome: " + this.nome);
      System.out.println("Endereço: " + this.endereco);
      System.out.println("Telefone: " + this.telefone);
      System.out.println("Email: " + this.email);
      System.out.println();
   }
}