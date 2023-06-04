import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Bem vindo ao JornadaBank ---");

        System.out.println("""
                Serviços disponíveis:
                
                (0) - Sair
                (1) - Registrar usuário
                (2) - Criar conta
                """);
        System.out.print("Digite o serviço desejado: ");
        int opcaoSelecionada = Integer.parseInt(input.nextLine());

        Usuario usuario1 = null;

        while(opcaoSelecionada!=0) {

            switch (opcaoSelecionada) {

                case 1:
                // Registrar usuario
                System.out.print("Digite o nome: ");
                String nome = input.nextLine();

                System.out.print("Digite o CPF: ");
                String cpf = input.nextLine();

                System.out.print("Digite o email: ");
                String email = input.nextLine();

                System.out.print("Digite a senha: ");
                String senha = input.nextLine();

                usuario1 = new Usuario(nome, cpf, email, senha);
                System.out.println("Usuário "+usuario1.getNome()+" criado com sucesso!");
                break;

                case 2:
                    if(usuario1 != null) {
                        usuario1.criarConta();
                        System.out.println("Conta criada");
                    }else {
                        System.out.println("ERRO...");
                    }
                    break;
            }
            System.out.println("Digite o serviço desejado: ");
            opcaoSelecionada = Integer.parseInt(input.nextLine());


        }

    }
}