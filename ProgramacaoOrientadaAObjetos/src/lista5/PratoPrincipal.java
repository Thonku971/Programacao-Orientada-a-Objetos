package lista5;

public class PratoPrincipal {

	private String numero;
	private String nome;
	private String descricao;
	private Double preco;
	private Boolean tem = false;
	
	public PratoPrincipal(String numero, String nome, String descricao, Double preco, Boolean tem) {

		this.numero = numero;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.tem = tem;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Boolean getTem() {
		return tem;
	}

	public void setTem(Boolean tem) {
		this.tem = tem;
	}
	
	
}
