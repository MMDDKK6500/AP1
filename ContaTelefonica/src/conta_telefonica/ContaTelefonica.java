package conta_telefonica;

import java.util.Scanner;

public class ContaTelefonica {
    
    static double assinatura = 17.90;
    
    public static void main(String[] args) {
        //O uso de double nesse programa tambem é essencial para seu funcionamento correto.
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantos minutos de TELEFONE foram utilizados?");
        int minutosTelefone = sc.nextInt();
        System.out.println("E quantos minutos de CELULAR foram utilizados?");
        int minutosCelular = sc.nextInt();
        
        double valorTelefone = minutosTelefone * 0.04;
        double valorCelular = minutosCelular * 0.20;
        
        double interurbano = 34.29;

        double valorTotal = assinatura + interurbano + valorTelefone + valorCelular;
        
        System.out.println("Valores em itens:");
        System.out.println("Assinatura: " + assinatura);
        System.out.println("Telefone: " + valorTelefone);
        System.out.println("Celular: " + valorCelular);
        System.out.println("Interurbano: " + interurbano);
        System.out.println("Total a pagar: " + valorTotal);
        sc.close();
    }
}
