package metodoestatico2;

import java.util.Scanner;

public class PrincipalME2 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Informe um n�mero: ");
        int num = ler.nextInt();
        
        //Chamada do m�todo est�tico
        buscarImparOuPar(num);
        
        ler.close();
        
    }
    
    static void buscarImparOuPar(int num) {
        if (num % 2 == 0)
            System.out.printf("O n�mero %d � par!\n", num);
        else
            System.out.printf("O n�mero %d � impar!\n", num);
    }
    
}
