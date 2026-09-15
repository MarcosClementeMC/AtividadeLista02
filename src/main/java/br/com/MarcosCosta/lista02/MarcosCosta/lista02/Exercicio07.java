package br.com.MarcosCosta.lista02.MarcosCosta.lista02;

import java.util.Scanner;

public class Exercicio07 {
    static void main() {
        //7. Ler a hora do dia como um inteiro de 0 a 23 e imprimir a
        //saudação correspondente: de 0 a 11 bom dia, de 12 a 17 boa
        //tarde, de 18 a 23 boa noite. Horas fora dessa faixa são
        //inválidas.
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o horário");
        int hora = sc.nextInt();
        sc.nextLine();
        if (hora >= 0 && hora <= 11) {
            System.out.println("Bom dia flor do dia!");
        } else if (hora > 23) {
            System.out.println("Horário inválido");
        } else if (hora >= 12 && hora <= 17) {
            System.out.println("Boa tarde!");
        }
        if (hora >= 18 && hora <= 23) {
            System.out.println("Boa noite!");

        }
    }
}

