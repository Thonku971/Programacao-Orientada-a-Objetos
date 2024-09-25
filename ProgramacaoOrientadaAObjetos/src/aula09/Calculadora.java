package aula09;

import java.util.InputMismatchException;

public class Calculadora {

	public Calculadora()
	{
		
	}
	
	
	public void Soma(Integer a, Integer b) throws ArithmeticException, InputMismatchException, Exception {
		System.out.println("Resultado Soma :"+ (a + b) );
	}
	
	public void Subtrai(Integer a, Integer b) throws ArithmeticException, InputMismatchException, Exception {
		System.out.println("Resultado Subtração :"+ (a - b) );
	}
	
	public void Multiplica(Integer a, Integer b) throws ArithmeticException, InputMismatchException, Exception {
		System.out.println("Resultado Multiplicação :"+ (a * b) );
	}
	
	public void Divide(Integer a, Integer b) throws ArithmeticException, InputMismatchException, Exception {
		System.out.println("Resultado Divisão :"+ (a / b) );
	}
	
	public void Potencia(Integer a, Integer b) throws ArithmeticException, InputMismatchException, Exception {
		System.out.println("Resultado Potência :"+ Math.pow(a , b) );
	}
	
	public void Raiz(Integer a) throws ArithmeticException, InputMismatchException, Exception {
		System.out.println("Resultado Raiz :"+ Math.sqrt(a) );
	}
	
	public void Inverso(Integer a) throws ArithmeticException, InputMismatchException, Exception {
		System.out.println("Resultado Inverso :"+ (a * 0.1));	
	}
	
	
	
	
}