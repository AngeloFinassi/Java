// Arquivo: Funcionario.java
package Resumao;

//publico acessivel de qualquer lugar
public class Funcionario extends Pessoa {
    private double salario;

    // 🧱 Construtor da subclasse → usa "super" para chamar o construtor da classe base
    public Funcionario(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }

    // Método específico da subclasse
    public void trabalhar() {
        System.out.println(getNome() + " está trabalhando...");
    }

    // 🌀 Polimorfismo → sobrescrita do método apresentar()
    //sobrescrve a função original com essa
    @Override
    public void apresentar() {
        System.out.println("Sou funcionário. Meu nome é " + getNome() + " e ganho R$" + salario);
    }
}
