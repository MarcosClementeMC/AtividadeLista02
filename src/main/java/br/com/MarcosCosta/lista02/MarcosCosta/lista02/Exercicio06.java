package br.com.MarcosCosta.lista02.MarcosCosta.lista02;

import java.util.Scanner;

public class Exercicio06 {
    static void main() {
        //6. Ler o valor de uma compra. Compras de 199,00 ou mais têm
        //frete grátis; abaixo disso o frete é 24,90. Imprimir o valor do
        //frete e o total a pagar nos dois casos.
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor da compra");
        double compra = sc.nextDouble();
        if (compra > 199.00) {
            System.out.println("Parabens! Você ganhou frete grátis!\nValor total da compra: R$" + compra);

        } else {
            System.out.println("Sua compra não é elegivel para frete grátis, adicione mais R$" + (199.00 - compra) + " e obtenha frete grátis, ou pague 24,90 no seu frete.");
            System.out.println("Valor da compra: R$" + compra);
            System.out.println("Valor do frete: R$24,90");
            System.out.println("Valor total da compra: R$" + (compra + 24.90));
        }
    }
}
