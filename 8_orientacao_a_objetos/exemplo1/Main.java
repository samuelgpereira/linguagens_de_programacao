public class Main{
    public static void main(String[] args){
        Personagem persona = new Personagem();//Cria um clone da classe "Personagem"
        persona.nome = "Pateta";//Define o nome para personagem em específico
        persona.idade = 42;//Define a idade para esse personagem em específico
        persona.poder = 4;//Define o poder para esse personagem em específico

        System.out.println(persona.nome);
        System.out.println(persona.idade);
        System.out.println(persona.poder);
        persona.pular();
        persona.correr();
    }
}