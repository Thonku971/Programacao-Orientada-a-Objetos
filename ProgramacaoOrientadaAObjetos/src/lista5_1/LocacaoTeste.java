package lista5_1;

public class LocacaoTeste {

	
	public static void main(String args[])
	{
		
		
		Filme filme1 = new Filme("A volta dos que não foram", 123.5, 5.99, false);
		
		Endereco endereco1 = new Endereco("Sei la", "254", "Contorno", "2312312", "pg", "pr");
		
		Locatario locatario1 = null;
		
		
		locatario1 = new Socio("Thomas","11/09/2000", "12321421", endereco1, "123124" , false) ;
		
		Locacao locacao1 = new Locacao(12, 17, 15, locatario1, 5.99 , 1.50 , filme1);
		
		locacao1.Locar(locatario1, "A volta dos que não foram", 12 );
		
		locacao1.Devolver("A volta dos que não foram", 18 );
		
		
		System.out.println(locacao1);
		
		
	}
	
}
