package C_Classes;

public class objeto {
    public static void main(String[] args) throws Exception {
        // criando um objeto como a classe, dando classe()

        //obj 1
        uzumaki naruto = new uzumaki();
        //Atributos Ninja mãe
        naruto.nome = "Naruto Uzumaki";
        naruto.idade = 22;
        naruto.aldeia = "Aldeia da Folha";

        //Atributos Uzumaki filho - aq extendeu
        naruto.Chakara();

        //atributos da classe Ninja + uchiha
        uchiha sasuke = new uchiha();
        sasuke.nome = "Sasuke Uchiha";
        //atribuidno o método ao objeto criado sasuke
        sasuke.Sharingan();
    }
}
