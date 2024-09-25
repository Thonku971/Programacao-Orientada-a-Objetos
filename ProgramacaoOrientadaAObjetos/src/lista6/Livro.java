package lista6;

public class Livro {

	private Integer totalPaginas;
	private String titulo;
	private String autor;
	private String anoPublicacao;
	private String editora;
	private Boolean disponibilidade = true;
	private Integer data;
	private Double multa;
	
	public Livro(Integer totalPaginas, String titulo, String autor, String anoPublicacao, String editora) {		
   
		this.totalPaginas = totalPaginas;
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		this.editora = editora;
	}

	public void verificarDisponibilidade() {		

		System.out.println("livro: " + this.titulo + ".\n"
				         + "Disponibilidade: R$" + this.disponibilidade + "\n");
	}

	public void realizarEmprestimo(Integer data) {		

		if(this.disponibilidade == true) {			

			this.disponibilidade = false;
			this.data = data;
			System.out.println("livro: " + this.titulo + "\n"
					         + " Emprestado com sucesso.\n");		

		} else {			

			System.out.println("livro: " + this.titulo + "\n"
					         + "Impossível emprestar.\n");
		}
	}

	public void realizarDevolucao(Integer datafim) {		

		if(this.disponibilidade == false) {			

			this.disponibilidade = true;
			if((datafim - this.data) > 7)
			{
				this.multa = (datafim - this.data) * 1.50;
				System.out.println("livro : " + this.titulo + "\n"
						+ "Devolvido com multa de : " + this.multa);
			}
			else if((datafim - this.data) < 0)
			{
				System.out.println("Erro");		
			}
			else
			{
				System.out.println("livro : " + this.titulo + "\n"
									+ "Devolvido sem multa");	
			}
		} else {			

			System.out.println("livro: " + this.titulo + "\n"
					         + "Impossível emprestar.\n");
		}
	}

	public String getTitulo() {
		return titulo;
	}

	public Boolean getDisponibilidade() {
		return disponibilidade;
	}


	
}
