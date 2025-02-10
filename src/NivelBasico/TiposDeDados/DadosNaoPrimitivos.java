package NivelBasico.TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        /*
         * Dados Primitivos : São tipos de dados que de maneira geral nao recebem metodos de maneira padrao
         * ------------------------------------------------------------------------------------------------
         * Dados Nao Primitivos: Sao tipos de dados em que pode-se colocar metodos para fazer alteracoes na
         * variavel sem que seja mudado seu esccopo
         *
         * Dados nao Primitivos: String, Array, Class, enum
         * Objetivo: Criar um ninja e atribuir metodos a ele
         */
        String nome = "Naruto Uzumaki";
        String nomeToUppercase = nome.toUpperCase(); //Vai colocar em Capslock
        System.out.println(nomeToUppercase);
        String aldeia = "ALDEIA DA FOLHA";
        String aldeiaToLoweCase = aldeia.toLowerCase();
        System.out.println(aldeiaToLoweCase); // Vai colocar em Caixa baixa
    }
}
