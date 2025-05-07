package br.dev.mmddkk.view;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaNumero {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        String resposta;
        
        do {
            System.out.printf("Qual será o %dº numero? ", numeros.size() + 1);
            numeros.add(Integer.parseInt(sc.nextLine()));
            
            System.out.print("Deseja adicionar mais um numero? ");
            resposta = sc.nextLine().trim().toLowerCase();
            
        } while (resposta.equals("s") || resposta.equals("sim"));
        
        System.out.println("Lista de números:");
        for (int numero : numeros) {
            System.out.println("\t#" + (numeros.indexOf(numero) + 1) + ": " + numero);
        }
        
        do {
            
            System.out.print("Deseja remover mais um numero? ");
            resposta = sc.nextLine().trim().toLowerCase();
            
            if (resposta.equals("s") || resposta.equals("sim")) {
                System.out.print("Qual numero deseja remover? ");
                numeros.remove(Integer.parseInt(sc.nextLine()) - 1);
                
                System.out.println("Lista de números:");
                for (int numero : numeros) {
                    System.out.println("\t#" + (numeros.indexOf(numero) + 1) + ": " + numero);
                }
            }
            
        } while (resposta.equals("s") || resposta.equals("sim"));
        
        System.out.println("Lista de números:");
        for (int numero : numeros) {
            System.out.println("\t#" + (numeros.indexOf(numero) + 1) + ": " + numero);
        }
        
        int soma = 0;
        for(int numero : numeros) {
            soma += numero;
        }
        
        System.out.printf("Soma da lista: %d\n",soma);
        
    }
    
}
