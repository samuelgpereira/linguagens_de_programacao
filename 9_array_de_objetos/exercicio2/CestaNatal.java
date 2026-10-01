
public class CestaNatal {
    public static void main(String[] args){
        Itens item_0 = new Itens(13458, "Panetone", 1, 30.00);
        Itens item_1 = new Itens(13459, "Chocotone", 1, 40.00);
        Itens item_2 = new Itens(30469, "Chester", 1, 35.00);
        Itens item_3 = new Itens(35623, "Peru", 1, 40.00);

        Itens[] cesta = {item_0, item_1, item_2, item_3};

        for(Itens produto: cesta){
            System.out.println("Codigo: " + produto.codigo + " - Produto: " + produto.nome + " - Quantidade: " + produto.quantidade + " - Preco: R$" + String.format("%.2f", produto.preco));
        }
    }
    
    
}
