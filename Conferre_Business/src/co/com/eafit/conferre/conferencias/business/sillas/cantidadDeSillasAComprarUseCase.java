package co.com.eafit.conferre.conferencias.business.sillas;

import co.com.eafit.conferre.conferencias.data.to.ConferenciaTO;

public class cantidadDeSillasAComprarUseCase {
	
	public void elegirCantidadDeSilla(int numero)
	{
		ConferenciaTO conf = new ConferenciaTO();
		conf.setSillasDisponibles(-numero);
	}

}
