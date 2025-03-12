package reajuste_salarial;

import java.util.Scanner;

public class ReajusteSalarial {
    public static void main(String[] args) {
        //O uso de double nesse programa � essencial se n�o o resultado pode ser levemete correto
        //Exemplo: Reajuste de 5% em um sal�rio de 1500, com float o programa resultar�a em 1574.9999 em vez de 1575
            
        Scanner sc = new Scanner(System.in);
            
        System.out.println("Qual seu sal�rio atual?");
        System.out.print("R$ ");
        double salario = sc.nextDouble();
        
        System.out.println("Qual a porcentagem do ajuste? Sem o %");
        byte percentual = sc.nextByte();
        
        //VARIAVEIS!!!!!!!!
        //double ajuste = salario * ( 1 + (percentual / 100));
        
        double porcentagem = percentual / 100.0; //O .0 m�gico precisa ir no fim pois Deus quis, quem sou eu pra julgar Deus
        // A raz�o real do .0 � que double precisa de .0
        
        double ajuste = salario * porcentagem;
        double reajuste = salario + ajuste;
        
        System.out.printf("O seu pr�ximo sal�rio ser� de: %.2f \n", reajuste);
        sc.close();
    }
}
