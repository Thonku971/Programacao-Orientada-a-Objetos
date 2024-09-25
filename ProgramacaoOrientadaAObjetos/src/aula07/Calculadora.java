package aula07;

public class Calculadora {

	private double resultado;
	
	void calcularMedia(double valor1, double valor2)
	{
		resultado = (valor1 + valor2)/2;
	
		System.out.println("O resultado é : " + resultado );
	}
	
	
	void calcularMedia(double valor1, double valor2, double valor3)
	{
		resultado = (valor1 + valor2 + valor3)/3;
	
		System.out.println("O resultado é : " + resultado );
	}
	
	void calcularMedia(double valor1, double valor2, double valor3, double valor4)
	{
		resultado = (valor1 + valor2 + valor3 + valor4)/4;
	
		System.out.println("O resultado é : " + resultado );
	}
	
}
