package B3_Casting;

public class Casting {
    public static void main(String[] args) throws Exception {

        /*
            CASTING em Java:
            É o processo de converter um tipo de dado em outro.

            Existem dois tipos:
            - Casting implícito (automático)
            - Casting explícito (feito manualmente)
        */

        // 🔹 Casting implícito (widening)
        // Ocorre automaticamente quando o Java converte um tipo menor para um tipo maior
        int numInt = 10;
        double numDouble = numInt; // int → double
        System.out.println("Casting implícito: int → double = " + numDouble);

        // 🔹 Casting explícito (narrowing)
        // Feito manualmente, pois pode haver perda de informação
        double valorDouble = 9.78;
        int valorInt = (int) valorDouble; // double → int (corta a parte decimal)
        System.out.println("Casting explícito: double → int = " + valorInt);

        /*
            Casting entre tipos de caracteres e números:
            - Um char pode ser convertido para int (mostra o código Unicode)
            - Um int pode ser convertido para char (mostra o caractere correspondente)
        */
        char letra = 'A';
        int codigo = (int) letra; // converte para número
        System.out.println("Char → int: " + codigo);

        int numero = 66;
        char caractere = (char) numero; // converte número em caractere
        System.out.println("Int → char: " + caractere);

        /*
            Conversões entre tipos primitivos e objetos:
            - Usamos classes *Wrapper* (Integer, Double, Float, etc.)
            - Métodos úteis: valueOf(), parseInt(), toString()
        */
        String textoNumero = "123";
        int numeroConvertido = Integer.parseInt(textoNumero); // String → int
        System.out.println("String → int: " + numeroConvertido);

        int outroNumero = 456;
        String texto = String.valueOf(outroNumero); // int → String
        System.out.println("int → String: " + texto);

        /*
            Resumo:
            - Implícito: automático (sem risco de perda)
            - Explícito: manual (pode perder dados)
            - Wrapper: converte entre primitivos e objetos
        */
    }
}