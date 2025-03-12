package horario;

import java.util.Scanner;

public class Horario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Pode ser só byte pois nunca será mais de 24, menos memória
        System.out.println("Que horas são? (sem os minutos)");
        byte horas = sc.nextByte();
        
        System.out.println("E qual o minuto atual?");
        byte minutos = sc.nextByte();
        
        int horasMinutos = horas * 60;
        
        int minutosTotal = horasMinutos + minutos;
        
        System.out.println("O horário atual em minutos é: " + minutosTotal);
    } 
}
