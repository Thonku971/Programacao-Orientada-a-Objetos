package Lista2;

import java.util.Scanner;

public class Televisao {

	public static void main(String []args)
	{
		
		Scanner entrada = new Scanner (System.in);
		
		int opcao = 1;
		
		TelevisaoTeste tv = new TelevisaoTeste();
		
		System.out.println(" Informe a marca da TV .");
		tv.marca = entrada.nextLine();
		System.out.println(" Informe a resolução da TV (hd, full hd ...) . ");
		tv.resolucao = entrada.nextLine();
		System.out.println(" Informe quantas polegadas tem a TV .");
		tv.polegadas = entrada.nextDouble();
		tv.volume = 0;
		tv.canal = 0;
		
		entrada.nextLine();
		
		while(opcao != 0)
		{
			System.out.println(" Informe a opcao que deseja .");
			System.out.println(" 1 - Aumentar Canal");
			System.out.println(" 2 - Diminuir Canal");
			System.out.println(" 3 - Aumentar Volume");
			System.out.println(" 4 - Diminuir Volume");
			System.out.println(" 5 - Mostrar os dados da TV");
			System.out.println(" 6 - SAIR ");
			opcao = entrada.nextInt();
			
			   switch(opcao)
			   {
			   case 1:
				   tv.AumentarCanal();
				   break;
				   
			   case 2:
				   tv.DiminuirCanal();
				   break;

			   case 3:
				   tv.AumentarVolume();
				   break;
				   

			   case 4:
				   tv.DiminuirVolume();
				   break;
				   

			   case 5:
				   System.out.println(tv);
				   break;
				   

			   case 6:
				   System.out.println(" Obrigado por utilizar . ");
				   break;
				   
			   default:
				   System.out.println(" Opcao inválida");
				   break;
			   }
		}
		
		entrada.close();
		
	}
	
}
