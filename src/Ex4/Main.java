package Ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        * Escreva um programa capaz de ler o saldo inicial de uma conta bancária e um número indeterminado de
operações de depósito e saque.
O usuário deve digitar “1” para realizar um depósito, “2” para realizar um saque.
Após digitar o código da operação, o usuário deve digitar o valor. As operações devem continuar sendo
realizadas até que o usuário digite o código de operação “3”.
Ao digitar “3”, o programa deve ser encerrado e o saldo final da conta deve ser impresso com as seguintes
mensagens: CONTA ZERADA (caso o saldo final seja 0), CONTA ESTOURADA (se o saldo for negativo) ou
CONTA PREFERENCIAL (se o saldo for positivo).
Utilize o laço DO-WHILE
        * */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o Saldo Inicial: ");
        double saldoInicial = scanner.nextDouble();

        boolean statusBanco = true;

        do {
            System.out.println("Digite\n1 - Deposito\n2 - Saque\n3 - Sair");
            int escolhaUsuario = scanner.nextInt();

            switch (escolhaUsuario) {
                case 1:
                    System.out.println("Qual valor deseja depositar? ");
                    double valor = scanner.nextDouble();

                    saldoInicial = saldoInicial + valor;
                    System.out.println("Saldo Atual: " + saldoInicial);

                    break;
                case 2:
                    System.out.println("Qual valor deseja sacar? ");
                    double valorSaque = scanner.nextDouble();

                    if(valorSaque > saldoInicial) {
                        System.out.println("Saldo Insuficiente.");
                        break;
                    }

                    saldoInicial = saldoInicial - valorSaque;
                    System.out.println("Saldo Atual: " + saldoInicial);
                    break;
                case 3:
                    System.out.println("SALDO FINAL: " + saldoInicial);
                    statusBanco = false;
                    break;
                default:
                    System.out.println("Escolha Invalida");
                    break;
            }
        } while (statusBanco);

        System.out.println("ATE MAIS :)");
    }
}
