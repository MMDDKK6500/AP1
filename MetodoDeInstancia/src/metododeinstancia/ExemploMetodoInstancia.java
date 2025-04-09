package metododeinstancia;

import java.util.Scanner;

public class ExemploMetodoInstancia {

    public static void main(String[] args) {
            
        Scanner ler = new Scanner(System.in);
        
        Calculos obj = new Calculos();
        
        System.out.print("Primeiro número: ");
        double n1 = ler.nextDouble();
        
        System.out.print("Segundo número: ");
        double n2 = ler.nextDouble();
        
        System.out.println("A soma desses números são: " + obj.soma(n1, n2));
        System.out.println("A subtração desses números são: " + obj.subtracao(n1, n2));
        System.out.println("O produto desses números são: " + obj.multiplicacao(n1, n2));
        System.out.println("A divisão desses números são: " + obj.divisao(n1, n2));
        
    }
    
}
