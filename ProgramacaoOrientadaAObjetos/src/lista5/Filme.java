package lista5;

public class Filme extends Sala{

	private String titulo;
	private Double duracao;

	public Filme(String data, String hor�rio, Integer numIngressos, Integer numId, Integer capacidade, Double duracao, String titulo) {
		super(data, hor�rio, numIngressos, numId, capacidade);
		this.duracao = duracao;
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Filme [titulo=" + titulo + ", duracao=" + duracao + ", numId=" + numId + ", capacidade=" + capacidade
				+ ", data=" + data + ", hor�rio=" + hor�rio + ", numIngressos=" + numIngressos +  ", total vendidos = " + vendidos + "]";
	}

	
	
	
}
