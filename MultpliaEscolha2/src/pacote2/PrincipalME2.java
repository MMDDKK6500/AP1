package pacote2;

import java.util.Scanner;

public class PrincipalME2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);        
        
        System.out.println("Qual produto você deseja saber o preço?");
        String produto = sc.nextLine().toLowerCase();
        
        switch(produto) {
            case "pao":
            case "bisnaga":
                System.out.println("O pão custa R$9,00 / Kg");
                break;
            
            case "banana":
                System.out.println("A duzia da banana custa R$12,00");
                break;
                
            default:
                System.out.println("Produto não encontrado!");
        }
        
    }
}
