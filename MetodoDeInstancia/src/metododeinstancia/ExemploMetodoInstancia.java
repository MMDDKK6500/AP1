package metododeinstancia;

import java.util.Scanner;

public class ExemploMetodoInstancia {

    public static void main(String[] args) {
            
        Scanner ler = new Scanner(System.in);
        
        ExemploMetodoInstancia obj = new ExemploMetodoInstancia();
        
        System.out.print("Primeiro número: ");
        double n1 = ler.nextDouble();
        
        System.out.print("Segundo número: ");
        double n2 = ler.nextDouble();
        
        System.out.println("A soma desses números são: " + obj.soma(n1, n2));
        System.out.println("A subtração desses números são: " + obj.subtracao(n1, n2));
        System.out.println("O produto desses números são: " + obj.multiplicacao(n1, n2));
        System.out.println("A divisão desses números são: " + obj.divisao(n1, n2));
        
    }
    
    public double soma(double a, double b) {
        double s = a + b;
        
        return s;
    }
    
    public double subtracao(double a, double b) {
        double s = a - b;
        
        return s;
    }
    
    public double multiplicacao(double a, double b) {
        double s = a * b;
        
        return s;
    }
    
    public double divisao(double a, double b) {
        double s = a / b;
        
        return s;
    }
    
}
