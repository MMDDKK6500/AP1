package media_alunos;

import java.util.Scanner;

public class PrincipalMedia {

    static byte mediaMinima = 6;
    
    public static void main(String[] args) {
        
        //double nn fez muita diferença nessa
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Qual a primeira nota? ");
        float nota1 = sc.nextFloat();
        
        System.out.println("Qual a segunda nota? ");
        float nota2 = sc.nextFloat();
        
        System.out.println("Qual a terceira nota? ");
        float nota3 = sc.nextFloat();
        
        float media = (nota1 + nota2 + nota3) / 3f;        
        
        String aprovacao = "Aluno Reprovado!";
        
        if (media >= mediaMinima)
            aprovacao = "Aluno Aprovado!";
        
        System.out.printf("%s Sua média foi %.2f \n", aprovacao, media);
        
        sc.close();
    }
    
}
