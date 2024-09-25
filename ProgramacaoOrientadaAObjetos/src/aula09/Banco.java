package aula09;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private Integer cnpj;
	private String nomeBanco;
	private List<Conta> contas;

	public Banco(Integer cnpj, String nomeBanco) {

		this.cnpj = cnpj;
		this.nomeBanco = nomeBanco;
		this.contas = new ArrayList<Conta>();
	}

	public void adicionarNovaConta(int numeroConta, String nomeTitular) {

		Conta conta = new Conta(numeroConta, nomeTitular);
		this.contas.add(conta);
	}

	public void verificarSaldoConta(Integer numeroConta) {

		for (Conta conta : contas) {

			if (conta.getNumeroConta().equals(numeroConta)) {

				conta.verificarSaldo();
				break;
			}
		}
	}

	public void realizarSaqueConta(Integer numeroConta, Double valor) {

		for (Conta conta : contas) {

			if (conta.getNumeroConta().equals(numeroConta)) {

				conta.realizarSaque(valor);
				break;
			}
		}
	}

	public void realizarDepositoConta(Integer numeroConta, Double valor) {

		for (Conta conta : contas) {

			if (conta.getNumeroConta().equals(numeroConta)) {

				conta.realizarDeposito(valor);
				break;
			}
		}
	}
}