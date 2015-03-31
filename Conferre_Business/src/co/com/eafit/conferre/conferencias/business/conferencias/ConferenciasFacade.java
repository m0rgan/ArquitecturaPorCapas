package co.com.eafit.conferre.conferencias.business.conferencias;

import java.util.List;

import co.com.eafit.conferre.conferencias.data.to.ConferenciaTO;
import co.com.eafit.conferre.conferencias.web.model.Espacio;
import co.com.eafit.conferre.soporte.ExcepcionUnitOfWork;

public interface ConferenciasFacade {
	public ConferenciaTO crearConferencia(ConferenciaTO conferencia) throws ExcepcionUnitOfWork;
	public List<Espacio> obtenerEspacios() throws  ExcepcionUnitOfWork;
}
