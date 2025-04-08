package imc;

import java.util.Scanner;

public class Principal {

    private static float calcularIMC(float altura, float peso)
    {
        float alturaElevada = altura * altura;
        
        float IMC = peso / alturaElevada;
        
        return IMC;
    }
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite o seu peso: ");
        float peso = ler.nextFloat();
        
        System.out.print("Digite sua altura: ");
        float altura = ler.nextFloat();
        
        float imc = calcularIMC(altura, peso);
        
        System.out.printf("Seu IMC �: %.2f\n", imc);
        
        if (imc < 18.5f) {
            System.out.println("Voc� � classificado com magreza.");
        } else if (imc < 24.9f) {
            System.out.println("Voc� � classificado como normal.");
        } else if (imc < 29.9) {
            System.out.println("Voc� � classificado como sobrepesso. Obesidade de primeiro grau.");
        } else if (imc < 39.9) {
            System.out.println("Voc� � classificado com obesidade. Obesidade de segundo grau.");
        } else {
            System.out.println("Voc� � classificado com obesidade grave. Obesidade de terceiro grau.");
        }
        
    }
    
}
