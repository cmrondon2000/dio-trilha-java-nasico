import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {

            System.out.println( "Informe a operacao que deseja fazer: 1 Depositar, 2 Sacar, 3 Consultar Saldo, 0 Encerrar");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    System.out.println( "Coloque o Saldo a depositar:");
                    double deposito = scanner.nextInt();
                    saldo = saldo + deposito;
                    System.out.printf("Saldo Atual: = %.1f %n", (saldo));

                    break;

                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    System.out.println( "Coloque o quantidade a sacar:");
                    double saque = scanner.nextInt();
                    saldo = saldo - saque;
                    if (saldo >= 0) 
                        System.out.printf("Saldo Atual: = %.1f %n", (saldo));
                    else
                        System.out.println("Saldo Insuficiente");
                    break;

                case 3:
                    // TODO: Exibir o saldo atual da conta.
                    System.out.printf("Saldo Atual: = %.1f %n", (saldo));
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}