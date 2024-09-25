package Aula04;

import java.util.Scanner;

public class CarroTeste {

	public static void main(String args[])
	{
		Scanner entrada = new Scanner(System.in); 
		
		Carro carro1 = new Carro();
		
		int opcao = 1;
		int valor;
		
		System.out.println("Informe o modelo do carro .");
		carro1.modelo = entrada.nextLine();
		System.out.println("Informe a marca do carro .");
		carro1.marca = entrada.nextLine();
		System.out.println("Informe a cor do carro .");
		carro1.cor = entrada.nextLine();
		System.out.println("Informe o ano do carro .");
		carro1.ano = entrada.nextInt();
		entrada.nextLine();
		System.out.println("Informe o renavam do carro .");
		carro1.renavam = entrada.nextLine();
		System.out.println("Informe o chassi do carro .");
		carro1.chassi = entrada.nextLine();
		System.out.println("Informe a placa do carro .");
		carro1.placa = entrada.nextLine();
		
		
		while (opcao != 6) 
		{
			System.out.println("Informe a opcao que deseja .");
			System.out.println("1 - Ligar o carro .");
			System.out.println("2 - Desligar o carro .");
			System.out.println("3 - Acelerar o carro .");
			System.out.println("4 - Frear o carro .");
			System.out.println("5 - Mostrar informações .");
			System.out.println("6 - Sair do programa .");
			opcao = entrada.nextInt();
			
			switch(opcao)
			{
			
			case 1:
				carro1.Ligar();
				break;
				
			case 2:
				carro1.Desligar();
				break;
			
			case 3:
				System.out.println("Insira o valor a ser somado .");
				valor = entrada.nextInt();
				carro1.Acelerar(valor);
				break;
				
			case 4:
				System.out.println("Insira o valor a ser subtraído .");
				valor = entrada.nextInt();
				carro1.Frear(valor);
				break;
				
			case 5:
				System.out.println(carro1);
				break;
				
			case 6:
				System.out.println("Obrigado por utilizar ! ");
				break;
				
			default:
				System.out.println("Insira uma opção válida .");
				break;
			}
		}
		entrada.close();
		
	}
	
}
