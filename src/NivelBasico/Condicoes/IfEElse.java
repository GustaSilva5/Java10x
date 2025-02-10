package NivelBasico.Condicoes;

public class IfEElse {
    public static void main(String[] args) {
        /*
         * If e Else - NivelBasico.TiposDeDados.Condicoes
         * Objetivo: Passar o ninja de nivel de acordo com o numero de missoes
         * */
        String nome = "Naruto Uzumaki";
        int idade = 16;
        boolean hokage = false;
        short numeroMissoes = 10;
        // Se (condicao) {faça isso}
        if (numeroMissoes >= 10){
            System.out.println("Naruto esta pronto para subir de rank");
        } else {
            System.out.println("Não esta pronto para subir de rank");
        }
        // Condicao com multiplas condicoes (& = E = as duas condicoes tem que ser verdadeiras para ser cumpridas)
        if (numeroMissoes > 10 && idade > 15){
            System.out.println("Naruto esta pronto para subir de rank");
        } else {
            System.out.println("Não esta pronto para subir de rank");
        }
        // Condicao com multiplas condicoes (|| = OU = apenas umas das condicoes tem que ser verdadeiras para ser cumpridas)
        if (numeroMissoes > 10 || idade > 15){
            System.out.println("Naruto esta pronto para subir de rank");
        } else {
            System.out.println("Não esta pronto para subir de rank");
        }
    }
}
