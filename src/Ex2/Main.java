package Ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        *
        * Escreva um programa que leia um conjunto de 10 números inteiros positivos. Seu programa deve determinar
e imprimir o maior deles. Use o laço FOR.*/

        int maiorNumero = 0;
        Scanner scanner = new Scanner(System.in);


        for(int i = 0; i < 10; i ++ ) {
            System.out.println("Escreva um numero");
            int numero = scanner.nextInt();

            if(numero > maiorNumero) {
                maiorNumero = numero;
            }
        }

        System.out.println("O maior numero eh: " + maiorNumero);
    }
}
