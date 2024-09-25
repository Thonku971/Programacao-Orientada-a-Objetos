package aula07;

public class Retangulo extends Quadrilatero{

	
	private double base;
	private double altura;
	
	public Retangulo(double base, double altura)
	{
		this.base = base;
		this.altura = altura;
	}
		
	@Override
	public void calcularArea()
	{
		base = base*altura;
		System.out.println("Área = " + base);
	}



}
