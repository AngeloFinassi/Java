package Resumao;


interface Trabalhavel {
    void executarTarefa(); // método da interface
}

// Classe base
class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void apresentar() {
        System.out.println("Olá! Meu nome é " + nome + " e tenho " + idade + " anos.");
    }
}

// Subclasse com herança
class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome, int idade, double salario) {
        super(nome, idade);
        this.salario = salario;
    }

    public void trabalhar() {
        System.out.println(getNome() + " está trabalhando...");
    }

    @Override
    public void apresentar() {
        System.out.println("Sou funcionário. Meu nome é " + getNome() + " e ganho R$" + salario);
    }
}

// Classe que implementa interface e herda outra classe
// isso significa, Se uma classe quiser me usar, ela precisa implementar (criar) todos os métodos que eu definir
class Gerente extends Funcionario implements Trabalhavel {

    public Gerente(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    @Override
    public void executarTarefa() {
        System.out.println(getNome() + " está gerenciando a equipe.");
    }

    @Override
    public void apresentar() {
        System.out.println("Sou gerente " + getNome() + " e coordeno vários funcionários.");
    }
}

// Classe abstrata + subclasse (opcional, mas incluída)
abstract class Animal {
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public abstract void fazerSom();
}

class Casa {
    String cor;
    int numero;

    // 🧱 Construtor — monta o objeto e define os valores iniciais
    Casa(String cor, int numero) {
        this.cor = cor;
        this.numero = numero;
    }

    void abrirPorta() {
        System.out.println("A porta da casa número " + numero + " foi aberta.");
    }
}
