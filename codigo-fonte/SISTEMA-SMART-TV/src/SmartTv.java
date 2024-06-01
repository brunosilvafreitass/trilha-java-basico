/**
 * Este método é utilizado para somar dois números inteiros
 * 
 * @param numeroUm   este é o primeiro parâmetro do método
 * @param numeroDois este é o segundo parâmetro do método
 * @return int o resultado deste método é a soma dos dois números.
 */
public class SmartTv {
    /**
     * Este método é utilizado para somar dois números inteiros
     * 
     * @param numeroUm   este é o primeiro parâmetro do método
     * @param numeroDois este é o segundo parâmetro do método
     * @return int o resultado deste método é a soma dos dois números.
     */

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }
}
