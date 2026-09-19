//Calcule: 1+2+3+4...100
public class Main{
    public static void main(String[] args){
        int i=0, soma=0;
        while(i<101){
            soma = soma+i;
            i++;
            System.out.println(+ soma);
        }
    }
}