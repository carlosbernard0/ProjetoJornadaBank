import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] usuariosNome = new String[3];
        String[] usuariosCpf = new String[3];
        String[] usuariosEmail = new String[3];
        String[] usuariosSenha = new String[3];

        int[] contaId = new int[3];
        double[] contaSaldo = new double[3];

        int selectedId;

        System.out.println("--- Bem vindo ao JornadaBank ---");

        int opcaoSelecionada;
        do {
            System.out.println("""
                                    
                    --- Serviços disponíveis: ---
                                    
                    (0) - Sair
                    (1) - Registrar usuário
                    (2) - Criar conta
                    (3) - Fazer depósito
                    (4) - Realizar saque
                    (5) - Transferir dinheiro
                    (6) - Ver saldo
                                    
                    """);
            System.out.print("-- Digite o serviço desejado: ");
            opcaoSelecionada = Integer.parseInt(input.nextLine());


            switch (opcaoSelecionada) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    // Registrar usuario
                    for (int i = 0; i < 3; i++) {
                        System.out.print("\n-- Digite o nome: ");
                        usuariosNome[i] = input.nextLine();

                        System.out.print("-- Digite o CPF: ");
                        usuariosCpf[i] = input.nextLine();

                        System.out.print("-- Digite o email: ");
                        usuariosEmail[i] = input.nextLine();

                        System.out.print("-- Digite a senha: ");
                        usuariosSenha[i] = input.nextLine();

                        System.out.println("--- Usuário " + usuariosNome[i] + " criado com sucesso!");
                    }
                    break;

                case 2:
                    // Criação da conta
                    if (usuariosNome[1] != null) {
                        for (int i = 0; i < 3; i++) {
                            contaId[i] = i;
                            contaSaldo[i] = 0.0;
                            System.out.println("\n--- Conta criada com sucesso => Id: " + contaId[i] + ", Saldo: " + contaSaldo[i]);
                        }
                    } else {
                        System.out.println("\n--- ERRO: Usuario não registrado!");
                    }

                    break;
                case 3:
                    //Deposito na conta

                    System.out.print("-- Digite o seu Id: ");
                    selectedId = Integer.parseInt(input.nextLine());

                    if(selectedId < 0 || selectedId>3){

                        System.out.println("\n--- ERRO: Id invalido!");

                    }else {

                        System.out.print("-- Digite o valor do deposito: ");
                        double valorDeposito = Double.parseDouble(input.nextLine());

                        if (valorDeposito > 0) {
                            contaSaldo[selectedId] += valorDeposito;

                            System.out.println("--- Deposito concluido com sucesso!");
                            System.out.println("--- Saldo: " + contaSaldo[selectedId]);
                        } else {
                            System.out.println("\n--- ERRO: Valor invalido!");
                        }
                    }
                    break;
                case 4:
                    //Sacando da conta
                    System.out.print("\n-- Digite o seu Id: ");
                    selectedId = Integer.parseInt(input.nextLine());

                    if(selectedId < 0 || selectedId>3){

                        System.out.println("\n--- ERRO: Id invalido!");

                    }else {

                        System.out.print("-- Digite o valor a ser sacado: ");
                        double valorSaque = Double.parseDouble(input.nextLine());

                        if (valorSaque > 0 && valorSaque <= contaSaldo[selectedId]) {
                            contaSaldo[selectedId] -= valorSaque;
                            System.out.println("--- Saque concluido com sucesso!");
                        } else {
                            System.out.println("\n--- ERRO: Saldo insuficiente");
                        }

                        System.out.println("--- Saldo: " + contaSaldo[selectedId]);
                    }
                    break;
                case 5:

                    System.out.print("Qual o seu Id?: ");
                    selectedId = Integer.parseInt(input.nextLine());

                    System.out.print("Digite o id da conta a ser transferido: ");
                    int idTransferencia = Integer.parseInt(input.nextLine());

                    System.out.print("Digite o valor a ser enviado: ");
                    double valorTransferido = Double.parseDouble(input.nextLine());

                    if(valorTransferido > 0 && valorTransferido <= contaSaldo[selectedId]){
                        contaSaldo[idTransferencia] += valorTransferido;
                        contaSaldo[selectedId] -= valorTransferido;
                        System.out.println("\n--- Transferência realizada com sucesso!");
                        System.out.println("--- Saldo: " + contaSaldo[selectedId]);
                    }else{
                        System.out.println("\n--- ERRO: Valor insuficiente OU id inválido!");
                    }

                    break;
                case 6:
                    System.out.print("Digite o seu Id: ");
                    selectedId = Integer.parseInt(input.nextLine());

                    System.out.println("\n--- Saldo: " + contaSaldo[selectedId]);
            }

        } while (opcaoSelecionada != 0);
    }

    }
