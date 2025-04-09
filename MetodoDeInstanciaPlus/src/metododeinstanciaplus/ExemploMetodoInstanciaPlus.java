package metododeinstanciaplus;

import java.util.Arrays;
import java.util.Scanner;

public class ExemploMetodoInstanciaPlus {

    static Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args) {
            
        ExemploMetodoInstanciaPlus obj = new ExemploMetodoInstanciaPlus();
        
        String op = getOp();
        
        System.out.print("Primeiro número: ");
        double n1 = ler.nextDouble();
        
        System.out.print("Segundo número: ");
        double n2 = ler.nextDouble();
        
        switch (op) {
            case "su":
                System.out.println("A subtração desses números são: " + obj.subtracao(n1, n2));
                break;
            
            case "so":
                System.out.println("A soma desses números são: " + obj.soma(n1, n2));
                break;
            
            case "m":
                System.out.println("A multiplicação desses números são: " + obj.multiplicacao(n1, n2));
                break;
            
            case "d":
                if (n2 == 0) {
                    System.out.println("ERRO: Não é possivel dividir por 0!");
                    break;
                }
                System.out.println("A divisão desses números são: " + obj.divisao(n1, n2));
                break;
                
            default:
                System.out.println("ERRO: Operação não existente!");
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
            System.out.println("Qual operação você deseja fazer?");
            System.out.println("[So]ma");
            System.out.println("[Su]btração");
            System.out.println("[D]ivisão");
            System.out.println("[M]ultiplicação");
            
            res = ler.nextLine();
            
        } while (!Arrays.asList("so", "su", "d", "m").contains(res.toLowerCase()));
        //Mesma coisa que res != "so" || res != "su" etc, só que mais facil de escrever
        
        return res;
    }
    
}
