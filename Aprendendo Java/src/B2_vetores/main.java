package B2_vetores;

//importat para usar oq seria as listas em python
import java.util.ArrayList;

public class main {
    public static void main(String[] args) throws Exception {

        /*
            Vetores (arrays) em Java:
            - Armazenam vários valores do mesmo tipo.
            - Têm tamanho fixo, definido na criação.
        */
        int[] numeros = {10, 20, 30, 40};

        // Acessando elementos por índice (começa em 0)
        System.out.println("Primeiro número: " + numeros[0]);
        System.out.println("Último número: " + numeros[3]);

        // Alterando um valor no vetor
        numeros[2] = 99;
        System.out.println("Valor alterado: " + numeros[2]);

        // Exibindo todos os elementos com um for
        System.out.println("Todos os números do vetor:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posição " + i + ": " + numeros[i]);
        }

        /*
            ArrayList:
            - Lista dinâmica da biblioteca java.util.
            - Pode crescer e diminuir de tamanho.
            - Usa métodos para manipulação dos dados.
        */

        //uma classe q nem string
        ArrayList<String> nomes = new ArrayList<>();

        // Adicionando elementos
        nomes.add("Fernanda");
        nomes.add("João");
        nomes.add("Lucas");

        System.out.println("\nLista inicial: " + nomes);

        // Acessando um elemento específico
        System.out.println("Primeiro nome: " + nomes.get(0));

        // Alterando um elemento
        nomes.set(1, "Joana");
        System.out.println("Lista após alteração: " + nomes);

        // Removendo um elemento
        nomes.remove("Lucas");
        System.out.println("Lista após remoção: " + nomes);

        // Exibindo com for-each
        System.out.println("\nPercorrendo com for-each:");
        for (String nome : nomes) {
            System.out.println("Nome: " + nome);
        }

        /*
            Resumo:
            - Array → tamanho fixo, mais leve.
            - ArrayList → tamanho dinâmico, mais prático.
        */
    }
}
