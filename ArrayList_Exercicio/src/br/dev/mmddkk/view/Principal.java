package br.dev.mmddkk.view;

import java.util.ArrayList;
import br.dev.mmddkk.model.Produto;

public class Principal {

    public static void main(String[] args) {
        
        ArrayList<Produto> produtos = new ArrayList<>();
        
        Produto bolacha = new Produto("Bolacha", 2.5, 30);
        Produto biscoito = new Produto("Biscoito", 3, 15);
        Produto macarrao = new Produto("Macarrão", 2, 50);
        
        produtos.add(bolacha);
        produtos.add(biscoito);
        produtos.add(macarrao);
        
        for (Produto produto : produtos) {
            System.out.printf("Nome do produto: %s | Preço por unidade: %.2f | Quantidade em estoque: %d | Preço total do estoque: %.2f\n", produto.nome, produto.preco, produto.quantidade, produto.pegarPrecoDoEstoque());
        }

    }
}
