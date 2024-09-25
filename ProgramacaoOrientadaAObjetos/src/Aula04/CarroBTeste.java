package Aula04;

import java.util.Scanner;

public class CarroBTeste {

	public static void main(String args[])
	{
		Scanner entrada = new Scanner(System.in); 
		
		CarroB carro1 = new CarroB("Fusca", 1975);
		CarroB carro2 = new CarroB( "I30", 2014 );
		CarroB carro3 = new CarroB("Nissan", "Azul", 2018);
		
		int opcao = 1;
		int valor;
		int car;
		
		System.out.println("Informe a marca do carro 1.");
		carro1.marca = entrada.nextLine();
		System.out.println("Informe a cor do carro 1.");
		carro1.cor = entrada.nextLine();
		System.out.println("Informe o renavam do carro 1.");
		carro1.renavam = entrada.nextLine();
		System.out.println("Informe o chassi do carro 1.");
		carro1.chassi = entrada.nextLine();
		System.out.println("Informe a placa do carro 1.");
		carro1.placa = entrada.nextLine();

		System.out.println("Prima Enter");
		entrada.nextLine();
		
		System.out.println("Informe a marca do carro 2.");
		carro2.marca = entrada.nextLine();
		System.out.println("Informe a cor do carro 2.");
		carro2.cor = entrada.nextLine();
		System.out.println("Informe o renavam do carro 2.");
		carro2.renavam = entrada.nextLine();
		System.out.println("Informe o chassi do carro 2.");
		carro2.chassi = entrada.nextLine();
		System.out.println("Informe a placa do carro 2.");
		carro2.placa = entrada.nextLine();

		System.out.println("Prima Enter");
		entrada.nextLine();
		
		System.out.println("Informe o modelo do carro 3.");
		carro3.modelo = entrada.nextLine();
		System.out.println("Informe o renavam do carro 3.");
		carro3.renavam = entrada.nextLine();
		System.out.println("Informe o chassi do carro 3.");
		carro3.chassi = entrada.nextLine();
		System.out.println("Informe a placa do carro .");
		carro3.placa = entrada.nextLine();

		
		while (opcao != 6) 
		{
			System.out.println("Informe o carro que deseja operar (1, 2 ou 3)");
		    car = entrada.nextInt();	
			System.out.println("Informe a opcao que deseja .");
			System.out.println("1 - Ligar o carro .");
			System.out.println("2 - Desligar o carro .");
			System.out.println("3 - Acelerar o carro .");
			System.out.println("4 - Frear o carro .");
			System.out.println("5 - Mostrar informações .");
			System.out.println("6 - Sair do programa .");
			opcao = entrada.nextInt();
			
			if(car == 1)
			{	
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
			else if (car == 2)
			{	
								
				switch(opcao)
		    	{
			
		    	case 1:
		    		carro2.Ligar();
			    	break;
				
			    case 2:
			    	carro2.Desligar();
				    break;
			
			    case 3:
				    System.out.println("Insira o valor a ser somado .");
				    valor = entrada.nextInt();
				    carro2.Acelerar(valor);
				    break;
				
			    case 4:
				    System.out.println("Insira o valor a ser subtraído .");
				    valor = entrada.nextInt();
				    carro2.Frear(valor);
			    	break;
				
			    case 5:
				    System.out.println(carro2);
				    break;
				
			    case 6:
				    System.out.println("Obrigado por utilizar ! ");
				    break;
				
			    default:
				    System.out.println("Insira uma opção válida .");
				    break;
			   }
			}
			
			else if (car == 3)
			{	
				
				switch(opcao)
		    	{
			
		    	case 1:
		    		carro3.Ligar();
			    	break;
				
			    case 2:
			    	carro3.Desligar();
				    break;
			
			    case 3:
				    System.out.println("Insira o valor a ser somado .");
				    valor = entrada.nextInt();
				    carro3.Acelerar(valor);
				    break;
				
			    case 4:
				    System.out.println("Insira o valor a ser subtraído .");
				    valor = entrada.nextInt();
				    carro3.Frear(valor);
			    	break;
				
			    case 5:
				    System.out.println(carro3);
				    break;
				
			    case 6:
				    System.out.println("Obrigado por utilizar ! ");
				    break;
				
			    default:
				    System.out.println("Insira uma opção válida .");
				    break;
			   }
			}
			
			else
			{
				System.out.println("Inválido ! ");
			}
		}
		entrada.close();
		
	}
	
}
