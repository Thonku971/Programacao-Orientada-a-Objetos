package lista4;

public class IngressoVip extends Ingresso{

	private String localizacao;
	private int adicional;
	private int soma;
	
	public IngressoVip(int valor, String tipo, String localizacao, int adicional)
	{
		super(valor, tipo);
		this.localizacao = localizacao;
		this.adicional = adicional;
	}
	
	public int calcularValorIngressoVip()
	{
		soma = valor + adicional;
		return soma;
	}
	
	public void imprimirDadosIngresso()
	{
       super.imprimirDadosIngresso();
       System.out.println("Valor =" + valor + "localizacao = " + localizacao + "adicional = " + adicional);
	}
	
}
