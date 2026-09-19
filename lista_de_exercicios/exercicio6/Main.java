//Mostre todos os números pares de 1 até 100
public class Main{
    public static void main(String[] args){
        int i=0;
        while(i<101){
            if(i%2==0){
                System.out.println(i);
            i+=2;
            }
        }
    }
}