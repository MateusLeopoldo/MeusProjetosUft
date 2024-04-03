package Desafio;

public class ContaTerminal {
	int numeroConta;
	String nomeTitular;
	String agencia;
	double saldo;

	public ContaTerminal(int numeroConta, String nomeTitular, String agencia, double saldo) {
		this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.agencia = agencia;
        this.saldo = saldo;
	}
public void exibirInfo() {
	System.out.println("Número da conta: " + numeroConta);
    System.out.println("Nome do titular: " + nomeTitular);
    System.out.println("Agência: " + agencia);
    System.out.println("Saldo atual: " + saldo);
}
}
