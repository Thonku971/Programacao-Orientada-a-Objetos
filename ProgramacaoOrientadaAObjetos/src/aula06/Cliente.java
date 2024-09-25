package aula06;

public class Cliente {

	private int codigo;
	private String nome;
	private String data;
	private ClienteEnum estadoCivil;
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public ClienteEnum getEstadoCivil() {
		return estadoCivil;
	}
	
	public void setEstadoCivil(ClienteEnum estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nome=" + nome + ", data=" + data + ", estadoCivil=" + estadoCivil + "]";
	}
	
	
	
	
	
	
	
}
