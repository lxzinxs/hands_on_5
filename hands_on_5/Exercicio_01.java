import java.util.ArrayList;

public class Exercicio_01{
    public static void main(String[] args){
        ArrayList<String> carrinho = new ArrayList<>();

        carrinho.add("chocolate");
        carrinho.add("pão");
        carrinho.add("hamburguer");
        carrinho.add("pizza");
        carrinho.add("refrigerante");

        System.out.println("-------------------------");
        System.out.println("PRODUTOS CADASTRADOS\n");

        for(int i = 0; i < carrinho.size(); i ++){
            System.out.println(carrinho.get(i));
        }

        System.out.println("\nQuantidade de produto no carrinho: " + carrinho.size());
    }
}