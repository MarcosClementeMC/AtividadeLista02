package br.com.MarcosCosta.lista02.MarcosCosta.lista02;

import java.util.Scanner;

public class Exercicio14 {
    static void main() {
        //14. Ler o número de um mês de 1 a 12 e imprimir a quantidade
        //de dias desse mês. Agrupar os meses de mesma duração em
        //um único case, separando os valores por vírgula. Considerar
        //fevereiro com 28 dias. Valores fora da faixa de 1 a 12 devem
        //ser tratados no default.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero do mês:");
        int mes = sc.nextInt();
        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("Esse mês tem 31 dias");
                break;
            case 4, 6, 9, 11:
                System.out.println("Esse mês tem 30 dias");
                break;
            case 2:
                System.out.println("Esse é o unico mês com 28 dias");
                break;
            default:
                System.out.println("Mês inválido!");
        }






    }
}
