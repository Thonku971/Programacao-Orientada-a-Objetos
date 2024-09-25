package lista4;

public class Imovel {

	protected int valorBase;
	protected Endereco endereco;
	
	public Imovel(int valorBase, Endereco endereco)
	{
		this.valorBase = valorBase;
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Imovel [valorBase=" + valorBase + ", endereco=" + endereco + "]";
	}
	
	
}
