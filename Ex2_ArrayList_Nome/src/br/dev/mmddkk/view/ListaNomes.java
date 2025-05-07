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
            System.out.printf("Qual ser� o %d� nome? ", nomes.size() + 1);
            nomes.add(sc.nextLine());
            
            System.out.print("Deseja adicionar mais um nome? ");
            resposta = sc.nextLine().trim().toLowerCase();
            
        } while (resposta.equals("s") || resposta.equals("sim"));
        
        
        do {
            System.out.println("Lista de nomes:");  
            for (String nome : nomes) {
                System.out.println("\t" + nome);
            }
            
            System.out.println("Deseja remover qual nome?");
            int index = nomes.indexOf(sc.nextLine());
            
            if (index == -1) {
                System.out.println("Nome inv�lido");
                resposta = "s";
            } else {
                nomes.remove(index);
                
                System.out.println("Lista de nomes:");  
                for (String nome : nomes) {
                    System.out.println("\t" + nome);
                }
                
                System.out.print("Deseja remover mais um nome? ");
                resposta = sc.nextLine().trim().toLowerCase();
            }
        } while ((resposta.equals("s") || resposta.equals("sim")) && nomes.size() > 0);
        
        System.out.println("Lista de nomes:");  
        for (String nome : nomes) {
            System.out.println("\t" + nome);
        }
        
    }
}
