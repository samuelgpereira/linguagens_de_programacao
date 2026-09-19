//Crie uma variável `nota` e mostre:

//- `Aprovado` se nota ≥ 6;
//- `Recuperação` se nota entre 4 e 5.9;
//- `Reprovado` se nota < 4.
public class Main{
    public static void main(String[] args){
        double nota=3.9;
        if(nota >= 6){
            System.out.println("Aprovado com nota: " + nota);
        }
        if(nota >= 4 && nota < 6){
            System.out.println("Recuperacao com nota : " + nota);
        }
            if(nota < 4){
                System.out.println("Reprovado com nota: " + nota);
            }
        }
    }
