package Z_pratica;

class Animal {
    String nome;

    public void BebeLeite(){
        System.out.println("Bebe Leite");
    }
}

class Gato extends Animal{
    public void Pula(){
        System.out.println("Pula alto");
    }
}

class Cachorro extends Animal{
    public void Late(){
        System.out.println("Late alto");
    }
}

public class A_classes {
    public static void main(String[] args) throws Exception {
        Gato gato = new Gato();
        gato.nome = "Tobias";
        gato.BebeLeite();
        //gato.Late(); gato pertence a classe gato que ta inclusa em animals, LOGO consegue receber bebeleite() e pula()
        gato.Pula();
        

        Cachorro dog = new Cachorro();
        dog.nome = "Chica Francica da Silva";
        dog.BebeLeite();
        dog.Late();
        //mesmo esquema de cima - dog.Pula()
    }
    
}
