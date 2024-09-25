package aula07;

import java.util.Scanner;

public class QuadrilateroTeste {

	public static void main(String args[])
	{
		
		Scanner entrada = new Scanner (System.in);
		
		double valor1;
		double valor2;
		int opcao;
		Quadrilatero quadri = null;
		
		System.out.println("Informe a opção");
		System.out.println("1 - Quadrado ");
		System.out.println("2 - Retangulo ");
		System.out.println("3 - Losango ");
		System.out.println("4 - Sair ");
		opcao = entrada.nextInt();

		switch(opcao)
		{
		
		case 1:
			System.out.println("Informe o valor");
			valor1 = entrada.nextDouble();
			quadri = new Quadrado(valor1);
			quadri.calcularArea();
			break;
			
		case 2:
			System.out.println("Informe o primeiro valor");
			valor1 = entrada.nextDouble();
			System.out.println("Informe o segundo valor");
			valor2 = entrada.nextDouble();
			quadri = new Retangulo(valor1, valor2);
			quadri.calcularArea();
			break;
			
		case 3:
			System.out.println("Informe o primeiro valor");
			valor1 = entrada.nextDouble();
			System.out.println("Informe o segundo valor");
			valor2 = entrada.nextDouble();
			quadri = new Losango(valor1, valor2);
			quadri.calcularArea();			
			break;
		
		case 4:
			System.out.println("Saindo");
			
		
		default:
			System.out.println("Inválido");
			break;
			
		
		}
		
		
		entrada.close();
		
		
	}
	
	
}
