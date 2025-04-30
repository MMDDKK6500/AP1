package br.dev.mmddkk.view;

import java.util.Scanner;

public class PlanilhaDeNotas {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        float[][] notas = new float[3][3];
        float[] medias = new float[3];
        
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite as 3 notas do aluno " + (i + 1) + ": ");
            float soma = 0;
            for(int j = 0; j < notas[i].length; j++) {
                do {
                    System.out.print("Nota " + (j + 1) + ": ");
                    notas[i][j] = sc.nextFloat();
                    
                    if (notas[i][j] > 10 || notas[i][j] < 0)
                        System.out.println("Nota deve ser entre 0 e 10");
                
                } while (notas[i][j] > 10 || notas[i][j] < 0);
                
                soma += notas[i][j];
            }
            medias[i] = soma / 3;
        }
        
        System.out.println("\nNotas e médias dos alunos:");
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Aluno " + (i + 1) + ": ");
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j]);
                if (j != 2)
                    System.out.print(" - ");
            }
            System.out.printf(" | Média: %.2f\n", medias[i]);
        }
        
        sc.close();
        
    }
    
}
