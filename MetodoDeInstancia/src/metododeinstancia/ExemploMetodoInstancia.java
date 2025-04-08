package metododeinstancia;

import java.util.Scanner;

public class ExemploMetodoInstancia {

    public static void main(String[] args) {
            
        Scanner ler = new Scanner(System.in);
        
        ExemploMetodoInstancia obj = new ExemploMetodoInstancia();
        
        System.out.print("Primeiro n�mero: ");
        double n1 = ler.nextDouble();
        
        System.out.print("Segundo n�mero: ");
        double n2 = ler.nextDouble();
        
        System.out.println("A soma desses n�meros s�o: " + obj.soma(n1, n2));
        System.out.println("A subtra��o desses n�meros s�o: " + obj.subtracao(n1, n2));
        System.out.println("O produto desses n�meros s�o: " + obj.multiplicacao(n1, n2));
        System.out.println("A divis�o desses n�meros s�o: " + obj.divisao(n1, n2));
        
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
