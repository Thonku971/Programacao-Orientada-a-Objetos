package Aula04;

public class ExercicioStings {

	String palavra;
	
	
	public void Retorna()
	{
		  System.out.println(palavra.charAt (3));
	}
	
	public void NumTotal()
	{
		  System.out.println(palavra.length());
	}
	
	public void Imprimir()
	{
		  System.out.println(palavra.toLowerCase());
	}
	
	public void Dividir()
	{
		String [] palavraDividida = palavra.split(" ");
		int i = 0;
		
		if(palavraDividida[i] != "/0")
		{
			while(palavraDividida[i] != "/0")
			{
				System.out.println(palavraDividida[i]);
				i++;
			}
			
		}
		else
		{
			System.out.println("A string chegou ao fim. ");
		}
		  System.out.println(i);
		
	}
	
	public void Comparar(String compara)
	{
		if(compara.equals(palavra))
		{
			  System.out.println("São iguais . ");
		}
		else
		{
			  System.out.println("Não são iguais . ");
		}
	}

	
}
