package Z_pratica;
import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;

public class anagrama_em_grupos {

    static int[] charCount(String word) {
        int[] charCount = new int[26];

        for (char c : word.toLowerCase().toCharArray()) {
            //incrementa a posição referente à letra no array a=1, b=2, c=2, ai como forçei 26 posições, cada posição representa uma letra, se não for incrementado fica 1,0,1,0... para 'ac'
            charCount[c - 'a']++;
        }
        return charCount;
    } 

    //não usa, mas deixa que pode ser útil, não é projeto mesmo
    static boolean isAnagrams(String word, String compareWord) {
        int[] charCount_word = charCount(word);
        int[] charCount_compareWord = charCount(compareWord);

        return java.util.Arrays.equals(charCount_word, charCount_compareWord);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite palavras separadas por espaço:");
        String[] sentence = scanner.nextLine().split(" ");

        // Converte o array em lista (mais fácil de trabalhar)
        List<String> words = new ArrayList<>();
        for (String word : sentence) {
            words.add(word);
        }

        /*
         * Map onde:
         * chave   -> String que representa o "perfil de letras" (ex: [1,0,0,1,...])
         * valor   -> Lista de palavras que possuem esse perfil (anagramas)
         * palavra x:[x1,x2,x3], soq x é a versão convertida do arr em num, no caso letra->num
         */
        Map<String, List<String>> map = new HashMap<>();

        for (String word : words) {
            int[] count = charCount(word);
            //converto palavra em chave, converto em string, procuro se existe, sen adiciono na lista, ai fica lista[anagram1[], anagram2[],...], adiciono palavra na lista correta, procurando pela chave da char e entrando como .add na lista daquela chave

            // Converte o array em String para poder usar como chave do Map
            String key = Arrays.toString(count);
            // Se a chave ainda não existir, cria uma lista vazia, sem duplicar pq lembra as chaves são iguais se for um anagrama
            map.putIfAbsent(key, new ArrayList<>());
            // Adiciona a palavra no grupo correto
            map.get(key).add(word);
        }

        // Converte os valores do Map em uma lista de listas
        List<List<String>> anagrams = new ArrayList<>(map.values());

        System.out.println("Grupos de anagramas:");

        // Cada group é uma List<String>, então imprime cada uma das listas[[],[],[]], percorre cada grupo dentr das listas
        for (List<String> group : anagrams) {
            if (!group.isEmpty()) {
                System.out.println(group);
            }
        }

        scanner.close();
    }
}
