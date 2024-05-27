package entities;

import interfaces.AparelhoTelefonico;

public class SmartPhone implements AparelhoTelefonico{

    public void ligar(String numero){
        System.out.println("Discando para: " + numero);
    }
    
    public void atender(){
        System.out.println("Atendendo ligação");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Correio de voz iniciado!");
    }
}
