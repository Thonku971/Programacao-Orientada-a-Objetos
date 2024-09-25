package aula07;

import java.util.Scanner;

public class CalculadoraTeste {

	
	public static void main(String args[])
	{
	 
		Scanner entrada = new Scanner(System.in);
		
		Calculadora calcu1 = new Calculadora();
		
		double valor1;
		double valor2;
		double valor3;
		double valor4;
		
		
		System.out.println("Informe o primeiro valor : ");
		valor1 = entrada.nextDouble();
		System.out.println("Informe o segundo valor : ");
		valor2 = entrada.nextDouble();
		
		calcu1.calcularMedia(valor1, valor2);

		System.out.println("Informe o primeiro valor : ");
		valor1 = entrada.nextDouble();
		System.out.println("Informe o segundo valor : ");
		valor2 = entrada.nextDouble();
		System.out.println("Informe o terceiro valor : ");
		valor3 = entrada.nextDouble();
		
		calcu1.calcularMedia(valor1, valor2, valor3);

		
		System.out.println("Informe o primeiro valor : ");
		valor1 = entrada.nextDouble();
		System.out.println("Informe o segundo valor : ");
		valor2 = entrada.nextDouble();
		System.out.println("Informe o terceiro valor : ");
		valor3 = entrada.nextDouble();
		System.out.println("Informe o quarto valor : ");
		valor4 = entrada.nextDouble();
		
		calcu1.calcularMedia(valor1, valor2, valor3, valor4);
		entrada.close();
 		
	}
	
}
