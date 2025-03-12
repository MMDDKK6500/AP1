package media_aluno;

import java.util.Scanner;

public class PrincipalMedia {

    static byte mediaMinima = 6;
    
    public static void main(String[] args) {
        
        //double nn fez muita diferen�a nessa
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Qual a primeira nota? ");
        float nota1 = sc.nextFloat();
        
        System.out.println("Qual a segunda nota? ");
        float nota2 = sc.nextFloat();
        
        System.out.println("Qual a terceira nota? ");
        float nota3 = sc.nextFloat();
        
        float media = (nota1 + nota2 + nota3) / 3f;        
        
        String avaliacao = "Excelente!";
        String aprovacao = "Aluno Reprovado!";
        
        if (media < 2) {
            avaliacao = "P�ssimo!";
        } else if (media < 4) {
            avaliacao = "Ruim!";
        } else if (media < 6) {
            avaliacao = "Regular!";
        } else if (media < 8) {
            avaliacao = "Bom!";
        } else if (media < 9.5f) {
            avaliacao = "�timo!";
        }/* else {
            text = "Excelente!";
        }*/
        // N�o precisa do else, pois os valores iniciais s�o os corretos para a condi��o
        
        if (media >= mediaMinima) {
            aprovacao = "Aluno Aprovado!";
        }
        
        System.out.printf("%s %s Sua m�dia foi %.2f \n", avaliacao, aprovacao, media);
        
        sc.close();
    }
    
}
