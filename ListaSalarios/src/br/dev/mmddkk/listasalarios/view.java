package br.dev.mmddkk.listasalarios;

import java.util.Scanner;

public class view {

    public static void main(String[] args) {
                
        // Scanner eba
        Scanner sc = new Scanner(System.in);
        
        // Iniciar as vari�veis
        int tamanho = 0; // Iniciar no 0 para o do while funcionar
        double[] salarios; // Array sem inicializar
        
        // Perguntar qual ser� o tamanho, e ter certeza que � maior que 0
        do {
            
            System.out.print("Informe qual ser� o tamanho da lista de sal�rios: ");
            tamanho = sc.nextInt();
            sc.nextLine(); // Consumir o enter
            
            if ( tamanho < 1)
                System.out.println("Tamanho inv�lido!");
            
        } while( tamanho < 1);
        
        // Inicializar array com tamanho desejado
        salarios = new double[tamanho];
        
        //Pegar os valores do array
        for (int i = 0; i < salarios.length; i++) {
            
            System.out.printf("Informe o %d� sal�rio: ", i + 1);
            // Remover espa�oes em brando no come�o e fim
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
            
            System.out.printf("Sal�rio: %.2f\n", salario);
            
            totalSalario += salario;
            
        }
        
        mediaSalario = totalSalario / salarios.length;
        
        
        System.out.printf("\nMaior sal�rio: %.2f\n", maiorSalario);
        System.out.printf("Menor sal�rio: %.2f\n", menorSalario);
        System.out.printf("M�dia de sal�rios: %.2f\n", mediaSalario);
        System.out.printf("Total de sal�rios: %.2f\n", totalSalario);
        
        // fecha
        sc.close();
    }
    
}
