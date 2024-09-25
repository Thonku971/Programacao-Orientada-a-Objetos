package aula09;

public class BancoTeste {

	public static void main(String[] args) {

		Banco b1 = new Banco(159357, "NewBank S.A.");

		b1.adicionarNovaConta(111, "João da Silva");
		b1.adicionarNovaConta(222, "Maria de Oliveira");
		b1.adicionarNovaConta(333, "Thomas");
		b1.adicionarNovaConta(444, "Ellen");

		// conta 111 - João da Silva
		b1.verificarSaldoConta(111);
		b1.realizarDepositoConta(111, 1000.00);
		b1.realizarSaqueConta(111, 700.00);
		b1.verificarSaldoConta(111);

		// conta 222 - Maria de Oliveira
		b1.verificarSaldoConta(222);
		b1.realizarSaqueConta(222, 100.00);
		
		// conta 333 - João da Silva
		b1.verificarSaldoConta(333);
		b1.realizarDepositoConta(333, 10000.00);
		b1.realizarSaqueConta(333, 800.00);
		b1.verificarSaldoConta(333);

		// conta 444 - Maria de Oliveira
		b1.verificarSaldoConta(444);
		b1.realizarSaqueConta(444, 10.00);
		
	}
}