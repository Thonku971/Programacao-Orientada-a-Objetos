package aula09;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora1 {

	public void informarDados() {

		Scanner input = new Scanner(System.in);

		try {

			System.out.print("Informe o valor do x: ");
			Integer x = input.nextInt();

			this.calcularRaizQuadrada(x);

		} catch (InputMismatchException ime) {

			System.out.println("Valor informado é inválido.");

		} catch (ArithmeticException ae) {

			System.out.println("Não é possível dividir por zero");

		} catch (NumeroNaoNaturalException nnne) {

			System.out.println(nnne.getMessage());

		} catch (Exception e) {

			System.out.println("Ocorreu um erro desconhecido");

		} finally {

			input.close();
		}
	}

	public void somar(Integer x, Integer y) {

		Integer resultado = x + y;
		System.out.println("Resultado: " + resultado);
	}

	public void subtrair(Integer x, Integer y) {

		Integer resultado = x - y;
		System.out.println("Resultado: " + resultado);
	}

	public void multiplicar(Integer x, Integer y) {

		Integer resultado = x * y;
		System.out.println("Resultado: " + resultado);
	}

	public void dividir(Integer numerador, Integer denominador) throws ArithmeticException {

		Double resultado = (double) (numerador / denominador);
		System.out.println("Resultado: " + resultado);
	}

	public void calcularPotenciacao(Integer x, Integer y) {

		Integer resultado = (int) Math.pow(x, y);
		System.out.println("Resultado: " + resultado);
	}

	public void calcularRaizQuadrada(Integer x) throws NumeroNaoNaturalException {

		if (x < 0) {

			throw new NumeroNaoNaturalException();
		}

		Double resultado = Math.sqrt(x);
		System.out.println("Resultado: " + resultado);
	}

	public void calcularInverso(Integer x) {

		Double resultado = (double) (1 / x);
		System.out.println("Resultado: " + resultado);
	}

}