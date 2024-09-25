package lista4;

public class Pessoa {

	protected String nome;
	protected String nascimento;
	protected long rg;
	protected long cpf;
	
	public Pessoa(String nome, String nascimento, long rg, long cpf)
	{
		this.nome = nome;
		this.nascimento = nascimento;
		this.rg = rg;
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", nascimento=" + nascimento + ", rg=" + rg + ", cpf=" + cpf + "]";
	}
	
	
}
