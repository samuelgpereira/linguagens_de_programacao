package lista_de_exercicios.exercicio16;

public class Main {
    public static void main(String[] args){
        int [] numeros = {-8, -4, -7, -1, 0, 5, 8, 6, 7};
        int positivo = 0, negativo = 0, zero = 0;
        for(int i = 0; i < numeros.length; i++){
            if (numeros[i] > 0){
                positivo++;
            }
            if (numeros[i] < 0){
                negativo++;
            }
            if (numeros[i] == 0){
                zero++;
            }
        }
        System.out.println("Quantidade de numeros positivos: " + positivo);
        System.out.println("Quantidade de numeros negativos: " + negativo);
        System.out.println("Quantidade de numeros iguais a zero: " + zero);
        
    }
}
