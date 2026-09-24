public class Main {
    public static void main(String[] args){
        
        //Carro 1:
        Carro veiculo = new Carro();
        veiculo.marca = "Chevrolet";
        veiculo.modelo = "Corsa";
        veiculo.combustivel = "Alcool/Gasolina";
        veiculo.cor = "Prata";

        System.out.println("Caracteristicas:");
        System.out.println("Marca: "+ veiculo.marca);
        System.out.println("Modelo: " + veiculo.modelo);
        System.out.println("Combustivel: " + veiculo.combustivel);
        System.out.println("Cor: " + veiculo.cor);
        veiculo.ligar();
        veiculo.desligar();
        System.out.println("\n");

        //Carro 2:
        Carro veiculo2 = new Carro();
        veiculo2.marca = "Toyota";
        veiculo2.modelo = "Corolla";
        veiculo2.combustivel = "Alcool/Gasolina";
        veiculo2.cor = "Preto";


        System.out.println("Caracteristicas:");
        System.out.println("Marca: " + veiculo2.marca);
        System.out.println("Modelo: " + veiculo2.modelo);
        System.out.println("Combustivel: " + veiculo2.combustivel);
        System.out.println("Combustivel: " + veiculo2.cor);
        veiculo2.ligar();
        veiculo2.ligar();
        System.out.println("\n");

        //Moto 1:
        Moto moto1 = new Moto();
        moto1.marca = "Honda";
        moto1.modelo = "CG";
        moto1.combustivel = "Gasolina";
        moto1.cilindradas = 125;

        System.out.println("Caracteristicas: ");
        System.out.println("Marca: " +moto1.marca);
        System.out.println("Modelo: " +moto1.modelo);
        System.out.println("Combustivel: " +moto1.combustivel);
        System.out.println("Cilindradas: " +moto1.cilindradas);
        moto1.ligar();
        moto1.desligar();
        
    }
    
}
