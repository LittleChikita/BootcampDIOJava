package list;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Little Chikita
 */
public class CarrinhoDeCompras {

    //atributo
    List<Item> listaItens;

    public CarrinhoDeCompras() {
        this.listaItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        listaItens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome, int quantidade) {
        List<Item> listaItensParaRemover = new ArrayList<>();
        for (Item i : listaItens) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                if(i.getQuantidade() <= quantidade){
                    listaItensParaRemover.add(i);
                } else {
                    i.setQuantidade(i.getQuantidade() - quantidade);
                }
            }
        }
        listaItens.removeAll(listaItensParaRemover);
    }

    public void calcularValorTotal() {
        double soma = 0;
        for (Item i : listaItens) {
            soma += i.getPreco() * i.getQuantidade();
        }
        System.out.println(soma);
    }
    
    public void exibirItens(){
        System.out.println(listaItens);
    }
    public static void main(String[] args) {

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Pc", 12.00, 1);
        carrinho.adicionarItem("Celular", 12.00, 2);
        carrinho.calcularValorTotal();
        carrinho.exibirItens();
        carrinho.removerItem("Celular", 2);
        carrinho.exibirItens();
    }

}
