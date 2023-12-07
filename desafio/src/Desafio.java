import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Maria da Silva";
        String tipoConta = "Corrente";
        double saldo = 3000.95;
        int opcao = 0;


        System.out.println("***********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n***********************\n");

        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor 
                4 - Sair

                """;
        Scanner scanner = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = scanner.nextInt();

            if (opcao == 1){
                System.out.println("Saldo atual: R$ " + saldo + "\n");
            }
            else if (opcao == 2){
                System.out.println(" Informe o valor a transferir");
                double valorTransferencia = scanner.nextDouble();

                if (valorTransferencia > saldo){
                    System.out.println("Saldo insuficiente \n");
                } else  {
                    saldo -= valorTransferencia;
                    System.out.println("Saldo Atualizado: \n" +  saldo);

                }
            }
            else if (opcao == 3){
                System.out.println("Informe o valor a receber: ");
                 double valorRecebido = scanner.nextDouble();
                 saldo += valorRecebido;

                System.out.println("Saldo Atualizado: " + saldo);
            }
            else if (opcao != 4){
                System.out.println("Opção inválida\n");
            }

        }


        }
    }


