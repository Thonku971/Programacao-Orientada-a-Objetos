package Aula01;

import java.util.Scanner;

public class Desconto
{
	
	public static void main(String args[])
	{
		
		System.out.println("Informe o valor da compra : ");
		
		try(Scanner scanner = new Scanner (System.in)) {
			double valor = scanner.nextDouble();
			double resultado;
			
			resultado = (valor >= 50 ) ? valor / 10 : valor / 20; 
			
			System.out.println("O valor do desconto é : " + resultado);
		}
		
		
	}
	
}