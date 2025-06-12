import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

            Scanner sc = new Scanner (System.in);

    int numero;
    String agencia;
    String nomeCliente;
    double saldo = 237.48;

        System.out.println("Digite seu nome: ");
        nomeCliente = sc.next();
        
        System.out.println("Digite sua Agencia: ");
        agencia = sc.next();
        
        System.out.println("Digite seu Numero: ");
        numero = sc.nextInt();


        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta "+ numero+ " e seu saldo "+ saldo +" já está disponível para saque");       

    }
}
