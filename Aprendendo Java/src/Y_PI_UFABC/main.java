package Y_PI_UFABC;
import java.io.IOException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        int d = input.nextInt();
        double cost = (t*d)/12.0;

        System.out.printf("%.3f\n", cost);
        input.close();
    }
}