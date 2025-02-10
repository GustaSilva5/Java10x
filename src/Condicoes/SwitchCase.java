package Condicoes;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        /*
         * SwitchCases: Que serve para gerar casos especificos
         * Objetivo: Pedir para o Usuario escolher um ninja
         * */

        //Pedir para o Usuario
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um personagem");
        System.out.println("1 - Naruto Uzumali");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        //Pedir para o usuario escolher um ninja
        int escolhaNinja = scanner.nextInt();

        // System.out.println("Voce digitou o numero " + escolhaNinja);

        // Reacao ao escolher um ninja
        switch (escolhaNinja){
            case 1:
                System.out.println("Voce escolheu Naruto Uzumaki");
                break;
            case 2:
                System.out.println("Voce escolheu Sasuke Uchiha");
                break;
            case 3:
                System.out.println("Voce escolheu Sakura Haruno");
                break;
            default:
                System.out.println("O numero que voce escolhe é invalido");
        }

        //Fechar a caixa
        scanner.close();
    }
}
