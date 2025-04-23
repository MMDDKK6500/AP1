package br.dev.mmddkk.listanomes.view;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        // Scanner eba
        Scanner sc = new Scanner(System.in);
        
        // Iniciar as variáveis
        int tamanho = 0; // Iniciar no 0 para o do while funcionar
        String[] nomes; // Array sem inicializar
        
        // Perguntar qual será o tamanho, e ter certeza que é maior que 0
        do {
            
            System.out.print("Informe qual será o tamanho da lista de nomes: ");
            tamanho = sc.nextInt();
            sc.nextLine(); // Consumir o enter
            
            if ( tamanho < 1)
                System.out.println("Tamanho inválido!");
            
        } while( tamanho < 1);
        
        // Inicializar array com tamanho desejado
        nomes = new String[tamanho];
        
        //Pegar os valores do array
        for (int i = 0; i < nomes.length; i++) {
            
            System.out.printf("Informe o %dº nome: ", i + 1);
            // Remover espaçoes em brando no começo e fim
            String nome = sc.nextLine().trim();
            nomes[i] = nome;
            
        }
        
//        // Imprimir os valores da array
//        for (int i = 0; i < nomes.length; i++) {
//            
//            System.out.printf("%dº nome: %s\n", i + 1, nomes[i]);
//            
//        }
        
        // Imprimir os valores da array
        for (String nome : nomes) {
            
            System.out.printf("Nome: %s\n", nome);
            
        }
        
        // fecha
        sc.close();
        
    }
    
}
