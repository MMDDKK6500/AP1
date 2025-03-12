package pode_dirigir;

import java.util.Scanner;

public class PodeDirigir {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String pode = "Não";
        
        System.out.println("Qual seu nome? ");
        String nome = sc.nextLine();
        
        System.out.println("Qual sua idade? ");
        byte idade = sc.nextByte();
        
        if (idade >= 18)
            pode = "Sim";
        
        System.out.printf("Nome: %s \nIdade: %d \nPode dirigir? %s \n", nome, idade, pode);
        
        sc.close();
    }
    
}
