package aula06;

public class PessoaTeste {

	public static void main(String args[])
	{
		
		
		Endereço endereco1 = new Endereço("AOBA", 23, "Salve", "Fuiii", "Fiampz");
	

		Pessoa pessoa1 = new Pessoa("Gerso", "12/3/1982", "Dale", "asdasd@gmail.com", EstadoCivil.Solteiro, endereco1);
		
		System.out.println(pessoa1);
		
		pessoa1.getDataNascimento();
		pessoa1.setDataNascimento("11/09/2000");
		pessoa1.getEmail();
		pessoa1.setEmail("thomaskrevey@gmail.com");
		pessoa1.getEndereço().setBairro("Contorno");
		pessoa1.getEndereço().setCidade("PG");
		pessoa1.getEndereço().setLogradouro("Sla oq é isso");
		pessoa1.getEndereço().setNumero(254);
		pessoa1.getEndereço().setUf("PR");
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
