package Desafio;

import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite o número da conta:");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();
		
        System.out.println("Digite o nome do titular:");
        String nomeTitular = scanner.nextLine();
        
        System.out.println("Digite o número da agência:");
        String agencia = scanner.nextLine();
        
        System.out.println("Digite o saldo:");
        double saldo = scanner.nextDouble();
        
        ContaTerminal contaBanco = new ContaTerminal(numeroConta, nomeTitular, agencia, saldo);
        
        System.out.println("\nInformações da conta:");
        contaBanco.exibirInfo();

        scanner.close();
	}

}
