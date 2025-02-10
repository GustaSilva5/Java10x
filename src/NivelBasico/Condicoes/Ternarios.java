package NivelBasico.Condicoes;

public class Ternarios {
    public static void main(String[] args) {

        /*
        * Ternarios: São maneirass de reduzir o codigo
        * variavel = (condicao) ? valorSeVerdadeiro : valorSeFalso;
        * */

        short missoesNinjas = 11;
        String nivelDoNinja = (missoesNinjas >= 10) ? "Esse ninja esta com mais de 10 missoes" : "Esse ninja tem menos de 10 missoes";
        System.out.println(nivelDoNinja);

    }
}
