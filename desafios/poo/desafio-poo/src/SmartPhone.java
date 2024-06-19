import smartphone.modelo.Iphone;
import smartphone.modelo.Samsung;

public class SmartPhone {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        Samsung samsung = new Samsung();

        iphone.atender();
        iphone.atualizarPagina();
        iphone.selecionarMusica();
        System.out.println();
        samsung.atender();
        samsung.atualizarPagina();
        samsung.selecionarMusica();

    }
}
