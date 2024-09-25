package lista4;

public class Autonomo extends Prestador{
	
	private long cpf;
	
	public Autonomo(String nome, String endereco, String dataInicio, String tipoServico, double valorHora, long cpf)
	{
	    super(nome, endereco, dataInicio, tipoServico, valorHora);
	    this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Autonomo [cpf=" + cpf + ", valorHora=" + valorHora + ", tipoServico=" + tipoServico + ", nome=" + nome
				+ ", endereco=" + endereco + ", dataInicio=" + dataInicio + "]";
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	
}
