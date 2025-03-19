package pacote;

import java.util.Scanner;

public class PrincipalEscolha1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Qual a sua opção? (a, b ou c)");
        
        char op = sc.next().charAt(0);
        
        switch(op) {
            case 'A':
            case 'a':
                System.out.println("Opção A.");
                break;
            
            case 'B':
            case 'b':
                System.out.println("Opção B.");
                break;
                
            case 'C':
            case 'c':
                System.out.println("Opção C.");
                break;
                
            default: 
               System.out.println("Opção Invalida.");
        }
    }
    
}
