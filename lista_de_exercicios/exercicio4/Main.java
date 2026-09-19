//Crie 3 variáveis aleatórias inteiras e exiba qual é a maior.
public class Main{
    public static void main(String[] args){
        int valor1 = 314, valor2 = 31, valor3 = 314;
        if(valor1 >= valor2 && valor1 >= valor3){
            System.out.println("O maior valor eh: " + valor1);
        }
        if(valor2 > valor1 && valor2 >= valor3){
            System.out.println("O maior valor eh: " + valor2);
        }
        if(valor3 > valor1 && valor3 > valor2){
            System.out.println("O maior valor eh: " + valor3);
        }
    }
}