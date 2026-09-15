package br.com.MarcosCosta.lista02.MarcosCosta.lista02;

import java.util.Scanner;

public class Exercicio11 {
    static void main() {
        //11. Ler a frequência em porcentagem e a média final de um
        //aluno. Se a frequência for menor que 75 por cento, o aluno está
        //reprovado por falta e a média não deve ser avaliada. Se a
        //frequência for suficiente, avaliar a média: média >= 7 aprovado,
        //média >= 5 e média < 7 recuperação, média < 5 reprovado por
        //nota.
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a frequência do aluno");
        int frequencia = sc.nextInt();
        int media;
            if (frequencia > 75) {
                System.out.println("Digite a média final");
                media = sc.nextInt();
                if (media >= 7) {
                    System.out.println("Aprovado!");
                } else if (media >= 5 && media < 7) {
                    System.out.println("Você esta de recuperação!");
                } else {
                    System.out.println("Reprovado!");
                }
            } else {
                System.out.println("Reprovado por falta!");



                }
            }
    }

