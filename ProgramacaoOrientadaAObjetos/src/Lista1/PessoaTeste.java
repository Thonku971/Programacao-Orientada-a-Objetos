package Lista1;

public class PessoaTeste {
	
	String nome;
	String sexo;
	int cpf;
	int idade;
	double altura;
	double peso;
	
	public void Andar()
	{
		System.out.println(nome + " � " + sexo + " com o CPF: " + cpf + " Tem " + idade + " anos de idade " + " tem " + altura + " de altura e " + peso + " Kg. " + "come�ou a andar");
	}
	
	public void Correr()
	{
		System.out.println(nome + " � " + sexo + " com o CPF: " + cpf + " Tem " + idade + " anos de idade " + " tem " + altura + " de altura e " + peso + " Kg. " + "come�ou a correr");
	}
	
	public void Falar()
	{
		System.out.println(nome + " � " + sexo + " com o CPF: " + cpf + " Tem " + idade + " anos de idade " + " tem " + altura + " de altura e " + peso + " Kg. " + "come�ou a falar");
	}
	
	public void Dormir()
	{
		System.out.println(nome + " � " + sexo + " com o CPF: " + cpf + " Tem " + idade + " anos de idade " + " tem " + altura + " de altura e " + peso + " Kg. " + "come�ou a dormir");
	}

	@Override
	public String toString() {
		return "PessoaTeste [nome=" + nome + ", sexo=" + sexo + ", cpf=" + cpf + ", idade=" + idade + ", altura="
				+ altura + ", peso=" + peso + "]";
	}
	

}
