package Y_PI_UFABC;
import java.io.IOException;
import java.util.Scanner;

public class main2 {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        double pi = 3.14159;
        float r = input.nextFloat();

        double Vol = (4.0/3)*pi*Math.pow(r, 3);

        System.out.printf("VOLUME = %.3f\n", Vol);

        input.close();
    }
}