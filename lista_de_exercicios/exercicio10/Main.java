public class Main{
    public static void main(String[] args){
        int i=0, soma=0;
        while(i<101){
            if(i%2==0){
                i++;
                soma = soma+i;
                System.out.println(+ soma);
            }
        }
    }
}