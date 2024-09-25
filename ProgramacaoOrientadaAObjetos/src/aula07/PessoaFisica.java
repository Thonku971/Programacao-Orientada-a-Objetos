package aula07;

public class PessoaFisica extends Imposto{

	
	private String nome;
	private double rendaAnual;
	private double gastoSaude;
	private double resultado;
	
	public PessoaFisica(String nome, double rendaAnual, double gastoSaude)
	{
		this.nome = nome;
		this.rendaAnual = rendaAnual;
		this.gastoSaude = gastoSaude;
	}
	
	@Override
	public void ValorTotal()
	{
		if(rendaAnual >= 20.000)
		{
			resultado = rendaAnual * 0.25; 
		}
		else
		{
			resultado = rendaAnual * 0.15;
		}
		if(gastoSaude != 0)
		{
			resultado = resultado/2;
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
		return "PessoaFisica [nome=" + nome + ", rendaAnual=" + rendaAnual + ", gastoSaude=" + gastoSaude
				+ ", imposto =" + resultado +  "total arrecadado " + (rendaAnual - resultado) +"]";
	}
	
}
