// Arquivo: Pessoa.java
package Resumao;
//defino erstrutura, dps uso construtor para criar o objeto e prencher essa estrutra

//publico acessivel de qualquer lugar
public class Pessoa {
    // 🔒 Modificadores de acesso
    private String nome;   // privado → só acessível dentro da classe
    private int idade;

    // 🧱 Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // 🔧 Métodos públicos (getters e setters)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Método comum
    public void apresentar() {
        System.out.println("Olá! Meu nome é " + nome + " e tenho " + idade + " anos.");
    }
}
