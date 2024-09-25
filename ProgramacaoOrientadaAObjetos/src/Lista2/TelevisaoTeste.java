package Lista2;

public class TelevisaoTeste {

	String marca;
	String resolucao;
	double polegadas;
	int canal;
	int volume;
	
	public void DiminuirCanal()
	{
		canal = canal - 1;
	}
	
	public void AumentarCanal()
	{
		canal = canal + 1;
	}
	
	public void DiminuirVolume()
	{
		volume = volume - 1;
	}
	
	public void AumentarVolume()
	{
		volume = volume + 1;
	}

	@Override
	public String toString() {
		return "TelevisaoTeste [resolucao = " + resolucao + ", marca = " + marca + ", polegadas = " + polegadas + ", canal = "
				+ canal + ", volume = " + volume + "]";
	}
}


