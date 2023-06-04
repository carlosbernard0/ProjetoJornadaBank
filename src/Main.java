import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        String nome = input.nextLine();

        System.out.println("Digite o CPF: ");
        String cpf = input.nextLine();

        System.out.println("Digite o email: ");
        String email = input.nextLine();

        System.out.println("Digite a senha: ");
        String senha = input.nextLine();

        Usuario usuario1 = new Usuario(nome, cpf, email, senha);
        System.out.println(usuario1);


    }
}