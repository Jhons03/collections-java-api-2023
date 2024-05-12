import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private final List<Item> itensList;

    public CarrinhoDeCompras() {
        this.itensList = new ArrayList<>();
    }
    public void adicionarItem(String nome, int quantidade, double preco) {
        Item item = new Item(nome, quantidade, preco);
        this.itensList.add(item);
    }

    public void removerItem(String nome) {
        List<Item> listaNomeParaRemover = new ArrayList<>();
        if (!itensList.isEmpty()) {
            for (Item item : itensList) {
                if (item.getNome().equalsIgnoreCase(nome)) {
                    listaNomeParaRemover.add(item);
                }
            }
            itensList.removeAll(listaNomeParaRemover);
        } else {
            System.out.println("A lista está vazia");
        }
    }
    public void calcularValorTotal() {
        double total = 0;
        for (Item item : itensList) {
            double valorItem = item.getPreco() * item.getQuantidade();
            total += valorItem;
        }
        System.out.println("O total do carrinho é: R$" + total);
    }
    public void exibirItens() {
        for (Item item : itensList) {
            System.out.println(item.getNome() + " - " + item.getQuantidade() + " - " + item.getPreco());
        }
    }
    public static void main(String[] args) {
        CarrinhoDeCompras compras = new CarrinhoDeCompras();
        compras.adicionarItem("iPhone", 3, 2500);
        compras.adicionarItem("iPad", 2, 3000);
        compras.exibirItens();
        compras.calcularValorTotal();
        compras.removerItem("iPad");
        compras.exibirItens();
    }


}
