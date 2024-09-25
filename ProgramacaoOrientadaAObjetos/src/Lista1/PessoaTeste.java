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
		System.out.println(nome + " é " + sexo + " com o CPF: " + cpf + " Tem " + idade + " anos de idade " + " tem " + altura + " de altura e " + peso + " Kg. " + "começou a andar");
	}
	
	public void Correr()
	{
		System.out.println(nome + " é " + sexo + " com o CPF: " + cpf + " Tem " + idade + " anos de idade " + " tem " + altura + " de altura e " + peso + " Kg. " + "começou a correr");
	}
	
	public void Falar()
	{
		System.out.println(nome + " é " + sexo + " com o CPF: " + cpf + " Tem " + idade + " anos de idade " + " tem " + altura + " de altura e " + peso + " Kg. " + "começou a falar");
	}
	
	public void Dormir()
	{
		System.out.println(nome + " é " + sexo + " com o CPF: " + cpf + " Tem " + idade + " anos de idade " + " tem " + altura + " de altura e " + peso + " Kg. " + "começou a dormir");
	}

	@Override
	public String toString() {
		return "PessoaTeste [nome=" + nome + ", sexo=" + sexo + ", cpf=" + cpf + ", idade=" + idade + ", altura="
				+ altura + ", peso=" + peso + "]";
	}
	

}
