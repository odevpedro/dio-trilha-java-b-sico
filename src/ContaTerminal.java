import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import java.util.Scanner;

@Getter
@ToString
@Builder
public class ContaTerminal {

    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;


    public void exibirMensagem() {
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial:");
        double saldo = scanner.nextDouble();


        ContaTerminal conta = ContaTerminal.builder()
                .numero(numero)
                .agencia(agencia)
                .nomeCliente(nomeCliente)
                .saldo(saldo)
                .build();

        conta.exibirMensagem();

        scanner.close();
    }
}