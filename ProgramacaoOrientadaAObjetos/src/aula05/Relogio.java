package aula05;

public class Relogio {

		private String marca;
		private int hora;
		private int minuto;
		
		
		public int getHora()
		{
			return hora;
		}
		
		public void setHora(int hora)
		{
			if(hora >= 0 && hora <= 23 )
			{
			   this.hora = hora;
			}
			else
			{
				System.out.println("Impossível realizar a ação .");
			}
		}
		
		public int getMinuto()
		{
			return minuto;
		}
		
		public void setMinuto(int minuto)
		{
			if(minuto >= 0 && minuto <= 59 )
			{
			   this.minuto = minuto;
			}
			else
			{
				System.out.println("Impossível realizar a ação .");
			}
			
		}
		public String getMarca()
		{
			return marca;
		}
		
		public void setMarca(String marca)
		{
			this.marca = marca;
		}
		
		@Override
		public String toString() {
			return "Relogio [marca=" + marca + ", hora=" + hora + ", minuto=" + minuto + "]";
		}
		
		
	
}
