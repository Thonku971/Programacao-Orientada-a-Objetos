package Aula04;

public class CarroB {

	String modelo;
	String marca;
	String cor;
	int ano;
	String renavam;
	String chassi;
	String placa;
	boolean liga;
	int velocidade = 0;
	
	public CarroB(String modelo, int ano )
	{
		this.modelo = modelo;
		this.ano = ano;
	}
	
	public CarroB(String marca, String cor, int ano)
	{
		this.marca = marca;
		this.cor = cor;
		this.ano = ano;
	}
	
	public void Ligar()
	{
		this.liga = true;
		System.out.println("O carro est� ligando . ");
	}
	
	public void Desligar()
	{
		if(velocidade == 0)
		{	
    		liga = false;
    		System.out.println("O carro est� desligando . ");
		}
		else
		{
			System.out.println("O carro precisa estar parado para ser desligado .");
		}
	}
	
	public void Acelerar(int x)
	{
		if(x > 0)
		{
     		if(liga == true)
    		{
    			velocidade = velocidade + x;
    		}
	    	else
    		{
    			System.out.println("O carro precisa estar ligado para poder acelerar .");
    		}
		}
		else
		{
			System.out.println("O valor passado � inv�lido");
		}
	}
	
	public void Frear(int x)
	{
		if(x > 0)
		{
     		if(liga == true)
    		{
     			if(velocidade - x >= 0)
     			{
         			velocidade = velocidade - x;
     			}
     			else
     			{
     				System.out.println("Imposs�vel realizar tal opera��o (N�o existe velocidade negativa)");
     			}
    		}
	    	else
    		{
    			System.out.println("O carro precisa estar ligado para poder frear .");
    		}
		}
		else
		{
			System.out.println("O valor passado � inv�lido");
		}
	}

	@Override
	public String toString() {
		return "Carro [modelo = " + modelo + ", marca = " + marca + ", cor = " + cor + ", ano = " + ano + ", renavam = " + renavam
				+ ", chassi = " + chassi + ", placa = " + placa + ", liga = " + liga + ", velocidade = " + velocidade + "]";
	}
	
	
}
