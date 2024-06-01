public class Conta {
    int numero;
    String agencia;
    String nomeCliente;
    double saldo;

    public String mensagemCriarContaBanco() {
        return String.format(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque",
                nomeCliente, agencia, numero, saldo);
    }
}
