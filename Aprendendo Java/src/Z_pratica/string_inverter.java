package Z_pratica;
import java.util.Scanner;

public class string_inverter {
    static void stringInverter(String word) {
        String tempString = "";
        for (int i = word.length() -1; i >= 0 ; i--) {
            tempString = tempString.concat(word.charAt(i)+"");
        }
        System.out.println(tempString);
    }
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String word = scanner.nextLine();

        stringInverter(word);
        scanner.close();
    }
}
