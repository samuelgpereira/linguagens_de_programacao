package exercicios.exercicio_1_condicional;
//Crie um script para exibir se a luz está acesa ou apagada.
public class Main {
    public static void main(String [] args){
        // boolean acesa = false;

        // if (acesa){
        //     System.out.println("A luz esta acesa.");
        // }
        // else{
        //     System.out.println("A luz esta apagada.");

        //Resolvendo com if ternário
        boolean acesa = false;
        String mensagem = (acesa) ? "A luz esta acesa." : "A luz esta apagada";
        System.out.println(mensagem);
        }

    }
    

