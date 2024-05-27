package entities;

import interfaces.NavegadorInternet;

public class Safari implements NavegadorInternet {

    public void exibirPagina(String url){
        System.out.println("Conectando-se a página: " + url );
    }

    public void adicionarNovaAba(){
        System.out.println("Nova Aba aberta");
    }

    public void atualizarPagina(){
        System.out.println("Pagina Atualizada!!");
    }

}
