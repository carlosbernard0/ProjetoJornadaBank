import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] usuariosNome = new String[5];
        String[] usuariosCpf = new String[5];
        String[] usuariosEmail = new String[5];
        String[] usuariosSenha = new String[5];

        int[] contaId = new int[5];
        double[] contaSaldo = new double[5];



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
                    for(int i=0;i<5;i++) {
                        System.out.print("-- Digite o nome: ");
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
                    if(usuariosNome[1] != null){
                        for(int i=0;i<3;i++){
                            contaId[i] = i;
                            contaSaldo[i] = 0.0;
                            System.out.println("--- Conta criada com sucesso => Id: " + contaId[i] + ", Saldo: " + contaSaldo[i]);
                        }
                    }else {
                        System.out.println("--- ERRO --- Usuario não registrado!");
                    }

                    break;
                case 3:
                    //Deposito na conta
                    System.out.print("Digite o Id: ");
                    int idEscolhido = Integer.parseInt(input.nextLine());

                    System.out.print("Digite o valor do deposito: ");
                    contaSaldo[idEscolhido] += Double.parseDouble(input.nextLine());

                    System.out.println("Deposito concluido com sucesso!");
                    System.out.println("Saldo: "+ contaSaldo[idEscolhido]);


                    break;
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
//    public static String registrarUsuario(){
//
//
//    }
}