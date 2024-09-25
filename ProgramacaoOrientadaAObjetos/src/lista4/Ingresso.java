package lista4;

public class Ingresso {

	protected int valor;
	protected String tipo;
	
	public Ingresso(int valor, String tipo)
	{
		this.valor = valor;
		this.tipo = tipo;
	}

	public void imprimirDadosIngresso()
	{
       System.out.println( "Ingresso [valor=" + valor + ", tipo=" + tipo + "]"); 
	}


	
	
	
}
