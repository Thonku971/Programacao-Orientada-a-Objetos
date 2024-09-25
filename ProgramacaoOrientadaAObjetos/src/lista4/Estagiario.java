package lista4;

public class Estagiario extends Funcionario{
	
	private int ciie;
	
	public Estagiario(String nome, String endereco, String dataInicio, String funcao, double salario, int ciie)
	{
		super(nome, endereco, dataInicio, funcao, salario);
		this.ciie = ciie;
	}

	@Override
	public String toString() {
		return "Estagiario [ciie=" + ciie + ", funcao=" + funcao + ", salario=" + salario + ", nome=" + nome
				+ ", endereco=" + endereco + ", dataInicio=" + dataInicio + "]";
	}

	public int getCiie() {
		return ciie;
	}

	public void setCiie(int ciie) {
		this.ciie = ciie;
	}

	
}
