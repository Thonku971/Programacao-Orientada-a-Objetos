package aula09;

public class Conta {

	private Integer numeroConta;
	private Double saldo;
	private String nomeTitular;

	public Conta(Integer numeroConta, String nomeTitular) {		

		this.numeroConta = numeroConta;
		this.saldo = 0.00;
		this.nomeTitular = nomeTitular;
	}

	public void verificarSaldo() {		

		System.out.println("Conta: " + this.numeroConta + ".\n"
				         + "Saldo: R$" + this.saldo + "\n");
	}

	public void realizarSaque(Double valor) {		

		if(valor <= this.saldo) {			

			this.saldo -= valor;
			System.out.println("Conta: " + this.numeroConta + "\n"
					         + "Saque de R$" + valor + " realizado com sucesso.\n");		

		} else {			

			System.out.println("Conta: " + this.numeroConta + "\n"
					         + "Saldo insuficiente.\n");
		}
	}

	public void realizarDeposito(Double valor) {		

		this.saldo += valor;
		System.out.println("Conta: " + this.numeroConta +"\n"
				         + "Depósito de R$" + valor + " realizado com sucesso.\n");
	}

	public Integer getNumeroConta() {
		return numeroConta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}
}
