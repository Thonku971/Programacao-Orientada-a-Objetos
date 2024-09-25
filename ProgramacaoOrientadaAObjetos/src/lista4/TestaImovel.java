package lista4;

public class TestaImovel {

	public static void main(String args[])
	{
		Endereco endereco1 = new Endereco(254, "Contorno", "Ponta Grossa", "Parana");
		Endereco endereco2 = new Endereco(123, "Conto123rno", "Pont4123a Grossa", "Pa41234rana");
		Endereco endereco3 = new Endereco(25214, "Co12312312ntorno", "Podd32enta Grossa", "P32eqwsdarana");
		
		Imovel imovel1 = new Imovel(1000, endereco1);
		
		System.out.println(imovel1);
		
		ImovelNovo novo1 = new ImovelNovo(111, endereco2, 200);
		
		System.out.println(novo1);
		
		ImovelVelho velho1 = new ImovelVelho(321, endereco3, 400);
		
		System.out.println(velho1);
		
		
	}
	
}
