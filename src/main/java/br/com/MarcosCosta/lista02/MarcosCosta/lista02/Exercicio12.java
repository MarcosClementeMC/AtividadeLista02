package br.com.MarcosCosta.lista02.MarcosCosta.lista02;

import java.util.Scanner;

public class Exercicio12 {
    static void main() {
        //12. Ler o saldo da conta, o limite diário de saque e o valor
        //solicitado. Se o saldo for menor que o valor, informar saldo
        //insuficiente e não realizar as verificações seguintes. Havendo
        //saldo, verificar o limite: se o valor ultrapassar o limite diário,
        //informar isso; caso contrário, efetuar o saque e imprimir o novo
        //saldo.
        Scanner sc = new Scanner(System.in);
        int saldo = 2500;
        int limite = 1000;
        System.out.println("Digite o valor do saque");
        int valor = sc.nextInt();
        if (saldo > valor) {
            if (valor < limite) {
                System.out.println("Saque aprovado com sucesso!\nSaldo disponivel: R$ "+ (saldo - valor));
            } else {
            System.out.println("Limite de saque excedido!");
            }

            } else {
            System.out.println("Saldo insuficiente");

            }
        }
}

