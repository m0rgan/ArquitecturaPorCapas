package co.com.eafit.conferre.conferencias.business.evento;

import java.util.List;

import co.com.eafit.conferre.conferencias.data.to.EventoTO;
import co.com.eafit.conferre.soporte.ExcepcionUnitOfWork;

public class RestEventoFacade implements EventoFacade {
	
	@Override
	 
	  public EventoTO createEvent(EventoTO evento) throws ExcepcionUnitOfWork {
	    CrearEventoUseCase useCase = new CrearEventoUseCase();
	    EventoTO eventoResult = null;
	    try {
	      eventoResult = (EventoTO) useCase.ejecutar(evento); 
	    }
	    catch (Exception e) {
	      eventoResult= null;
	    }
	    return eventoResult;
	  }
	  
	  @Override
	 
	  public List<EventoTO> findEvents(EventoTO params) 
	      throws ExcepcionUnitOfWork {
	    if (params == null) params = new EventoTO();
	    EncontrarEventoUseCase useCase = new EncontrarEventoUseCase();
	    List<EventoTO> result;
	    result=null;
	    try {
	      //aqui hay que traer la lista de los eventos
	    }
	    catch (Exception e) {
	      result=null;
	    }
	    return result;
	  }
	  
	

}
