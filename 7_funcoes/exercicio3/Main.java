//Crie um programa contendo uma função que irá receber o nome do aluno e uma nota.
//Caso a nota seja ≥ 7, deverá exibir que o aluno está aprovado, senão, exibir reprovado.

public class Main {
    static void avaliacao(String nome, int nota){
        if(nota >= 7){
            System.out.println("O aluno(a)" + nome "esta aprovado(a) com nota" + nota);
        }
        if(nota < 7){
            System.out.println("O aluno(a)" + nome "esta reprovado(a) com nota " + nota);
        }

        public static void main(String[] args){
        avaliacao("Samuel" , 8);
        }
    }
    
}
