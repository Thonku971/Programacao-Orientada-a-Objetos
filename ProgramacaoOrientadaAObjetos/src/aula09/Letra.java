package aula09;

import java.util.InputMismatchException;

public class Letra {

	public Letra()
	{
		
	}
	
	
	public void Compara(String a, String b) throws InputMismatchException, Exception {
		System.out.println("São iguais?"+ a.equals(b) );
	}
	
	public void Conta(String a) throws InputMismatchException, Exception {
		System.out.println("String :"+ a + " Número de caracteres : " + a.length() );
	}
	
	public void ConverteMin(String a) throws InputMismatchException, Exception {
		System.out.println("Letras minúsculas  :"+ a.toLowerCase());
	}
	
	public void ConverteMai(String a) throws InputMismatchException, Exception {
		System.out.println("Letras minúsculas  :"+ a.toUpperCase());
	}
	
	
	
}
