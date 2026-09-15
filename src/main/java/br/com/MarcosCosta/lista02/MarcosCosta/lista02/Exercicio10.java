package br.com.MarcosCosta.lista02.MarcosCosta.lista02;

import java.util.Scanner;

public class Exercicio10 {
    static void main() {
        //10. Ler o nome de usuário e a senha. Se o usuário for diferente
        //de admin, imprimir que o usuário não foi encontrado e não
        //verificar a senha. Se o usuário existir, verificar a senha: se for
        //java123, o acesso é liberado; caso contrário, a senha está
        //incorreta. São três saídas diferentes.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu usuário:");
        String usuario = sc.nextLine();
        String senha;
        if (usuario.equals("admin")) {
            System.out.println("Digite sua senha:");
            senha = sc.nextLine();
            if (senha.equals("java123")) {
                System.out.println("Acesso liberado!");
            } else {
                System.out.println("Senha incorreta!");
            }
            } else {
                System.out.println("Usuário não encontrado");
            }

        }

    }

