package br.dev.mmddkk.listasalarios;

import java.util.Scanner;

public class view {

    public static void main(String[] args) {
                
        // Scanner eba
        Scanner sc = new Scanner(System.in);
        
        // Iniciar as variáveis
        int tamanho = 0; // Iniciar no 0 para o do while funcionar
        double[] salarios; // Array sem inicializar
        
        // Perguntar qual será o tamanho, e ter certeza que é maior que 0
        do {
            
            System.out.print("Informe qual será o tamanho da lista de salários: ");
            tamanho = sc.nextInt();
            sc.nextLine(); // Consumir o enter
            
            if ( tamanho < 1)
                System.out.println("Tamanho inválido!");
            
        } while( tamanho < 1);
        
        // Inicializar array com tamanho desejado
        salarios = new double[tamanho];
        
        //Pegar os valores do array
        for (int i = 0; i < salarios.length; i++) {
            
            System.out.printf("Informe o %dº salário: ", i + 1);
            // Remover espaçoes em brando no começo e fim
            double salario = sc.nextDouble();
            salarios[i] = salario;
            
        }
        
        System.out.println("");
        
        double menorSalario = salarios[0];
        double maiorSalario = 0;
        double mediaSalario = 0;
        double totalSalario = 0;
        
        // Imprimir os valores da array
        for (double salario : salarios) {
            
            if (salario > maiorSalario)
                maiorSalario = salario;
            
            if (salario < menorSalario)
                menorSalario = salario;
            
            System.out.printf("Salário: %.2f\n", salario);
            
            totalSalario += salario;
            
        }
        
        mediaSalario = totalSalario / salarios.length;
        
        
        System.out.printf("\nMaior salário: %.2f\n", maiorSalario);
        System.out.printf("Menor salário: %.2f\n", menorSalario);
        System.out.printf("Média de salários: %.2f\n", mediaSalario);
        System.out.printf("Total de salários: %.2f\n", totalSalario);
        
        // fecha
        sc.close();
    }
    
}
