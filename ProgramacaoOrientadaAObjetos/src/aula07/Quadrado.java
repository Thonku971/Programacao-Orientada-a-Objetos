package aula07;

public class Quadrado extends Quadrilatero{
	
    private double lado;
	
    public Quadrado(double lado)
    {
    	this.lado = lado;
    }
	
    
	@Override
	public void calcularArea()
	{
		lado = lado * lado;
		System.out.println("Área = " + lado);
	}

	

}
