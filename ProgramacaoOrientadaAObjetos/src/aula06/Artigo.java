package aula06;

public class Artigo {

	private String tituloArtigo;
	
	public Artigo(String tituloArtigo)
	{
		this.tituloArtigo = tituloArtigo;
	}

	@Override
	public String toString() {
		return "Artigo [ tituloArtigo = " + tituloArtigo + "]";
	}
	
}
