package co.com.eafit.conferre.conferencias.business.sillas;

import co.com.eafit.conferre.conferencias.data.to.SillasTO;

@Path("/sillas")
public class RestSillasFacade implements SillasFacade {
	
	@Override
	@Path("/")
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public SillasTO crearSillas(SillasTO sillas) {
		CrearSillasUseCase useCase = new CrearSillasUseCase();
		SillasTO sillasResult = null;
	    try {
	    	sillasResult = (SillasTO) useCase.ejecutar(sillas); 
	    } catch (Exception e) {
	    	throw e;
	    }
	    return sillasResult;
	  }
}