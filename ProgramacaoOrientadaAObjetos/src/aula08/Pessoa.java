package aula08;

public class Pessoa {

	String nome;
	Integer idade;
	Integer cpf;
	String logradouro;
	Integer numero;
	String bairro;
	String cidade;
	String estado;
	Integer cep;
	
	public Pessoa()
	{
		
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", cpf=" + cpf + ", logradouro=" + logradouro + ", numero="
				+ numero + ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado + ", cep=" + cep + "]";
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public Integer getIdade() {
		return idade;
	}



	public void setIdade(Integer idade) {
		this.idade = idade;
	}



	public Integer getCpf() {
		return cpf;
	}



	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}



	public String getLogradouro() {
		return logradouro;
	}



	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}



	public Integer getNumero() {
		return numero;
	}



	public void setNumero(Integer numero) {
		this.numero = numero;
	}



	public String getBairro() {
		return bairro;
	}



	public void setBairro(String bairro) {
		this.bairro = bairro;
	}



	public String getCidade() {
		return cidade;
	}



	public void setCidade(String cidade) {
		this.cidade = cidade;
	}



	public String getEstado() {
		return estado;
	}



	public void setEstado(String estado) {
		this.estado = estado;
	}



	public Integer getCep() {
		return cep;
	}



	public void setCep(Integer cep) {
		this.cep = cep;
	}
	
	
	
}
