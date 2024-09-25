package aula07;

public class Losango extends Quadrilatero {
	
	private double diagonalMaior;
	private double diagonalMenor;
	

	public Losango(double diagonalMaior, double diagonalMenor)
	{
		this.diagonalMaior = diagonalMaior;
		this.diagonalMenor = diagonalMenor;
	}
	
	@Override
	public void calcularArea()
	{
		diagonalMaior = diagonalMaior * diagonalMenor;
		diagonalMaior = diagonalMaior / 2;
		System.out.println("Área = " + diagonalMaior);
	}

}
