import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] usuarioNome = new String[5];
        String[] usuariosCpf = new String[5];
        String[] usuariosEmail = new String[5];
        String[] usuariosSenha = new String[5];




        System.out.println("--- Bem vindo ao JornadaBank ---");

        System.out.println("""
                
                --- Serviços disponíveis: ---
                
                (0) - Sair
                (1) - Registrar usuário
                (2) - Criar conta
                (3) - Fazer depósito
                (4) - Realizar saque
                
                """);
        System.out.print("-- Digite o serviço desejado: ");
        int opcaoSelecionada = Integer.parseInt(input.nextLine());

        while(opcaoSelecionada!=0) {

            switch (opcaoSelecionada) {

                case 1:
                // Registrar usuario
                System.out.print("-- Digite o nome: ");
                String[] usuarioNome = new String[5];
                String usuarioNome = input.nextLine();


                System.out.print("-- Digite o CPF: ");
                String cpf = input.nextLine();

                System.out.print("-- Digite o email: ");
                String email = input.nextLine();

                System.out.print("-- Digite a senha: ");
                String senha = input.nextLine();

                usuario1 = new Usuario(nome, cpf, email, senha);
                System.out.println("--- Usuário "+usuario1.getNome()+" criado com sucesso!");
                break;
//
//                case 2:
//                    //Criação de conta
//                    if(usuario1 != null) {
//                        usuario1.criarConta();
//                        System.out.println("\nConta criada");
//                        System.out.println("Id da conta: " + usuario1.getId());
//                        System.out.println("Saldo da conta: "+usuario1.getSaldo());
//                    }else {
//                        System.out.println("--- ERRO...");
//                    }
//                    break;
//                case 3:
//                    //Deposito na conta
//                    System.out.print("-- Digite o valor a ser depositado: ");
//                    double valorDepositado = Double.parseDouble(input.nextLine());
//
//                    if(valorDepositado <= 0.0){
//                        System.out.println("--- ERRO: VALOR INVALIDO");
//                    }else {
//                        System.out.println("--- Depósito realizado com sucesso!");
//                        usuario1.addSaldo(valorDepositado);
//                        System.out.println("Saldo da conta: " + usuario1.getSaldo());
//                    }
//                    break;
//                case 4:
//                    //Sacando valor da conta
//                    System.out.print("Digite o valor que deseja sacar: ");
//                    double valorSacado = Double.parseDouble(input.nextLine());
//
//                    if(valorSacado> usuario1.getSaldo()){
//                        System.out.println("ERRO! SALDO INSUFICIENTE");
//                    } else if (valorSacado<= usuario1.getSaldo() && valorSacado>0) {
//                        usuario1.removeSaldo(valorSacado);
//                        System.out.println("Operação realizada com sucesso!");
//                    }else {
//                        System.out.println("ERRO!");
//                    }
//                    break;
            }
            System.out.print("\n-- Digite o serviço desejado: ");
            opcaoSelecionada = Integer.parseInt(input.nextLine());


        }

    }
    public static String registrarUsuario(){


    }