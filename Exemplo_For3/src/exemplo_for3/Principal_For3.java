package exemplo_for3;

public class Principal_For3 {

    public static void main(String[] args) {
        
        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                System.out.printf("%d x %d = %d\n", x, y, x * y);
            }
            System.out.print("-------------\n");
        }
        
    }
    
}
