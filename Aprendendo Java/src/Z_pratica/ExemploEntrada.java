package Z_pratica;

import java.util.Scanner;

import javax.print.attribute.HashPrintJobAttributeSet;

import java.util.HashMap;
import java.util.Map;

public class ExemploEntrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        // tratando a entrada
        String sentence = scanner.nextLine();
        sentence = sentence.toLowerCase().replace("[^a-z\\s]", "");

        // salvando palavras em um array tipo lista
        String[] words = sentence.split(" ");
        // Map<TipoDaChave, TipoDoValor>
        Map<String, Integer> contagemPalavras = new HashMap<>();

        //contagem de palavras na frase
        for (String word : words) {
            if (contagemPalavras.containsKey(word)) {
                //acha word no dicionario, put na chave word, valor atual +1
                contagemPalavras.put(word, contagemPalavras.get(word) + 1);
            } else {
                contagemPalavras.put(word, 1);
            }
        }
        //Imprime valor maximo
        System.out.println("Palavra que mais se repete é " + MaxValueInMap(contagemPalavras));
        

        scanner.close();
    }

    public static String MaxValueInMap(Map<String, Integer> contagem) {
        if (contagem == null || contagem.isEmpty()) {
            return null; 
        }

        String commoString = "";
        int maxFrequency = 0;
        //for (TipoDoElemento nomeDaVariável : Coleção)}{...}
        //contagemPalavras.entrySet() é o método que diz ao Java: "Me dê uma 'lista' de todos os pares completos (Item + Quantidade) deste mapa
        for ( Map.Entry<String, Integer> HashParam : contagem.entrySet()) {   //estrutura tenária:
            //variável = condição ? valor se verdadeiro : (valor se falso)
            if (maxFrequency < HashParam.getValue()) {
                maxFrequency = HashParam.getValue();
                commoString = HashParam.getKey();
            }

        }
        return commoString;
    }

    public static void palindrome(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        String reversa = "";

        for (int i = palavra.length() - 1; i >= 0; i--) {
            reversa += palavra.charAt(i);
        }

        int count = 0;
        for(int c = palavra.length() -1; c >= 0; c--){
            if (reversa.charAt(c) == palavra.charAt(c)){
                count ++;
            }
        }
        scanner.close();
        if (count == palavra.length()){
            System.out.println("A palavra é um palíndromo."); 
        } else {
            System.out.println("A palavra não é um palíndromo."); 
        }
    }

    public static void oddpair(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um Numero: ");
        int number = scanner.nextInt();
        String result = "";

        // A versão com operador ternário
        result = (number % 2 == 0) ? "PAR" : "IMPAR";

        // if (number % 2 == 0) {
        //     result += "par";
        // }
        // else{
        //     result += "impar";
        // }

        if (number >= 0) {
            result += " positivo";
        } else {
            result += " negativo";
        }
        
        System.out.println(result);
        scanner.close();
    }

    public static void medias(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float grandes_number = 3;
        int sum = 0;
        for (int i = 0; i < grandes_number; i++) {
            System.out.println("Digite a nota número " + i + " :");
            sum += scanner.nextInt();
        }

        float average = sum / grandes_number;
        System.out.println("A média das notas é: " + average);

        scanner.close();
    }

    public static void nomes_idades(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Olá, " + nome + "! Você tem " + idade + " anos.");
        System.out.println("Gostou bebe?");

        scanner.close();
    }
}