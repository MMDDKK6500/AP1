package balanco_trimestral;

public class BalancoTrimestral {

    public static void main(String[] args) {
            
        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000, gastosMarco = 17000;
        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
        double mediaMensal = gastosTrimestre / 3.0;
        //Double só pra ter certeza, os outros tambem precisaram de double
        
        
        System.out.printf("Valor da média mensal: %.2f \n", mediaMensal);
    }
    
}
