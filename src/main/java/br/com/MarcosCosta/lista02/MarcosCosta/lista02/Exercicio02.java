package br.com.MarcosCosta.lista02.MarcosCosta.lista02;

import java.util.Scanner;

public class Exercicio02 {
    static void main() {
        //2. Ler um número inteiro e imprimir uma linha para cada
        //característica verdadeira: é positivo, é par, é múltiplo de 5, tem
        //dois dígitos. Para a contagem de dígitos, considere o módulo do
        //número, obtido com Math.abs(numero). Se nenhuma
        //característica for verdadeira, nada é impresso.
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um numero jovem gafanhoto");
        int numero = sc.nextInt();
        sc.nextLine();
        if (numero > 0) {
            System.out.println("É um numero positivo!");
        }
        if (numero % 2 == 0) {
            System.out.println("É um numero par!");
        }
        if (numero % 5 == 0) {
            System.out.println("É um numero multiplo de 5!");
        }
        if (Math.abs(numero) >= 10 && Math.abs(numero) <= 99) {
            System.out.println("É um numero com dois dígitos!");
        }


    }
}
