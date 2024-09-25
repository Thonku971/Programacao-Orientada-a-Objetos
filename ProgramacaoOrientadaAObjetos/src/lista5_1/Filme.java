package lista5_1;

public class Filme {

	private String titulo;
	private Double duracao;
	private Double preco;
	private Boolean situacao;
	
	public Filme(String titulo, Double duracao, Double preco, Boolean situacao) {
		this.titulo = titulo;
		this.duracao = duracao;
		this.preco = preco;
		this.situacao = situacao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Double getDuracao() {
		return duracao;
	}

	public void setDuracao(Double duracao) {
		this.duracao = duracao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Boolean getSituacao() {
		return situacao;
	}

	public void setSituacao(Boolean situacao) {
		this.situacao = situacao;
	}
	
	
	
	
	
	
}
