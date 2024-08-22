import java.util.Scanner;

public class contaTerminal {

    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita e lê o número da conta
        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner
        
        // Solicita e lê a agência
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();
        
        // Solicita e lê o nome do cliente
        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();
        
        // Solicita e lê o saldo
        System.out.print("Por favor, digite o saldo da Conta: ");
        double saldo = scanner.nextDouble();
        
        // Fecha o scanner
        scanner.close();
        
        // Formata e exibe a mensagem com os dados fornecidos
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
                + "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
        
        System.out.println(mensagem);
    }
}
