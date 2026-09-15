package br.com.MarcosCosta.lista02.MarcosCosta.lista02;

import java.util.Scanner;

public class Exercicio04 {
    static void main() {
        //4. Ler dois números inteiros e informar se o primeiro é múltiplo
        //do segundo. Antes de calcular, verificar se o segundo número é
        //zero e, nesse caso, informar que a verificação não pode ser
        //feita.
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro numero");
        int num1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Informe o segundo numero");
        int num2 = sc.nextInt();
        sc.nextLine();
        if (num2 == 0) {
            System.out.println("A verificação não pode ser feita");
        }
        if (num1 % num2 == 0) {
            System.out.println("O primeiro numero é multiplo do segundo");
        } else {
            System.out.println("Não são numeros multiplos");
        }

    }
}
