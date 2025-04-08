package prova;

import java.util.Scanner;

public class ProvaMain {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual o preço da gasolina por litro?");
        double gas = ler.nextDouble();
        
        System.out.println("Qual o preço do etanol por litro?");
        double eta = ler.nextDouble();
        
        double paridade = eta / gas;
        
        System.out.printf("Paridade de %.2f\n", paridade);
        
        if (paridade > 0.7)
            System.out.println("Você deve abastescer com gasolina!");
        else {
            System.out.println("Vcoê deve abastescer com etanol!");
        }
    }
    
}
