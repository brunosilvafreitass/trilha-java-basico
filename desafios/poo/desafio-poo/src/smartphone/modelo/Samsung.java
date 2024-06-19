package smartphone.modelo;

import smartphone.aparelhotelefonico.AparelhoTelefonico;
import smartphone.navegador.NavegadorInternet;
import smartphone.reprodutormusical.ReprodutorMusical;

public class Samsung implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void tocar() {
        System.out.println("TOCANDO MÚSICA NO SAMSUNG");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO MÚSICA NO SAMSUNG");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("SELECIONANDO MÚSICA NO SAMSUNG");
    }

    @Override
    public void exibirPagina() {
        System.out.println("EXIBINDO PAGINA NO SAMSUNG");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA NO SAMSUNG");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA NO SAMSUNG");
    }

    @Override
    public void ligar() {
        System.out.println("LIGANDO");
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO SAMSUNG");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("CORREIO DE VOZ SAMSUNG");
    }

}
