package horario;

import java.util.Scanner;

public class Horario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Pode ser s� byte pois nunca ser� mais de 24, menos mem�ria
        System.out.println("Que horas s�o? (sem os minutos)");
        byte horas = sc.nextByte();
        
        System.out.println("E qual o minuto atual?");
        byte minutos = sc.nextByte();
        
        int horasMinutos = horas * 60;
        
        int minutosTotal = horasMinutos + minutos;
        
        System.out.println("O hor�rio atual em minutos �: " + minutosTotal);
    } 
}
