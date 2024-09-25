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
			System.out.println("Imposs�vel realizar a opera��o ");
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
			return "Conta Banc�ria [N�mero da Ag�ncia = " + numeroAgencia + ",N�mero da conta = " + numeroConta + ", Saldo = " + saldo ;
		
	}
	
}
