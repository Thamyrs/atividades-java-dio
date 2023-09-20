import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência (ex.: 067-8)");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da conta! (ex.: 1021)");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o seu saldo!");
        double saldo = scanner.nextDouble();

        System.out.println("Por favor, digite o seu nome!");
        String nomeCliente = scanner.nextLine();

        System.out.print("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta "+ numeroConta + " e seu saldo de R$ "+ saldo +" já está disponível para saque");
        
    }
}
