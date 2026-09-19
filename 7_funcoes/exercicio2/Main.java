//Crie um programa contento uma função que irá receber um valor inteiro.
//O programa deverá exibir se o valor é: menor que zero, igual a zero ou maior que zero.

public class Main {
    static void valor(int n){
        if(n > 0){
            System.out.println("O valor eh maior que zero");
        } 
        if(n == 0){
            System.out.println("O valor eh igual a zero!");
        }
        if(n < 0){
            System.out.println("O valor eh menor que zero!");
        }
    } 

    public static void main(String[] args){
        valor(5);
    }

    
}
