import java.io.*;
import java.util.Scanner;

public class PeopleDataFile
{
   public static void main(String args[]) throws IOException
   {
      int i;
      File file = new File("./data.txt");
      file.createNewFile();

      Pessoa p[] = new Pessoa[4];
      for (i = 0; i < 4; i++)
         p[i] = new Pessoa();

      Scanner teclado = new Scanner(System.in);
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

      BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
      for (i = 0; i < 4; i++)
      {
         writer.append("Dados do " + (i+1) + "o usuário:\n");
         writer.append("Nome: " + p[i].getNome() + "\n");
         writer.append("Endereço: " + p[i].getEndereco() + "\n");
         writer.append("Telefone: " + p[i].getTelefone() + "\n");
         writer.append("Email: " + p[i].getEmail() + "\n");
         writer.append('\n');
      }

      writer.close();
      teclado.close();
   }
}

class Pessoa
{
   private String nome;
   private String endereco;
   private String telefone;
   private String email;

   // Set Methods
   public void setNome(String n) { this.nome = n; }
   public void setEndereco(String end) { this.endereco = end; }
   public void setTelefone(String tel) { this.telefone = tel; }
   public void setEmail(String email) { this.email = email; }

   // Get Methods
   public String getNome() { return this.nome; }
   public String getEndereco() { return this.endereco; }
   public String getTelefone() { return this.telefone; }
   public String getEmail() { return this.email; }

   public void imprimeDados()
   {
      System.out.println("Nome: " + this.nome);
      System.out.println("Endereço: " + this.endereco);
      System.out.println("Telefone: " + this.telefone);
      System.out.println("Email: " + this.email);
      System.out.println();
   }
}