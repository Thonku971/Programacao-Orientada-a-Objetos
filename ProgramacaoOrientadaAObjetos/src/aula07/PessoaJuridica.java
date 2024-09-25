package aula07;

public class PessoaJuridica extends Imposto{

	private String nome;
	private double rendaAnual;
	private int numeroFuncionarios;
	private double resultado;
	
	public PessoaJuridica(String nome, double rendaAnual, int numeroFuncionarios)
	{
		this.nome = nome;
		this.rendaAnual = rendaAnual;
		this.numeroFuncionarios = numeroFuncionarios;
	}
	@Override
	public void ValorTotal()
	{
		if(numeroFuncionarios <= 15)
		{
			resultado = rendaAnual * 0.18; 
		}
		else
		{
			resultado = rendaAnual * 0.13;
		}

		System.out.println(resultado);
	}
	
	@Override
	public void ValorArrecadado()
	{
   
		System.out.println(rendaAnual - resultado);		
	}
	@Override
	public String toString() {
		return "PessoaJuridica [nome=" + nome + ", rendaAnual=" + rendaAnual + ", numeroFuncionarios="
				+ numeroFuncionarios + ", total imposto=" + resultado + "valor arrecadado" + (rendaAnual - resultado) + "]";
	}
	
}
