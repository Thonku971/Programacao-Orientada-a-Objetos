package lista4;

public class ImovelVelho extends Imovel{

	private int desconto;
	
	public ImovelVelho(int valorBase, Endereco endereco, int desconto)
	{
		super(valorBase, endereco);
		this.desconto = desconto;
	}

	@Override
	public String toString() {
		return "ImovelVelho [desconto=" + desconto + ", valorBase=" + valorBase + ", endereco=" + endereco + "]";
	}
	
}
