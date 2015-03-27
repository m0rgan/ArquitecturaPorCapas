package co.com.eafit.conferre.conferencias.business;

import java.util.List;

import co.com.eafit.conferre.conferencia.web.model.Espacio;
import co.com.eafit.conferre.conferencias.data.to.ConferenciaTO;

public interface ConferenciasFacade {
	public ConferenciaTO crearConferencia(ConferenciaTO conferencia);
	public List<Espacio> obtenerEspacios();
}
