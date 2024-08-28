import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan= new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da Conta ! ");
        int numero = scan.nextInt();
        
        scan.nextLine();
        
        System.out.println("Por favor, digite o número da Agência ! ");
        String agencia = scan.nextLine();
        
        System.out.println("Por favor, digite o número do Cliente ! ");
        String  nomeCliente= scan.nextLine();
        
        System.out.println("Por favor, digite o saldo da Conta ! ");
        double saldo = scan.nextDouble();

        System.out.println("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numero +" e seu saldo "+ saldo +" já está disponível para saque");
    
    }
}
