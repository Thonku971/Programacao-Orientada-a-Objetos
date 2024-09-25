package lista4;

public class ImovelNovo extends Imovel{

	private int adicional;
	
	
	ImovelNovo(int valorBase, Endereco endereco, int adicional)
	{
		super(valorBase, endereco);
		this.adicional = adicional;
	}


	@Override
	public String toString() {
		return "ImovelNovo [adicional=" + adicional + ", valorBase=" + valorBase + ", endereco=" + endereco + "]";
	}
	
	
	
}
