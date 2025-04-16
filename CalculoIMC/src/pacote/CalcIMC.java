package pacote;

import java.util.Scanner;

public class CalcIMC {

    private static void calcularIMC(float altura, float peso)
    {
        float alturaElevada = altura * altura;
        
        float imc = peso / alturaElevada;
                
        System.out.printf("Seu IMC é: %.2f\n", imc);
        
        if (imc < 18.5f) {
            System.out.println("Você é classificado como magro.");
        } else if (imc < 24.9f) {
            System.out.println("Você é classificado como normal.");
        } else if (imc < 29.9f) {
            System.out.println("Você é classificado como sobrepeso. Obesidade de primeiro grau.");
        } else if (imc < 39.9f) {
            System.out.println("Você é classificado como obeso. Obesidade de segundo grau.");
        } else {
            System.out.println("Você é classificado como obeso grave. Obesidade de terceiro grau.");
        }
    }
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite o seu peso (Kg): ");
        float peso = ler.nextFloat();
        
        System.out.print("Digite sua altura (Metros): ");
        float altura = ler.nextFloat();
        
        calcularIMC(altura, peso);
        
    }
    
}
