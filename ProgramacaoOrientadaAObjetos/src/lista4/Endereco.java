package lista4;

public class Endereco {

	private int numero;
	private String bairro;
	private String cidade;
	private String uf;
	
	
	public Endereco (int numero, String bairro, String cidade, String uf) 
	{
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
	}


	@Override
	public String toString() {
		return "Endereco [numero=" + numero + ", bairro=" + bairro + ", cidade=" + cidade + ", uf=" + uf + "]";
	}
	
}
