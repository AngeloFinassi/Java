package D_Polimorfismo;

//herdando os atributos da classe ninja, FILHO UNICO
public class uchiha extends ninja{
    //todo uchiha é ninja, mas nem todo ninja é uchiha
    public void Sharingan(){
        System.out.println("Sharingan Ativado");
    }

    @Override
    //msm coisa do ninja, mais para uchiha ele taca fogo
    public void AtaqueBasico(){
        System.out.println("Eu sou um ninja e taquei uma Kunai DE FOGO");
    }

    public void AtaqueBasico(int LvlChakara){
        if (LvlChakara > 1) {
            System.out.println("Suzano Invocado");
        } else if (LvlChakara < 1) {
            System.out.println("Só ativei o Sharingan");
        }
    }
}
