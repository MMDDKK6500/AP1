package pacote;

import java.util.Scanner;

public class PrincipalEscolha1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Qual a sua op��o? (a, b ou c)");
        
        char op = sc.next().charAt(0);
        
        switch(op) {
            case 'A':
            case 'a':
                System.out.println("Op��o A.");
                break;
            
            case 'B':
            case 'b':
                System.out.println("Op��o B.");
                break;
                
            case 'C':
            case 'c':
                System.out.println("Op��o C.");
                break;
                
            default: 
               System.out.println("Op��o Invalida.");
        }
    }
    
}
