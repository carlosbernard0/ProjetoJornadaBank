import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Bem vindo ao JornadaBank ---");

        System.out.println("""
                
                --- Serviços disponíveis: ---
                
                (0) - Sair
                (1) - Registrar usuário
                (2) - Criar conta
                (3) - Fazer depósito
                
                """);
        System.out.print("-- Digite o serviço desejado: ");
        int opcaoSelecionada = Integer.parseInt(input.nextLine());

        Usuario usuario1 = null;

        while(opcaoSelecionada!=0) {

            switch (opcaoSelecionada) {

                case 1:
                // Registrar usuario
                System.out.print("-- Digite o nome: ");
                String nome = input.nextLine();

                System.out.print("-- Digite o CPF: ");
                String cpf = input.nextLine();

                System.out.print("-- Digite o email: ");
                String email = input.nextLine();

                System.out.print("-- Digite a senha: ");
                String senha = input.nextLine();

                usuario1 = new Usuario(nome, cpf, email, senha);
                System.out.println("--- Usuário "+usuario1.getNome()+" criado com sucesso!");
                break;

                case 2:
                    if(usuario1 != null) {
                        usuario1.criarConta();
                        System.out.println("\nConta criada");
                        System.out.println("Id da conta: " + usuario1.getId());
                        System.out.println("Saldo da conta: "+usuario1.getSaldo());
                    }else {
                        System.out.println("--- ERRO...");
                    }
                    break;
                case 3:
                    System.out.print("-- Digite o valor a ser depositado: ");
                    double valorDepositado = Double.parseDouble(input.nextLine());

                    if(valorDepositado <= 0.0){
                        System.out.println("--- ERRO: VALOR INVALIDO");
                    }else {
                        System.out.println("--- Depósito realizado com sucesso!");
                        usuario1.setSaldo(valorDepositado);
                        System.out.println("Saldo da conta: " + usuario1.getSaldo());
                    }
            }
            System.out.print("\n-- Digite o serviço desejado: ");
            opcaoSelecionada = Integer.parseInt(input.nextLine());


        }

    }
}