package lista4;

public class Empresa extends Prestador{
	
	private long cnpj;
	
	public Empresa(String nome, String endereco, String dataInicio, String tipoServico, double valorHora, long cnpj)
	{
		super(nome, endereco, dataInicio, tipoServico, valorHora);
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "Empresa [cnpj=" + cnpj + ", valorHora=" + valorHora + ", tipoServico=" + tipoServico + ", nome=" + nome
				+ ", endereco=" + endereco + ", dataInicio=" + dataInicio + "]";
	}

	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}

	
}
