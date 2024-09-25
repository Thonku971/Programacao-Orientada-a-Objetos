package lista5;

public class Sala extends Sessao{
	
	protected Integer numId;
	protected Integer capacidade;
	protected Integer vendidos = 0;
	private Integer venda;
	
	public Sala(String data, String horário, Integer numIngressos, Integer numId, Integer capacidade) {
		super(data, horário, numIngressos);
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
			System.out.println("Inválido, o número de ingressos requeridos é maior que o de disponíveis . ");
		}
		else
		{
			vendidos = vendidos + venda;
			capacidade = capacidade - venda;
		}
	}




}
