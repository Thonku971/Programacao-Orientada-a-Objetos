package Lista1;

public class NoteTeste {

	String marca;
	String modelo;
	String processador;
	int memoria;
	int armazenamento;
	double tela;
	
	public void Ligar()
	{
		System.out.println("O notebook da marca : " + marca + " modelo : " + modelo + " com o processador : " + processador + " com " + memoria + " Gb de memória RAM e " + armazenamento + " Gb de memória interna e " + tela + " polegadas de tela " + " esta ligando. " );
	}
	
	public void Desligar()
	{
		System.out.println("O notebook da marca : " + marca + " modelo : " + modelo + " com o processador : " + processador + " com " + memoria + " Gb de memória RAM e " + armazenamento + " Gb de memória interna e " + tela + " polegadas de tela " + " esta desligando. " );
	}
	
	public void Processar()
	{
		System.out.println("O notebook da marca : " + marca + " modelo : " + modelo + " com o processador : " + processador + " com " + memoria + " Gb de memória RAM e " + armazenamento + " Gb de memória interna e " + tela + " polegadas de tela " + " esta processando os dados. " );
	}
	
	public void Conectar()
	{
		System.out.println("O notebook da marca : " + marca + " modelo : " + modelo + " com o processador : " + processador + " com " + memoria + " Gb de memória RAM e " + armazenamento + " Gb de memória interna e " + tela + " polegadas de tela " + " esta se conectando à internet. " );
	}

	@Override
	public String toString() {
		return "NoteTeste [marca=" + marca + ", modelo=" + modelo + ", processador=" + processador + ", memoria="
				+ memoria + ", armazenamento=" + armazenamento + ", tela=" + tela + "]";
	}
}
