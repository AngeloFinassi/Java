import java.util.Scanner;

public class Main {
    public static int bigger(int a, int b) {
        return (a + b + Math.abs(a - b)) / 2;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int temp_bigger = bigger(a, b);
        int real_bigger = bigger(temp_bigger, c);

        System.out.println(real_bigger + " eh o maior");
        input.close();
    }
}
