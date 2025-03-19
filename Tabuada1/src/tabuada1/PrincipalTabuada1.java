package tabuada1;

public class PrincipalTabuada1 {

    public static void main(String[] args) {
        
        int t = 2, x = 1;
        
        while (x <= 10) {
            System.out.printf("%d X %d = %d \n", t, x, t * x);
            
            x++;
            if (x == 10 && t != 10) {
                x = 1;
                t++;
            }
        }
        
    }
    
}
