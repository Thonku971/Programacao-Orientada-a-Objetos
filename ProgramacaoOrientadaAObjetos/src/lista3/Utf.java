package lista3;

public class Utf {

	int velocidade;
	String marcha;
	
	
	public Utf(int velocidade)
	{
		this.velocidade = velocidade;
	}
	
	public void Acelera()
	{
		velocidade = velocidade + 5;
		if(velocidade >= 90)
		{
			velocidade = 90;
		}
		if(velocidade == 0)
		{
			marcha = "Neutro";
		}
		
		else if(velocidade >= 1 && velocidade <= 19)
		{
			marcha = "Primeira";
		}
		
		else if(velocidade >= 20 && velocidade <= 39)
		{
			marcha = "Segunda";
		}
		
		else if(velocidade >= 40 && velocidade <= 59)
		{
			marcha = "Terceira";
		}
		
		else if(velocidade >= 60 && velocidade <= 89)
		{
			marcha = "Quarta";
		}
		else 
		{
			marcha = "Quinta";
		}
	}
	
	public void Frea()
	{
		velocidade = velocidade - 5;
		if(velocidade <= 0)
		{
			velocidade = 0;
		}
		
		if(velocidade == 0)
		{
			marcha = "Neutro";
		}
		
		else if(velocidade >= 1 && velocidade <= 19)
		{
			marcha = "Primeira";
		}
		
		else if(velocidade >= 20 && velocidade <= 39)
		{
			marcha = "Segunda";
		}
		
		else if(velocidade >= 40 && velocidade <= 59)
		{
			marcha = "Terceira";
		}
		
		else if(velocidade >= 60 && velocidade <= 89)
		{
			marcha = "Quarta";
		}
		else 
		{
			marcha = "Quinta";
		}
	}

	@Override
	public String toString() {
		return "Utf [velocidade=" + velocidade + ", marcha=" + marcha + "]";
	}
}
