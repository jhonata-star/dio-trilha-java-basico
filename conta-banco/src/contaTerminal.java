import java.util.Scanner;

public class contaTerminal {
    
    public static void main(String [] args)  {

      Scanner sc = new Scanner(System.in);

      System.out.println("Por favor, digite o número de sua conta! ");
      int numero = sc.nextInt();
      System.out.println("Por favor, digite o número de sua agencia! ");
      String agencia = sc.next();
      
        String nomeCliente = "Mario Andrade";
        double saldo = 237.48;

        System.out.println("olá "  + nomeCliente +  " obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + ", conta " + numero + " e seus saldo " + saldo + " ja esta disponivel para saque.");

        sc.close();
    }
    
}
