package br.dev.mmddkk.vetor1.view;

import java.util.Scanner;

// Snake Case smh
public class Principal_V1 {

    public static void main(String[] args) {
        
        // Scanner eba
        Scanner sc = new Scanner(System.in);
        
        // Iniciar as vari�veis
        int tamanho = 0; // Iniciar no 0 para o do while funcionar
        int vet[]; // Array sem inicializar
        
        // Perguntar qual ser� o tamanho, e ter certeza que � maior que 0
        do {
            
            System.out.print("Informe qual ser� o tamanho da lista: ");
            tamanho = sc.nextInt();
            
            if ( tamanho < 1)
                System.out.println("Tamanho inv�lido!");
            
        } while( tamanho < 1);
        
        // Inicializar array com tamanho desejado
        vet = new int[tamanho];
        
        //Pegar os valores do array
        for (int i = 0; i < vet.length; i++) {
            
            System.out.printf("Informe o %d� n�mero: ", i + 1);
            int num = sc.nextInt();
            vet[i] = num;
            
        }
        
        /*// Imprimir os valores da array
        for (int i = 0; i < vet.length; i++) {
            
            System.out.printf("%d� n�mero: %d\n", i + 1, vet[i]);
            
        }*/
        
        /*// Imprimir os valores da array, somando 10
        for (int i = 0; i < vet.length; i++) {
            
            System.out.printf("%d� n�mero: %d\n", i + 1, vet[i] + 10);
            
        }*/
        
        System.out.printf("3� posi��o da lista: %d\n", vet[2]);
        
        sc.close();
        
    }
    
}
