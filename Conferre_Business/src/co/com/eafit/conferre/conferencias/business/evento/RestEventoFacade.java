package co.com.eafit.conferre.conferencias.business.evento;

import co.com.eafit.conferre.conferencias.data.to.EventoTO;

@Path("/evento")
public class RestEventoFacade implements EventoFacade {
	
	@Override
	@Path("/")
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public EventoTO crearEvento(EventoTO evento) {
		CrearEventoUseCase useCase = new CrearEventoUseCase();
	    EventoTO eventoResult = null;
	    try {
	    	eventoResult = (EventoTO) useCase.ejecutar(evento); 
	    } catch (Exception e) {
	    	throw e;
	    }
	    return eventoResult;
	}
}