package entities;

import interfaces.ReprodutorMusical;

public class Ipod implements ReprodutorMusical {

    public void tocar(){
        System.out.println("Tocando Música!");
    }

    public void pausar(){
        System.out.println("Música Pausada!");
    }

    public void selecionarMusica(String musica){
        System.out.println("Música " + musica + "selecionada");
    }
}
