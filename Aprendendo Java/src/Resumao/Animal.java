package Resumao;

//publico acessivel de qualquer lugar
public abstract class Animal {
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    // Método abstrato → deve ser implementado pelas subclasses
    public abstract void fazerSom();
}
