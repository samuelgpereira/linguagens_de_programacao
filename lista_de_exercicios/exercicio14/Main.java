//Dado:
// int[] numeros = {15,8,32,4,19,27};
// Encontre o maior número.

public class Main {
    public static void main(String[] args){
        int [] numeros = {15, 8, 32, 4, 19, 27};
        if(numeros[0] > numeros[1] && numeros[0] > numeros[2] && numeros[0] > numeros[3] && numeros[0] > numeros[4] && numeros[0] > numeros[5]){
            System.out.println("O maior numero eh: " + numeros[0]);
        }
        if(numeros[1] > numeros[0] && numeros[1] > numeros[2] && numeros[1] > numeros[3] && numeros[1] > numeros[4] && numeros[1] > numeros[5]){
            System.out.println("O maior numero eh: " + numeros[1]);
        }
        if(numeros[2] > numeros[0] && numeros[2] > numeros[1] && numeros[2] > numeros[3] && numeros[2] > numeros[4] && numeros[2] > numeros[5]){
            System.out.println("O maior numero eh: " + numeros[2]);
        }
        if(numeros[3] > numeros[0] && numeros[3] > numeros[1] && numeros[3] > numeros[2] && numeros[3] > numeros[4] && numeros[3] > numeros[5]){
            System.out.println("O maior numero eh: " + numeros[3]);
        }
        if(numeros[4] > numeros[0] && numeros[4] > numeros[1] && numeros[4] > numeros[2] && numeros[4] > numeros[3] && numeros[4] > numeros[5]){
            System.out.println("O maior numero eh: " + numeros[4]);
        }
        if(numeros[5] > numeros[0] && numeros[5] > numeros[1] && numeros[5] > numeros[2] && numeros[5] > numeros[3] && numeros[5] > numeros[4]){
            System.out.println("O maior numero eh: " + numeros[5]);
        }
    }
}
