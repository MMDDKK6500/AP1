package metododeinstanciaplus;

import java.util.Arrays;
import java.util.Scanner;

public class ExemploMetodoInstanciaPlus {
    
    //nn consegui fazer
    
    static Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        String op;
        ExemploMetodoInstanciaPlus obj = new ExemploMetodoInstanciaPlus();
        
        while (true) {
            op = getOp();
            
            if (op.equals("s"))
                break;
            
            System.out.print("Primeiro n�mero: ");
            double n1 = ler.nextDouble();
        
            System.out.print("Segundo n�mero: ");
            double n2 = ler.nextDouble();
        
            switch (op) {
                case "su":
                    System.out.println("A subtra��o desses n�meros s�o: " + obj.subtracao(n1, n2));
                    break;
            
                case "so":
                    System.out.println("A soma desses n�meros s�o: " + obj.soma(n1, n2));
                    break;
            
                case "m":
                    System.out.println("A multiplica��o desses n�meros s�o: " + obj.multiplicacao(n1, n2));
                    break;
            
                case "d":
                    if (n2 == 0) {
                        System.out.println("ERRO: N�o � possivel dividir por 0!");
                        break;
                    }
                    System.out.println("A divis�o desses n�meros s�o: " + obj.divisao(n1, n2));
                    break;
                
                case "s":
                    break;
                    
                default:
                    System.out.println("ERRO: Opera��o n�o existente!");
            }
            
            System.out.println("Aperte qualquer tecla para continuar...");
        }
        
        
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
    
    public static String getOp() {
        
        String res;
        
        do {
            System.out.println("Qual opera��o voc� deseja fazer?");
            System.out.println("[So]ma");
            System.out.println("[Su]btra��o");
            System.out.println("[D]ivis�o");
            System.out.println("[M]ultiplica��o");
            System.out.println("[S]air");
            
            res = ler.nextLine();
            
        } while (!Arrays.asList("so", "su", "d", "m", "s").contains(res.toLowerCase()));
        //Mesma coisa que res != "so" || res != "su" etc, s� que mais facil de escrever
        
        return res;
    }
    
}
