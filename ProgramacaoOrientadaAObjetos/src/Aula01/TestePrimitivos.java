package Aula01;

public class TestePrimitivos{
	
	public static void main(String args[])
	{
		
		boolean completo = true;
		char letra = 'U';
		byte valorByte = 120;
		int valorInt = 000;
		int valorIntb = 10;
		int valorIntc = 54;
		long valorLong = -124123;
		float valorFloat = 7.9f;
		double valorDouble = -97.9;
		
		System.out.println("Booleano : " + completo);
		System.out.println("Char : " + letra);
		System.out.println("Byte : " + valorByte);
		System.out.println("Int : " + valorInt);
		System.out.println("Long : " + valorLong);
		System.out.println("Float : " + valorFloat);
		System.out.println("Double : " + valorDouble);
		System.out.println("Intb : " + valorIntb);
		System.out.println("Intc : " + valorIntc);
		
		valorInt = (valorIntb + valorIntc);
		
		System.out.println("Valor Intb + Valor Intc : " + valorInt);
	}
}