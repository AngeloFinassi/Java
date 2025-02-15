package Y_PI_UFABC;
import java.io.IOException;
import java.util.Scanner;

public class main1 {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        float A = input.nextFloat();
        float B = input.nextFloat();
        float C = input.nextFloat();

        float average = (A * 2 + B * 3 + C * 5) / 10;

        System.out.printf("MEDIA = %.1f\n", average);

        input.close();
    }
}