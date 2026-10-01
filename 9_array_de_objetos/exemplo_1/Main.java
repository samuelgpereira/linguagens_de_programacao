
public class Main {
    public static void main(String[] args){
        Veiculo carro_1 = new Veiculo("Fiat", "Uno");
        Veiculo carro_2 = new Veiculo("BYD", "Compact 2026");
        Veiculo carro_3 = new Veiculo("Honda", "Civic");
        Veiculo carro_4 = new Veiculo("Gurgel", "Gurgel 1960");

        // System.out.println("Carro 1: " + carro_1.marca);
        Veiculo[] estacionamento = {carro_1, carro_2, carro_3,carro_4};//Usando array para criar uma lista de classes (carros), ao invés de fazer um de cada vez como na linha acima

        for(Veiculo item: estacionamento){
            System.out.println("Marca: " + item.marca);
            System.out.println("Marca: " + item.modelo);
        }
    }
    
}
