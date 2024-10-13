import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int numeroConta = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo = 0.0;

        System.out.println("Digite o numero da conta:");
        numeroConta = scn.nextInt();

        System.out.println("Digite a sua agencia:");
        agencia = scn.next();

        System.out.println("Digite o seu nome:");
        nomeCliente = scn.next();

        System.out.println("Digite o seu saldo:");
        saldo = scn.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
        + agencia + ", conta " + numeroConta + " e seu saldo " +saldo+ " já está disponível para saque");




    }
}
