package Lista1;

public class CarroTeste {

	String modelo;
	String marca;
	String cor;
	String chassi;
	String placa;
	int ano;
	int renavam;
	
	public void Ligar()
	{
		System.out.println(" O carro: " + modelo + " com a placa: " + placa + " esta ligando");
	}
	
	public void Acelerar()
	{
		System.out.println(" O carro: " + modelo + " com a placa: " + placa + " esta acelerando");
	}
	
	public void Frear()
	{
		System.out.println(" O carro: " + modelo + " com a placa: " + placa + " esta freando");
	}
	
	public void Desligar()
	{
		System.out.println(" O carro: " + modelo + " com a placa: " + placa + " esta desligando");
	}

	@Override
	public String toString() {
		return "CarroTeste [modelo=" + modelo + ", marca=" + marca + ", cor=" + cor + ", chassi=" + chassi + ", placa="
				+ placa + ", ano=" + ano + ", renavam=" + renavam + "]";
	}

	

}
