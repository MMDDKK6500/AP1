package br.dev.mmddkk.dev.pacote;

public class VetorMultidim {

    public static void main(String[] args) {
        int mat[][] = {{1, 2, 3, 4}, {5, 6}};
        
        
        int i, j;
        for(i = 0; i < mat.length; i++) {
            
            System.out.printf("%dº linha: ", (i+1));
            
            for(j = 0;j < mat[i].length; j++) {
                System.out.printf("%d ", mat[i][j]);
            }
            
            System.out.println("\n");
            
        }
        
    }
    
}
