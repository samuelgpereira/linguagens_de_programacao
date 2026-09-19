//Crie uma variável `numero` e mostre a tabuada de 1 a 10.
//Exemplo:

//5 x 1 = 5
//5 x 2 = 10
public class Main{
    public static void main(String[] args){
        int i = 0, numero = 5;
        while(i<11){
            System.out.println(numero + " x " + i + " = " + (numero*i));
            i++;
        }
    }
}