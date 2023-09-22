import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Insira o nome do titular da conta: ");
        String nomeCliente = scanner.next();

        System.out.println("Escolha os quatro dígitos para o número de sua conta: ");
        int numero = scanner.nextInt();

        System.out.println("Escolha seu número de agência, sendo três números, hífen e um quarto número: ");
        String agencia = scanner.next();

        System.out.println("Insira a quantia do seu primeiro depósito: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque.");
    }
}
