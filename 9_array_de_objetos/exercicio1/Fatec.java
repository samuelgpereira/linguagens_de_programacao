
public class Fatec {
    public static void main(String[] args){
        Aluno aluno_0 = new Aluno("Inocencio Coitadinho", "inocencio.coitado@gmail.com");
        Aluno aluno_1 = new Aluno("Samuel Pereira", "samuel.gpereira2@gmail.com");
        Aluno aluno_2 = new Aluno("Samara Dias", "sdias12@gmail.com");
        Aluno aluno_3 = new Aluno("Maria Antonia", "maria.antonia2@gmail.com");

        Aluno[] faculdade = {aluno_0, aluno_1, aluno_2, aluno_3};

        for(Aluno pessoa: faculdade){
            System.out.println("Aluno: " + pessoa.nome + " - email: " + pessoa.email);
        }
    }
    
}
