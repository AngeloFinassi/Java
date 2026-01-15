package Z_pratica;
import java.util.Scanner;
import java.util.HashMap;

public class word_count_in_a_sentence {
    static void main(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();
        // limpa cracateres especiais com expressão regex
        frase = frase.toLowerCase().replaceAll("[^a-zA-Z0-9 ]", "");;

        String[] palavras = frase.split(" ");
        HashMap<String, Integer> palavrasCount = new HashMap<>();

        // verifica se a plaavra existe sen, add ela com valor 1, se sim, add +1 no valor
        for (String palavra : palavras) {
            int existe = palavrasCount.getOrDefault(palavra, 0);

            if(existe > 0){
                palavrasCount.put(palavra, existe + 1);
            } else {
                palavrasCount.put(palavra, 1);
            }
        }

        // imprime para melhor visualização
        System.out.println("Contagem de palavras:");

        int max = 0;
        String mostFrequentWord = "";
        for (String palavra : palavrasCount.keySet()) {
            System.out.println(palavra + ": " + palavrasCount.get(palavra));
            if(palavrasCount.get(palavra) > max){
                max = palavrasCount.get(palavra);
                mostFrequentWord = palavra;
            }
        }

        System.out.println("A palavra que mais se repete é: " + mostFrequentWord + " com " + max + " repetições.");
        scanner.close();
    }
}
