package prova;

import java.util.Scanner;

public class ProvaMain {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual o pre�o da gasolina por litro?");
        double gas = ler.nextDouble();
        
        System.out.println("Qual o pre�o do etanol por litro?");
        double eta = ler.nextDouble();
        
        double paridade = eta / gas;
        
        System.out.printf("Paridade de %.2f\n", paridade);
        
        if (paridade > 0.7)
            System.out.println("Voc� deve abastescer com gasolina!");
        else {
            System.out.println("Vco� deve abastescer com etanol!");
        }
    }
    
}
