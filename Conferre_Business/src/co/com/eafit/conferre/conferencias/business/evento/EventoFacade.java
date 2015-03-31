package co.com.eafit.conferre.conferencias.business.evento;

import java.util.List;

import co.com.eafit.conferre.conferencias.data.base.ObjetoTO;
import co.com.eafit.conferre.conferencias.data.to.EventoTO;
import co.com.eafit.conferre.soporte.ExcepcionUnitOfWork;

public interface EventoFacade {
	public ObjetoTO crearEvento(ObjetoTO event) throws ExcepcionUnitOfWork;
	  public ObjetoTO EncontrarEvento(ObjetoTO event) throws ExcepcionUnitOfWork;
}
