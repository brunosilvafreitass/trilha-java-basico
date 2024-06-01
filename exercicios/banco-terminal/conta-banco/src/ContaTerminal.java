import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        Conta conta = new Conta();

        System.out.println("Por favor, digite o nome !");
        conta.nomeCliente = scanner.next();

        System.out.println("Por favor, digite o número da Agência !");
        conta.agencia = scanner.next();

        System.out.println("Por favor, digite o número da Conta !");
        conta.numero = scanner.nextInt();

        System.out.println("Por favor, digite o seu saldo !");
        conta.saldo = scanner.nextDouble();

        System.out.println(conta.mensagemCriarContaBanco());

    }
}
