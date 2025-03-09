import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        boolean possible = false;
        
        if (A - B == 0 || A - C == 0 || B - C == 0 || 
            B - A == 0 || C - A == 0 || C - B == 0) {
            possible = true;
        }
        if (A + B - C == 0 || A + C - B == 0 || B + C - A == 0 ||
            A - B - C == 0 || B - A - C == 0 || C - A - B == 0) {
            possible = true;
        }
        
        if (possible) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }
        
        input.close();
    }
}