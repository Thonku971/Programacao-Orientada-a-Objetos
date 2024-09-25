package lista5_1;

public class Socio extends Locatario{
	
	
	private String cpf;
	private Boolean dependente;
	

	public Socio(String nome, String dataNascimento, String telefone, Endereco endereco, String cpf, Boolean dependente) {
		super(nome, dataNascimento, telefone, endereco);
		this.cpf = cpf;
		this.dependente = dependente;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public Boolean getDependente() {
		return dependente;
	}


	public void setDependente(Boolean dependente) {
		this.dependente = dependente;
	}
	
	
	
	
}
