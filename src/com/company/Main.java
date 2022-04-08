package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        /**
         * Faça um programa que leia um número N do usuário, some todos os números inteiros de 1 a N, e mostre o
         * resultado obtido. Use o laço WHILE.
         * */

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int resultado = 0;

        while (n > 0) {
            resultado = resultado + n;
            n --;
        }

        System.out.println("SOMA = " + resultado);
    }
}
