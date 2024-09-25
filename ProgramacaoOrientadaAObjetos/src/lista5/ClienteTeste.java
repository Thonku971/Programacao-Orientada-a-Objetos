package lista5;

public class ClienteTeste {

	public static void main(String args[])
	{
		
		Conta conta1 = null;
 		
     	PratoEntrada entrada1 = new PratoEntrada("00000" , "0000" , "000", 0.00, false);
		
		PratoPrincipal principal1 = new PratoPrincipal("00000" , "0000" , "00000", 0.00, false);
		
		PratoSobremesa sobremesa1 = new PratoSobremesa("00000" , "00000" , "00000000", 0.00, false);


		
		
		conta1 = new Conta("Thomas", "213213", entrada1, principal1, sobremesa1 );	
     		
		
		entrada1 = new PratoEntrada("01" , "PÃO" , "É um pão", 3.50, true);
		
		 principal1 = new PratoPrincipal("51" , "PÃO21312" , "É u32123132m pão", 9.40, true);
		
		 sobremesa1 = new PratoSobremesa("31" , "PÃ324ewdO" , "É u213221321323211223m pão", 123.90, true);
		
		
		
		conta1.Entrada(entrada1);
		
		conta1.FecharConta();
		
		conta1.Principal(principal1);
		
		conta1.FecharConta();
		
		conta1.Sobremesa(sobremesa1);
		
		conta1.FecharConta();
	}

	
	
	
}
