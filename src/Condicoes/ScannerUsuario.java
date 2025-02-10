package Condicoes;

import java.util.Scanner;

public class ScannerUsuario {
    public static void main(String[] args) {
        /*
         * Scanner = é um jeito dee trazer o ususario para dentro da aplicacao
         * Objetivo: o usuario vai criar um ninja e vamos validar os dados
         * */
        Scanner caixaDeTexto = new Scanner(System.in);
        // Receber o nome do ninja
        System.out.println("Digite o nome do Ninja");
        String nomeDoNinja = caixaDeTexto.nextLine();
        System.out.println("O nome do ninja é: " + nomeDoNinja);
        //Receber a idade do ninja
        System.out.println("Digite a idade do Ninja");
        int idadeDoNinja = caixaDeTexto.nextInt();
        System.out.println("A idade do ninja é: " + idadeDoNinja + " Anos");
        //Tratamento de dados
        if (idadeDoNinja >= 18){
            System.out.println("Esse ninja é maior de idade e pode ir para missoes fora da aldeira");
        } else {
            System.out.println("Esse ninja é menor de idade e só pode fazer missoes dentro da aldeida");
        }
        caixaDeTexto.close();
    }

}
