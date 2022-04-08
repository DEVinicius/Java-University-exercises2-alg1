package Ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        * Ler um número inteiro N e calcular e imprimir todos os seus divisores. Exemplo: para o número 6, temos os
seguintes divisores 1, 2, 3, 6. Utilize o laço que lhe for mais conveniente.
        * */

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int div = n;

        while(div > 0) {
            if(n%div == 0) {
                System.out.println(div + " eh divisor de " + n);
            }
            div--;
        }
    }
}
