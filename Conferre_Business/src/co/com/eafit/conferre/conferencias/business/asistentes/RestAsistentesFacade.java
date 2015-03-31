package co.com.eafit.conferre.conferencias.business.asistentes;

import co.com.eafit.conferre.conferencias.data.to.AsistentesTO;

@Path("/asistentes")
public class RestAsistentesFacade implements AsistentesFacade {
	
	@Override
	@Path("/")
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public AsistentesTO crearAsistentes(AsistentesTO asistentes) {
		CrearAsistentesUseCase useCase = new CrearAsistentesUseCase();
		AsistentesTO asistentesResult = null;
	    try {
	    	asistentesResult = (AsistentesTO) useCase.ejecutar(asistentes); 
	    } catch (Exception e) {
	    	throw e;
	    }
	    return asistentesResult;
	  }
}