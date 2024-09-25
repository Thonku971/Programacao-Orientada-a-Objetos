package lista3;

public class Disciplinas {

	protected String codigo;
	protected String nome;
	protected String modalidade;
	protected float cargaHoraria;
	protected String conteudo;
	
	public Disciplinas(String conteudo, float cargaHoraria)
	{
		this.conteudo = conteudo;
		this.cargaHoraria = cargaHoraria;
	}
	
	public String getCodigo()
	{
		return codigo;
	}
	
	public void setCodigo(String codigo)
	{
		this.codigo = codigo;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public String getModalidade()
	{
		return modalidade;
	}
	
	public void setModalidade(String modalidade)
	{
		this.modalidade = modalidade;
	}

	@Override
	public String toString() {
		return "Disciplinas [codigo=" + codigo + ", nome=" + nome + ", modalidade=" + modalidade + ", cargaHoraria="
				+ cargaHoraria + ", conteudo=" + conteudo + "]";
	}
	
	
}
