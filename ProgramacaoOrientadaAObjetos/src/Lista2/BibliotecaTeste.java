package Lista2;

public class BibliotecaTeste {

	String titulo;
	String autor;
	String editora;
	int numPags;
	int anoPubli;
	boolean situacao;

	
	public void Empresta()
	{
		if(situacao == false)
		{
			situacao = true;
			System.out.println("Êxito ao emprestar o livro. ");
		}
		else
		{
			System.out.println("Infelizmente o livro já está emprestado. ");
		}
	}
	
	public void Devolve()
	{
		if(situacao == true)
		{
			situacao = false;
			System.out.println("Êxito ao devolver o livro. ");
		}
		else
		{
			System.out.println("O livro não pode ser devolvido. ");
		}
	}

	@Override
	public String toString() {
		return "BibliotecaTeste [titulo = " + titulo + ", autor = " + autor + ", editora = " + editora + ", numPags = "
				+ numPags + ", anoPubli = " + anoPubli + ", situacao = " + situacao + "]";
	}
	
	
	
}
