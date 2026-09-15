package br.com.MarcosCosta.lista02.MarcosCosta.lista02;

import java.util.Scanner;

public class Exercicio13 {
    static void main() {
        //13. Ler dois números do tipo double e uma opção de 1 a 4,
        //onde 1 é soma, 2 é subtração, 3 é multiplicação e 4 é divisão.
        //Usar switch para executar a operação escolhida e imprimir o
        //resultado. Qualquer outra opção cai no default como opção
        //inválida. Na divisão, verificar antes se o divisor é zero.
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o primeiro numero");
        double num1 = sc.nextDouble();
        System.out.println("Informe o segundo numero");
        double num2 = sc.nextDouble();
        System.out.println("Escolha uma opção\nSomar: 1\nSubtrair: 2\nMultiplicar: 3\nDividir: 4");
        int opcao = sc.nextInt();
        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multi = num1 * num2;
        double divisao;
        switch (opcao) {
                    case 1:
                        System.out.println("A soma dos numeros é " + soma);
                        break;
                    case 2:
                        System.out.println("A subtração dos numero é " + subtracao);
                        break;
                    case 3:
                        System.out.println("A multiplicação dos numeros é " + multi);
                        break;
                    case 4:
                        if (num2 == 0) {
                            System.out.println("Não pode ser dividido por 0");
                        } else {
                            divisao = num1 / num2;
                            System.out.println("A divisão dos numeros é " + divisao);
                            }
                            break;
                        default:
                            System.out.println("Opção inválida");

        }




    }
}
