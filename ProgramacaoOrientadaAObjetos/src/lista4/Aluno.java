package lista4;

public class Aluno extends Pessoa {

	private int matricula;
	
	public Aluno(String nome, String nascimento, long rg, long cpf, int matricula)
	{
		super(nome, nascimento, rg, cpf);
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome + ", nascimento=" + nascimento + ", rg=" + rg
				+ ", cpf=" + cpf + "]";
	}
	
	
}
