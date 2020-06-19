public class Refrigerante{
    private String nome;
    private double preco;
    private int quantidade;


    public Refrigerante(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome(){
        return this.nome;
    }
    public double getPreco(){
        return this.preco;
    }
    public int getQuantidade(){
        return this.quantidade;
    }

    public void tirarEstoque(){
        this.quantidade--;
    }
}
