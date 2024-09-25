package aula06;

public class RevistaCientifica {

	private String titulo;
	private int issn;
	private String periodicidade;
	private Edicao edicao;
	
	public RevistaCientifica(String titulo, int issn, String periodicidade, Edicao edicao) {
		this.titulo = titulo;
		this.issn = issn;
		this.periodicidade = periodicidade;
		this.edicao = edicao;
	}

	@Override
	public String toString() {
		return "RevistaCientifica [ titulo = " + titulo + ", issn =  " + issn + ", periodicidade = " + periodicidade
				+ ", edicao = " + edicao + "]";
	}	
	
	
	
}
