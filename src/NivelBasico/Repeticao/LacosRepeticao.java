package NivelBasico.Repeticao;

public class LacosRepeticao {
    public static void main(String[] args) {

        /*
        * Laços de repeticao: Vao repetir intinitamente ou ate voce atingir o parametro desejado
        * While && For
        * */

        //While
        //While (condicao) {Tudo aqui vai acontecer}

        int numeroClones = 0;
        int numeroMaximoClones = 40;

        while (numeroClones <= numeroMaximoClones){
            numeroClones++;
            System.out.println("O naruto fez um clone das sombras " + numeroClones);
            System.out.println("--------------------------------------");

        }

        //For
        for (int i = 0; i <= numeroClones; i++) {
            System.out.println("O naruto esta se clonando e ja se clonou " + i);
        }
    }
}
