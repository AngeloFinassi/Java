package Z_pratica;
import java.util.Scanner;
import java.util.HashMap;

public class vogais_count {
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();

        HashMap<Character, Integer> vogaisCount = new HashMap<>();
        vogaisCount.put('a', 0);
        vogaisCount.put('e', 0);
        vogaisCount.put('i', 0);
        vogaisCount.put('o', 0);
        vogaisCount.put('u', 0);

        for (int i = 0; i<frase.length(); i++){
            char c = Character.toLowerCase(frase.charAt(i));
            if (vogaisCount.containsKey(c)){
                vogaisCount.put(c, vogaisCount.get(c) + 1);
            }
        }
        System.out.println("Contagem de vogais:");
        for (char vogal : vogaisCount.keySet()){
            System.out.println(vogal + ": " + vogaisCount.get(vogal));
        }

        scanner.close();
    }
}
