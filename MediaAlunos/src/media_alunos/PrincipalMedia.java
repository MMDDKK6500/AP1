package media_alunos;

import java.util.Scanner;

public class PrincipalMedia {

    static byte mediaMinima = 6;
    
    public static void main(String[] args) {
        
        //double nn fez muita diferença nessa
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Qual a primeira nota? ");
        float nota1 = sc.nextFloat();
        
        System.out.print("Qual a segunda nota? ");
        float nota2 = sc.nextFloat();
        
        System.out.print("Qual a terceira nota? ");
        float nota3 = sc.nextFloat();
        
        float media = (nota1 + nota2 + nota3) / 3f;        
        
        String text = "Regular!";
        String text2 = "Aluno Reprovado!";
        
        if (media < 2) {
            text = "Péssimo!";
        } else if (media < 4) {
            text = "Ruim!";
        } else if (media < 6) {
            text = "Regular!";
        } else if (media < 8) {
            text = "Bom!";
        } else if (media < 9.5f) {
            text = "Ótimo!";
        } else if (media >= 9.5f) {
            text = "Excelente!";
        }
        
        if (media >= mediaMinima) {
            text2 = "Aluno Aprovado!";
        }
        
        System.out.printf("%s %s Sua média foi %.2f \n", text, text2, media);
        
        sc.close();
    }
    
}
