package Aula04;

public class ExercicioMath {

	int a;
	int b;
	
	public void Maior()
	{
		int maiorValor;
		maiorValor = Math.max(a, b);
		System.out.println("O maior valor � : " + maiorValor);
	}
	
	public void Raiz()
	{
		double resultado;
		resultado = Math.sqrt(a);
		System.out.println("A raiz � : " + resultado);
		
	}
	
	public void Potencia()
	{
		double resultado;
		resultado = Math.pow(a, b);
		System.out.println("O valor final � : " + resultado);
	}
	
}
