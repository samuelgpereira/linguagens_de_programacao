//Faça um algoritmo em Java que irá analisar a idade e exibir se a pessoa é: criança (0-12); adolescente(13-17); adulto (18-59); idoso (>60)

package exercicios.exercicio_2_condicional;

public class Main {
    public static void main(String [] args){
        int idade = 18;//Determino um valor qualquer para a idade
        if (idade <12){
            System.out.println("Crianca");
        }
        else if (idade >=12 && idade <18){
            System.out.println("Adolescente");
        }
        else if (idade >=18 && idade<60){
            System.out.println("Adulto");
        }
        else{
            System.out.println("Idoso");
        }


    }
    
}
