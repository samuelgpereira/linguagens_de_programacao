public class Main {
    public static void main(String[] args){
        // String[] alunos = {"Miranata", "Savalo", "Aeronauta"};//Utilizo essa função para incluir vários alunos dentro de apenas uma variável,
        // //de modo que não preciso criar uma variável para cada aluno
        // alunos[0] = "Mariazinha";//Substitui o nome da posição 0 (Miranata) por "Mariazinha"
        // System.out.println("Quantidade de alunos: " + alunos.length);//Conta quantos elementos (alunos, nesse caso) há na lista
        // for (String estudante : alunos){
        //     System.out.println(estudante);
        // }

        //Exercício: Crie uma lista com 5 produtos e exiba cada produto utilizando foreach e também 
        //Respostas:
        //For each:
        // String[] produtos = {"Fone","Teclado","Mouse","Monitor","Caixa de som"};
        // for (String item : produtos){
        //     System.out.println(item);
        // }

        //For:
        // String [] produtos = {"Fone", "Teclado", "Mouse", "Monitor", "Caixa de som"};
        // for (int i=0; i < produtos.length; i++){
        //     System.out.println(produtos[i]);
        // }

        //Exercício: Crie um array contendo 5 números. Use foreach para exibir se cada número é positivo, negativo ou igual a zero.
        //Resposta com for:
        // int [] numerais = {-2, -1, 0, 1, 2};
        // for (int i = 0; i <= numerais.length; i++){
        //     if (numerais [i] < 0)
        //     System.out.println("O valor de " + numerais[i] + " eh negativo");
        //     if (numerais [i] == 0)
        //     System.out.println("O valor de " + numerais [i] + " eh zero");
        //     if (numerais [i] > 0)
        //     System.out.println("O valor de " + numerais [i] + " eh positivo");
        // }

        //Resposta com foreach
        int [] numerais = {-2, -1, 0, 1, 2};
        for (int numero:numerais){
            if (numero < 0)
            System.out.println ("O valor de " + numero + " eh negativo");
            if (numero == 0)
            System.out.println ("O valor de " + numero + " eh zero");
            if (numero > 0)
            System.out.println("O valor de " + numero + " eh positivo");
        }

    }
    
}
