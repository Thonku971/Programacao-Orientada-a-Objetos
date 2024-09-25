package Aula01;

public class Bhaskara
{
	
   public static void main (String args[])
   {
	   
	   double a = 10;
	   double b = 20;
	   double c = 9;
	   double resultado;
       
	   resultado = ((-b + Math.sqrt( b *b - (4 *a *c))) / (2 * a) );
	   
	   System.out.println("Resultado : " + resultado);
	   
   }

}