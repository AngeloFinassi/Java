package A_dados_primitivos;

public class Bmain {
    public static void main(String[] args) throws Exception {
        //Tipos não primitivos
        String nome = "Naruto Uzumaki";
        System.out.println(nome);
        System.out.println(nome.toLowerCase());
        System.out.println(nome.charAt(3));
        //sout

        int idade = 18;
        double altura = 1.78;
        String situação = "Desempregado"; 
        mostrarCPF(nome, idade, altura, situação);
    }

    public static void mostrarCPF(String nome, int id, double alt, String sit) {
        System.out.println("Meu nome é " + nome + ", Tenho " + alt + "m de altura ," + "Situação social: " + sit);
        System.out.printf("Meu nome é %s, tenho %.2fm de altura, Sitaução atual %s", nome, alt, sit);
    }
}
