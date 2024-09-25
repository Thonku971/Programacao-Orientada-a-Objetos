package lista5;

public class FuncionarioTeste {
	
	public static void main(String args[])
	{
		
		
		Funcionario funcionario1 = null;
		Funcionario funcionario2 = null;
		Materia materia1 =new Materia("A1a1", "DEMONHO", "Dar bica em grávida", "120 hras" );
		Processo processo1 = new Processo("B2b2", "09/02/2019", "Voadora");	
		
		funcionario1= new Professor("a1", "Juarez", "12-04-2013", 21000.00, Titulo.Doutor, materia1);
		funcionario1.SalarioTotal();
		
		funcionario1.Printa();
		System.out.println("Cod: " + materia1.getCod());
		System.out.println("Nome: " + materia1.getNome());
		System.out.println("Ementa: " + materia1.getEmenta());
		System.out.println("Carga Horária: " + materia1.getCargaHoraria());
		
		funcionario2 = new TecADM("b2", "Andréia", "09-05-1990", 5000.00, 750.00, processo1);
		funcionario2.SalarioTotal();
		funcionario2.Printa();
		
		System.out.println("Cod: " + processo1.getCod());
		System.out.println("Nome: " + processo1.getDataCriacao());
		System.out.println("Ementa: " + processo1.getDescricao());
		
	}

}
