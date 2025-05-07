package br.dev.mmddkk.model;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;
    
    public Produto(String Nome, double Preco, int Quantidade) {
        nome = Nome;
        preco = Preco;
        quantidade = Quantidade;
    }
    
    public double pegarPrecoDoEstoque() {
        return preco * quantidade;
    }
    
}
