package aula06;

public class PessoaTeste {

	public static void main(String args[])
	{
		
		
		Endere�o endereco1 = new Endere�o("AOBA", 23, "Salve", "Fuiii", "Fiampz");
	

		Pessoa pessoa1 = new Pessoa("Gerso", "12/3/1982", "Dale", "asdasd@gmail.com", EstadoCivil.Solteiro, endereco1);
		
		System.out.println(pessoa1);
		
		pessoa1.getDataNascimento();
		pessoa1.setDataNascimento("11/09/2000");
		pessoa1.getEmail();
		pessoa1.setEmail("thomaskrevey@gmail.com");
		pessoa1.getEndere�o().setBairro("Contorno");
		pessoa1.getEndere�o().setCidade("PG");
		pessoa1.getEndere�o().setLogradouro("Sla oq � isso");
		pessoa1.getEndere�o().setNumero(254);
		pessoa1.getEndere�o().setUf("PR");
		pessoa1.getSexo();
		pessoa1.setSexo("Masculino");
		pessoa1.getNome();
		pessoa1.setNome("Thomas Krevey Derkascz");
		pessoa1.getEstadoCivil();
		pessoa1.setEstadocivil(EstadoCivil.Solteiro);
		
		System.out.println(pessoa1);
		
		
		pessoa1.getEstadoCivil();
		pessoa1.setEstadocivil(EstadoCivil.Casado);
		
		System.out.println(pessoa1);
		
		pessoa1.getEstadoCivil();
		pessoa1.setEstadocivil(EstadoCivil.Divorciado);
		
		System.out.println(pessoa1);
		
		pessoa1.getEstadoCivil();
		pessoa1.setEstadocivil(EstadoCivil.Viuvo);
		
		System.out.println(pessoa1);
	}
	
	
}
