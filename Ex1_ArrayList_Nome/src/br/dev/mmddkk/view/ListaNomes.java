package br.dev.mmddkk.view;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaNomes {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        String resposta;
        int tamanho = 0;
        

        do {
            System.out.printf("Qual será o %dº nome? ", nomes.size() + 1);
            nomes.add(sc.nextLine());
            
            System.out.print("Deseja adicionar mais um nome? ");
            resposta = sc.nextLine().trim().toLowerCase();
            
        } while (resposta.equals("s") || resposta.equals("sim"));
        

        
        System.out.println("Lista de nomes:");  
        for (String nome : nomes) {
            System.out.println("\t" + nome);
        }
        
    }
    
}
