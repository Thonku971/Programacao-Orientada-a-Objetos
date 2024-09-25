package Aula02;

public class Pessoa {
	
	public static void main (String [] args)
	{
		
		PessoaTeste pessoa1 = new PessoaTeste();
		PessoaTeste pessoa2 = new PessoaTeste();
		PessoaTeste pessoa3 = new PessoaTeste();
		
		pessoa1.nome = "João";
		pessoa1.idade = 25;
		pessoa1.peso = 68.5;

		pessoa2.nome = "Maria";
		pessoa2.idade = 30 ;
		pessoa2.peso = 55.6;

		pessoa3.nome = "José";
		pessoa3.idade = 32;
		pessoa3.peso = 62.4;
		
		System.out.println(pessoa1.nome + " tem " + pessoa1.idade + " anos e pesa " + pessoa1.peso + " Kilos ");
		System.out.println(pessoa2.nome + " tem " + pessoa2.idade + " anos e pesa " + pessoa2.peso + " Kilos ");
		System.out.println(pessoa3.nome + " tem " + pessoa3.idade + " anos e pesa " + pessoa3.peso + " Kilos ");
	}
	


}
