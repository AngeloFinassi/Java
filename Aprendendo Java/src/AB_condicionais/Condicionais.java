package AB_condicionais;

public class Condicionais {
    public static void main(String[] args) throws Exception {
        
        int idade = 20;
        String nome = "Fernanda";
        boolean estudante = true;
            // - Lógicos: combinam condições (&& = E, || = OU, ! = NÃO)
            // - Atribuição: atribuem valores (=, +=, -=, *=, /=)
            // - Ternário: forma curta de if/else → (condição ? valorSeVerdadeiro : valorSeFalso)

        // Operadores relacionais
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        // Comparando Strings corretamente com equals()
        if (nome.equals("Fernanda")) {
            System.out.println("Olá, Fernanda!");
        } else {
            System.out.println("Nome diferente");
        }

        // Operadores lógicos
        if (idade > 18 && estudante) {
            System.out.println("Adulto estudante");
        } else if (idade > 18 || estudante) {
            System.out.println("Cumpre pelo menos uma condição");
        } else {
            System.out.println("Nenhuma condição verdadeira");
        }

        // Operador ternário
        String resultado = (idade >= 18) ? "Pode dirigir" : "Não pode dirigir";
        System.out.println(resultado);
    }
}
