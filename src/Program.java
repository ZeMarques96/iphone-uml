import entities.Iphone;

public class Program {
    public static void main(String[] args) throws Exception {

        System.out.println();
        
        Iphone iphone = new Iphone();

        iphone.acessarAparelhoTelefonico().ligar("408 999 9999");
        iphone.acessarAparelhoTelefonico().atender();
        iphone.acessarAparelhoTelefonico().iniciarCorreioVoz();

        System.out.println();
        iphone.acessarReprodutorMusical().tocar();
        iphone.acessarReprodutorMusical().pausar();
        iphone.acessarReprodutorMusical().selecionarMusica("Yellow Submarine - The Beattles.");

        System.out.println();
        iphone.acessarNavegadorInternet().exibirPagina("www.google.com");
        iphone.acessarNavegadorInternet().adicionarNovaAba();
        iphone.acessarNavegadorInternet().atualizarPagina();

    }
}
