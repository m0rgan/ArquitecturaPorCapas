package co.com.eafit.conferre.conferencias.business.conferencias;

import java.util.List;

import co.com.eafit.conferre.conferencias.data.base.ObjetoTO;
import co.com.eafit.conferre.conferencias.data.to.ConferenciaTO;
import co.com.eafit.conferre.conferencias.web.model.Espacio;
import co.com.eafit.conferre.soporte.ExcepcionUnitOfWork;

public interface ConferenciasFacade {
	public ObjetoTO crearConferencia(ObjetoTO conferencia) throws ExcepcionUnitOfWork;
	public List<ObjetoTO> obtenerEspacios() throws  ExcepcionUnitOfWork;
}
