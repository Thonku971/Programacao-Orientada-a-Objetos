package lista5;

public class Sala extends Sessao{
	
	protected Integer numId;
	protected Integer capacidade;
	protected Integer vendidos = 0;
	private Integer venda;
	
	public Sala(String data, String hor�rio, Integer numIngressos, Integer numId, Integer capacidade) {
		super(data, hor�rio, numIngressos);
		this.numId = numId;
		this.capacidade = capacidade;
	}
	
	public void setVenda(Integer venda) {
		this.venda = venda;
	}

	
	protected void Calcula()
	{
		if(venda > capacidade)
		{
			System.out.println("Inv�lido, o n�mero de ingressos requeridos � maior que o de dispon�veis . ");
		}
		else
		{
			vendidos = vendidos + venda;
			capacidade = capacidade - venda;
		}
	}




}
