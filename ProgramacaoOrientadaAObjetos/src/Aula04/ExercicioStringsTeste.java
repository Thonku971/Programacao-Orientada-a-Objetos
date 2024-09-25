package Aula04;

import java.util.Scanner;

public class ExercicioStringsTeste {

	public static void main(String args[])
	{
		
		Scanner entrada = new Scanner(System.in);
		
		ExercicioStings nome = new ExercicioStings();
		
		int opcao1 = 1;
		int opcao2 = 1;
		String compara;
		
		while(opcao1 != 2)
		{
			System.out.println("Deseja informar uma palavra ? ");
			System.out.println("1 - Sim . ");
			System.out.println("2 - Não . ");
			opcao1 = entrada.nextInt();
			if(opcao1 == 1)
			{
                entrada.nextLine();
				System.out.println("Informe  a palavra .");
	    		nome.palavra = entrada.nextLine();
			
    			while(opcao2 != 6)
    			{
     			  System.out.println("1 - Retornar o caractere de posição 3 . ");
     			  System.out.println("2 - Retornar o número total de caracteres . ");
    			  System.out.println("3 - Imprimir a palavra toda em minúsculo . ");
    			  System.out.println("4 - Dividir a palavra em sub palavras . ");
    			  System.out.println("5 - Comparar com outra palavra . ");
    			  System.out.println("6 - sair");
    			  opcao2 = entrada.nextInt();
    			  
    			  switch(opcao2)
    			  {
         			  case 1:  
         				  nome.Retorna();
         				  break;
         				
         			  case 2:	  
         				  nome.NumTotal();
         				  break;
         				  
         			  case 3:
         				  nome.Imprimir();
         				  break;
         				  
         			  case 4:
         				  nome.Dividir();
         				  break;
         				  
         			  case 5:
         				  entrada.nextLine();
         				  compara = entrada.nextLine();
         				  nome.Comparar(compara);
         				  break;
         				  
         			  case 6:
         				  System.out.println("Finalizando o processo . ");
         				  break;
         				  
         			  default:
         				  System.out.println("Informe uma opção válida");
         				  break;
    			  
    			  }
    			  entrada.nextLine();
    			}
			}
			else
			{
				  System.out.println("Obrigado por utilizar ! ");
			}
		}
		
		
		entrada.close();
	}
	
}
