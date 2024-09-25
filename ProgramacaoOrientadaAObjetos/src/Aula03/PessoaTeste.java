package Aula03;

public class PessoaTeste
{

	String nome;
	int idade;
	double peso;
			
		public void Anda()
		{
		  System.out.println(nome + " esta andando. ");	
		}
		
		public void Correr()
		{
		  System.out.println(nome + " esta correndo. ");
		}
		
		public void Falar()
		{
			System.out.println(nome + " esta falando. ");	
		}

		@Override
		public String toString() {
			return "PessoaTeste [nome=" + nome + ", idade=" + idade + ", peso=" + peso + "]";
		}
	
	}