package Aula01;

public class Repeticao
{
	
	public static void main (String args[])
	{
		System.out.println("Bem vindo : Programa de potencias .");
		
		System.out.println("Informe qual laço deseja: " );

		
				System.out.println("FOR : ");
				int a = 4;
				int b = 4;
				int c = a;
				
				for(int i = 1 ; i < b; i++)
				{
					a = c * a;
				}
			    
				System.out.println("Final : " + a); 
				
				 a = 4;
				System.out.println("DO WHILE : ");
				 b = 2;
				 c = a ;
				 int i = 1;
				
				 do {
					a = c * a;
					i ++;
				}while(i < b);
				
				 System.out.println("Final : " + a);
				 
				 a = 2;
				System.out.println("WHILE : ");
				 b = 8;
				 c = a ;
				 i = 1 ;
			
				 while(i < b)
				{
					a = c * a;
					i ++;
				}
				 System.out.println("Final : " + a);
			}
					
	}