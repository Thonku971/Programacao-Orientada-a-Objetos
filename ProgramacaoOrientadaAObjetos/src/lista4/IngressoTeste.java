package lista4;

public class IngressoTeste {

	public static void main(String args[])
	{
		Ingresso ingresso1 = new Ingresso(10, "Normal");
		
		ingresso1.imprimirDadosIngresso();
		
		IngressoNormal normal1 = new IngressoNormal(10, "Normal 2");
		
		normal1.imprimirDadosIngresso();
	
		IngressoVip vip1 = new IngressoVip(10, "VIP", "Camarote Superior", 100);
		
		vip1.imprimirDadosIngresso();
		
		CamaroteSuperior superior1 = new CamaroteSuperior(10, "VIP", "Camarote Superior", 100);
		
		superior1.imprimirDadosIngresso();
		
		CamaroteInferior inferior1 = new CamaroteInferior(10, "VIP", "Camarote Inferior", 50);
		
		inferior1.imprimirDadosIngresso();
	}
	
}
