package exemplo_for2;

import java.util.Scanner;

public class Principal_For2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("De qual número você quer saber a tabuada? ");
        int t = sc.nextInt();
        
        for(int i = 0; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", t, i, t * i );
        }
        
        sc.close();
        
    }
    
}