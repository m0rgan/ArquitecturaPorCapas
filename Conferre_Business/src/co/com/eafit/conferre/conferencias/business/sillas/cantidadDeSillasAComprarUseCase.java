package co.com.eafit.conferre.conferencias.business.sillas;

import co.com.eafit.conferre.conferencias.data.to.ConferenciaTO;
import co.com.eafit.conferre.conferencias.data.to.SillasTO;

public class cantidadDeSillasAComprarUseCase {
	
	public void elegirCantidadDeSilla(int numero, SillasTO silla)
	{
		SillasTO sillas = new SillasTO();
		listarSillasUseCase lsuc = new listarSillasUseCase();
		if( lsuc.sillasdisponible.contains(silla)){
			
			System.out.println("Se reservará la silla para usted");
		}else
		{
			System.out.println("la silla no esta disponible");
		}
	}
	
	public void modificarinventariosillas(int numero){
		ConferenciaTO conf = new ConferenciaTO();
		int nuevonum= conf.getSillasDisponibles()-numero;
		conf.setSillasDisponibles(nuevonum);
	}

}
