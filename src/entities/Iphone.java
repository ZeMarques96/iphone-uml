package entities;

public class Iphone {

    private Ipod reprodutorMusical;
    private SmartPhone aparelhoTelefonico;
    private Safari navegadorInternet;

    public Iphone(){
        this.reprodutorMusical = new Ipod();
        this.aparelhoTelefonico = new SmartPhone();
        this.navegadorInternet = new Safari();
    }

    public Ipod acessarReprodutorMusical(){
        return reprodutorMusical;
    }

    public SmartPhone acessarAparelhoTelefonico(){
        return aparelhoTelefonico;
    }

    public Safari acessarNavegadorInternet(){
        return navegadorInternet;
    }
}
