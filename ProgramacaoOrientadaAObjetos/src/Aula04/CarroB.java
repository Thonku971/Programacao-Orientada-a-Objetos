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
		System.out.println("O carro está ligando . ");
	}
	
	public void Desligar()
	{
		if(velocidade == 0)
		{	
    		liga = false;
    		System.out.println("O carro está desligando . ");
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
			System.out.println("O valor passado é inválido");
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
     				System.out.println("Impossível realizar tal operação (Não existe velocidade negativa)");
     			}
    		}
	    	else
    		{
    			System.out.println("O carro precisa estar ligado para poder frear .");
    		}
		}
		else
		{
			System.out.println("O valor passado é inválido");
		}
	}

	@Override
	public String toString() {
		return "Carro [modelo = " + modelo + ", marca = " + marca + ", cor = " + cor + ", ano = " + ano + ", renavam = " + renavam
				+ ", chassi = " + chassi + ", placa = " + placa + ", liga = " + liga + ", velocidade = " + velocidade + "]";
	}
	
	
}
