package aula06;

public class Edicao {

	private int numero;
	private int volume;
	private String data;
	private Artigo artigo;
	
	
	public Edicao(int numero, int volume, String data, Artigo artigo) {
		this.numero = numero;
		this.volume = volume;
		this.data = data;
		this.artigo = artigo;
	}


	@Override
	public String toString() {
		return "Edicao [ numero = " + numero + ", volume = " + volume + ", data = " + data + ", artigo = " + artigo + "]";
	}
	
	
	
	
}
