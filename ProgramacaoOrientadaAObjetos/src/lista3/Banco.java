package lista3;

public class Banco {

	String numeroAgencia;
	String numeroConta;
	float saldo;
	float valor;
	
	public Banco(String numeroAgencia, String conta, float saldo)
	{
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = conta;
		this.saldo = saldo;
	}
	
	public void Saque(float valor)
	{
		this.valor = valor;
		if(valor  > saldo)
		{
			System.out.println("Impossível realizar a operação ");
		}
		else
		{
			saldo = saldo - valor;
		}
	}
	
	public void Deposito(float valor)
	{
		this.valor = valor;
		saldo = saldo + valor;
	}
	
	@Override
	public String toString() {
			return "Conta Bancária [Número da Agência = " + numeroAgencia + ",Número da conta = " + numeroConta + ", Saldo = " + saldo ;
		
	}
	
}
