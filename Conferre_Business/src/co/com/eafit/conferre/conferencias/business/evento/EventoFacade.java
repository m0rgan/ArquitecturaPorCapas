package co.com.eafit.conferre.conferencias.business.evento;

import java.util.List;

import co.com.eafit.conferre.conferencias.data.to.EventoTO;
import co.com.eafit.conferre.soporte.ExcepcionUnitOfWork;

public interface EventoFacade {
	public EventoTO createEvent(EventoTO event) throws ExcepcionUnitOfWork;
	  public List<EventoTO> findEvents(EventoTO event) throws ExcepcionUnitOfWork;
}
