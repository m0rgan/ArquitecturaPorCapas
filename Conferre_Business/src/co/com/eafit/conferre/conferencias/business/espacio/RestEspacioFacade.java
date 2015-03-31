package co.com.eafit.conferre.conferencias.business.espacio;

import java.util.List;

import co.com.eafit.conferre.conferencias.data.base.ObjetoTO;
import co.com.eafit.conferre.conferencias.data.to.EspacioTO;

@Path("/conferencias")
public class RestEspacioFacade implements EspacioFacade {
	
	@Override
	@Path("/")
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public EspacioTO crearEspacio(EspacioTO espacio) {
		CrearEspacioUseCase useCase = new CrearEspacioUseCase();
		EspacioTO espacioResult = null;
	    try {
	    	espacioResult = (EspacioTO) useCase.ejecutar(espacio);
	    } catch (Exception e) {
	    	throw e;
		}
	    return espacioResult;
	}
}