package lista5;

public class Processo {

	
	private String cod;
	private String dataCriacao;
	private String descricao;

	public Processo(String cod, String dataCriacao, String descricao) {
		this.cod = cod;
		this.dataCriacao = dataCriacao;
		this.descricao = descricao;
	}

	
	
	
	public void Printa()
	{
		System.out.println("Processo [cod=" + cod + ", dataCriacao=" + dataCriacao + ", descricao=" + descricao + "]");
		
	}




	public String getCod() {
		return cod;
	}




	public void setCod(String cod) {
		this.cod = cod;
	}




	public String getDataCriacao() {
		return dataCriacao;
	}




	public void setDataCriacao(String dataCriacao) {
		this.dataCriacao = dataCriacao;
	}




	public String getDescricao() {
		return descricao;
	}




	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
