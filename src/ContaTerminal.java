import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("Bem-vindo ao banco terminal! Informe os dados para criar uma conta: ");

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe o número da conta: ");
        int number = scanner.nextInt();

        System.out.println("Informe a agência: ");
        String agency = scanner.next();

        scanner.nextLine();

        System.out.println("Informe o nome do cliente: ");
        String name = scanner.nextLine();

        System.out.println("Informe o saldo: ");
        double balance = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá " + name + ", obrigado por criar uma conta em nosso banco, sua agência é " + agency
                + ", conta " + number + " e o seu saldo " + balance + " já está disponível para saque.");
    }
}
