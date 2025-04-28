import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Crie uma classe ContaTerminal, que tenha os atributos: agencia, numero da conta, nome do cliente
        Scanner sc = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        // Crie um método main que faça a leitura dos dados do cliente e imprima os dados da conta.

        System.out.println("Digite o número da conta:");
        System.out.println();
        System.out.println("Por favor, digite o número da conta: (apenas números)");
        numero = sc.nextInt();

        System.out.println("Digite a agência: ");
        agencia = sc.next();

        System.out.println("Me informa seu nome:");
        nomeCliente = sc.next();
        sc.nextLine(); // Limpa o buffer do scanner

        System.out.println("Me informa seu saldo atual: ");
        saldo = sc.nextDouble();
        sc.nextLine(); // Limpa o buffer do scanner

        System .out.println();
        System.out.printf("Olá %s, obrigado por criar uma conta"
               +"em nosso banco, sua agência é %s,"
               +"conta %d e seu saldo %.2f já está disponínel"
               +"pra saque.", nomeCliente, agencia, numero, saldo);


        sc.close();
         
    }
}
