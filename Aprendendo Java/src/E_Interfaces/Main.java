package E_Interfaces;

//define o contrato
interface Carro {
    void acelerar();
    void frear();
    void exibirInfo();
}

// Implementação 1: Carro esportivo
class Esportivo implements Carro {
    private String modelo;

    public Esportivo(String modelo) {
        this.modelo = modelo;
    }

    public void acelerar() {
        System.out.println(modelo + " acelerando a 200 km/h! 🏎️");
    }

    public void frear() {
        System.out.println(modelo + " freando rapidamente!");
    }

    public void exibirInfo() {
        System.out.println("Modelo: " + modelo + " | Tipo: Esportivo");
    }
}

// Implementação 2: Carro popular
class Popular implements Carro {
    private String modelo;

    public Popular(String modelo) {
        this.modelo = modelo;
    }

    public void acelerar() {
        System.out.println(modelo + " acelerando a 100 km/h. 🚗");
    }

    public void frear() {
        System.out.println(modelo + " freando suavemente.");
    }

    public void exibirInfo() {
        System.out.println("Modelo: " + modelo + " | Tipo: Popular");
    }
}

// Programa principal
public class Main {
    public static void main(String[] args) {
        Carro esportivo = new Esportivo("Ferrari F8");
        Carro popular = new Popular("Gol 1.0");

        esportivo.exibirInfo();
        esportivo.acelerar();
        esportivo.frear();

        System.out.println();

        popular.exibirInfo();
        popular.acelerar();
        popular.frear();
    }
}
