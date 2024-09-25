package lista3;

public class Calculadora {

	String marca;
	String modelo;
	String memoria;
	int valorA;
	int valorB;
	float valorAA;
	float valorBB;
	int resultado;
	float resultadoB;
	
	public Calculadora(String marca, String modelo, String memoria)
	{
		this.marca = marca;
		this.modelo = modelo;
		this.memoria = memoria;
	}
	
	public int Soma(int valorA, int valorB)
	{
		this.valorA = valorA;
		this.valorB = valorB;
		resultado = valorA + valorB;
		return resultado;
	}

	public int Subtracao(int valorA, int valorB)
	{
		this.valorA = valorA;
		this.valorB = valorB;
		resultado = valorA - valorB;
		return resultado;
	}
	
	public int Multiplicacao(int valorA, int valorB)
	{
		this.valorA = valorA;
		this.valorB = valorB;
		resultado = valorA * valorB;
		return resultado;
	}
	
	public float Divisao(float valorAA, float valorBB)
	{
		this.valorAA = valorAA;
		this.valorBB = valorBB;
		resultadoB = valorAA / valorBB;
		return resultadoB;
	}

	@Override
	public String toString() {
		return "Calculadora [marca = " + marca + ", modelo = " + modelo + ", memoria =  " + memoria + "GBs" + "]";
	}
	
}
