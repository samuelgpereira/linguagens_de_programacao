public class Main {
    public static void main(String[] args){
        // String saudacao = "Hello World";
        // System.out.println(saudacao.length());//A função "length" conta quantos caracteres tem na frase "Hello World"
        // System.out.println(saudacao.toUpperCase());//Converte todas as letras para maiúsculas
        // System.out.println(saudacao.toLowerCase());//Converte todas as letras para minúsculas
        // System.out.println(saudacao.indexOf("W"));//Retorna a posição da letra
        // System.out.println(saudacao.charAt(6));//Retorna a letra na posição 6

        //Estamos usando o padrão snake_case
        // String aluno_1 = "Miranata";
        // String aluno_2 = "Aeronauta";
        // System.out.println(aluno_1.equals(aluno_2));//false
        
        // String mensagem = " Hello World ";
        // System.out.println("-" + mensagem.trim() + "-");//Comando trim remove os espaços

        // String nome = "Savalo";
        // String sobrenome = "Horse";
        // System.out.println(nome + " " + sobrenome);//Concatenar. Junta as strings "nome" e "sobrenome
        
        // String aluno_3 = "Pombinha Da Paz Silva";
        // System.out.println(aluno_3.contains("Paz"));//Comando contains vai verificar se existe a palavra "Paz" na frase. Caso tenha, true. Caso não tenha, false.

        // String aluno_4 = "";
        // System.out.println(aluno_4.isEmpty());//Comando isEmpty verifica se a variável "aluno_4" está vazia

        // String frutas = String.join("-", "Laranja", "Banana");
        // System.out.println(frutas);//Comando "join" junta os elementos ("Laranja" e "Banana"), separando-os com o "-"

        // String nome_completo = "Del Lokon Pirom";
        // System.out.println(nome_completo.replace("m","n"));//Comando "replace" substitui a letra "m" por "n"

        String texto = "Boa noite!";
        System.out.println(texto.substring(4, 9));//Comando "substring" extrai da frase "Boa noite!" os caracteres da posição 4 até a 9 (noite)

        String frase = "Repetição com \"correção\" leva à \"perfeição\"";//Utilizo a "\" para deixar as palavras "correção" e "perfeição" entre aspas
        System.out.println(frase);


    }
    
}
