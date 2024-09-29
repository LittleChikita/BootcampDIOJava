
package list;

/**
 *
 * @author Little Chikita
 */
public class Item {
    
    //atributo
    private String nome;
    private double preco;
    private int quantidade;
    
    //construtor
    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    

    @Override
    public String toString() {
        return "Item{" + "nome = " + nome + ", preço = " + preco + ", quantidade = " + quantidade + '}' ;
    }
    
    
    
    
    
}
