package aula06;

public class RevistaCientificaTeste {

	
	public static void main (String args[])
	{
		
		Artigo artigo1 = new Artigo("Gisele Maciel é Fodona. ");
		
		Edicao edicao1 = new Edicao(4, 5, "31/03/2021", artigo1);
		
		RevistaCientifica revistaCientifica1 = new RevistaCientifica("Pessoas Incríveis", 1, "Anual", edicao1);
		
		System.out.println(revistaCientifica1);
	}
	
}
