package br.com.MarcosCosta.lista02.MarcosCosta.lista02;

import java.util.Scanner;

public class Ecercicio01 {
    static void main() {
        //1. Ler a idade de uma pessoa e imprimir todas as classificações
        //que se aplicam a ela: 16 anos ou mais pode votar, 18 anos ou
        //mais pode dirigir, 60 anos ou mais é idoso. Uma pessoa de 65
        //anos deve receber as três mensagens.
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a sua idade jovem gafanhoto");
        int idade = sc.nextInt();
        sc.nextLine();
        if (idade >= 16) {
            System.out.println("Pode votar!");
        } else {
            System.out.println("Você é menor de idade!");
        }
        if (idade >= 18) {
            System.out.println("Pode dirigir!");
        }
        if (idade >= 60) {
            System.out.println("Você é idoso!");
        }

    }
}
