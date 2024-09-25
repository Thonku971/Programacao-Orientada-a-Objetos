package lista4;

public class ColaboradorTeste {
	
	public static void main(String args[])
	{
		Colaborador colaborador1 = new Colaborador("Thomas", "casa", "1/1/2000");
		
		System.out.println(colaborador1);
		
		Funcionario funcionario1 = new Funcionario("abc", "apto", "1/1/2009", "Limpador", 8900.50);
		
		System.out.println(funcionario1);
		
		Prestador prestador1 = new Prestador("def", "sla", "03/09/2019", "Faxineiro", 540.00);
		
		System.out.println(prestador1);
		
		Empregado empregado1 = new Empregado("Jailson", "Delicia", "09/08/1997", "Ator" ,100.00, 1234);
		
		System.out.println(empregado1);
		
		Estagiario estagiario1 = new Estagiario("AOBA", "slaoporra", "07/12/2003", "Catador de Porco",570.90, 666);
		
		System.out.println(estagiario1);
		
		Empresa empresa1 = new Empresa("Batarde", "Aqui", "28/09/2018", "Entrega", 123.98,876543);
		
		System.out.println(empresa1);
		
		Autonomo autonomo1 = new Autonomo("Batarde", "Ivaí", "02/09/2002", "Bodegeiro", 654.54,65432);
		
		System.out.println(autonomo1);
		
	}

}
