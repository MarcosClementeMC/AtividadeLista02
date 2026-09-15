package br.com.MarcosCosta.lista02.MarcosCosta.lista02;

import java.util.Scanner;

public class Exercicio03 {
    static void main() {
        //3. Ler a temperatura em graus Celsius e a umidade relativa do
        //ar em porcentagem. Imprimir os alertas que se aplicam:
        //temperatura de 38 graus ou mais gera alerta de calor extremo,
        //umidade abaixo de 30 por cento gera alerta de umidade baixa,
        //temperatura de 35 graus ou mais com umidade abaixo de 20
        //por cento gera alerta de risco de queimada.
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a temperatura");
        double temp = sc.nextDouble();
        if (temp >= 38.0) {
            System.out.println("------Alerta! Calor extremo!------");
        }

        System.out.println("Agora, informe a  % de umidade relativa do ar");
        double umi = sc.nextDouble();
        if (umi < 30.0) {
            System.out.println("Atenção! Umidade baixa");
        }
        if (temp >= 35 && umi < 20) {
            System.out.println("Alerta! Risco de queimada!");
        }


    }
}
