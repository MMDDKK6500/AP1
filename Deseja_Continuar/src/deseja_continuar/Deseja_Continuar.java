package deseja_continuar;

import java.util.Scanner;

public class Deseja_Continuar {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int soma = 0;
        
        String resp;
        
        do {
            soma += 1;
            System.out.println("A soma é: " + soma);
            
            System.out.print("Deseja continuar? (Sim/Não) ");
            resp = ler.nextLine();
            
        //} while (resp.equals("Sim"));
        //} while (resp.equalsIgnoreCase("Sim"));
        //} while (resp.compareTo("Sim") == 0);
        } while (resp.compareToIgnoreCase("Sim") == 0);
        
    }
    
}
