package Aula;

import java.util.Scanner;

/**
 *
 * @author joao.dnwandermuren
 */
public class Aula {
    public static void main(String[] args) {
        
        Scanner lerDados = new Scanner(System.in);
        
        System.out.println("Qual seu nome? ");
        String nome = lerDados.nextLine();
        
        System.out.println("Qual sua altura? Em cm ");
        int altura = lerDados.nextInt();
        
        System.out.println("Olá " + nome + " , você tem " + altura + " cm de altura!");
        
    }
}
