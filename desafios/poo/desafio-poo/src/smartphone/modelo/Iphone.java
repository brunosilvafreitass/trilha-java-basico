package smartphone.modelo;

import smartphone.aparelhotelefonico.AparelhoTelefonico;
import smartphone.navegador.NavegadorInternet;
import smartphone.reprodutormusical.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void tocar() {
        System.out.println("TOCANDO MÚSICA NO IPHONE");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO MÚSICA NO IPHONE");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("SELECIONANDO MÚSICA NO IPHONE");
    }

    @Override
    public void exibirPagina() {
        System.out.println("EXIBINDO PAGINA NO IPHONE");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA NO IPHONE");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA NO IPHONE");
    }

    @Override
    public void ligar() {
        System.out.println("LIGANDO");
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO IPHONE");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("CORREIO DE VOZ IPHONE");
    }

}
