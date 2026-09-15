package br.com.MarcosCosta.lista02.MarcosCosta.lista02;

import java.util.Scanner;

public class Exercicio09 {
    static void main() {
        //9. Ler o salário de um funcionário e o tempo de casa em anos.
        //Definir o bônus: menos de 1 ano não recebe, de 1 a 3 anos
        //recebe 5 por cento, acima de 3 e até 10 anos recebe 10 por
        //cento, acima de 10 anos recebe 15 por cento. Imprimir o
        //percentual e o valor do bônus.
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor do salário");
        double salario = sc.nextDouble();
        System.out.println("Quantos anos de casa esse funcionário possui?");
        double anos = sc.nextInt();;
        sc.nextLine();
        double bonus5 = salario * 0.05;
        double bonus10 = salario * 0.10;
        double bonus15 = salario * 0.15;
        if (anos < 1) {
            System.out.println("Este funcionário não tem bônus para receber");
        } else if (anos >= 1 && anos <= 3) {
            System.out.println("Você tem um bônus de R$" + bonus5 + " (5%) para receber!");

        } else if (anos > 3 && anos <= 10) {
            System.out.println("Você tem um bônus de R$" + bonus10 + " (10%) para receber!");
        } else {
            System.out.println("Você tem um bônus de R$" + bonus15 + " (15%) para receber!");


        }
    }
    }

