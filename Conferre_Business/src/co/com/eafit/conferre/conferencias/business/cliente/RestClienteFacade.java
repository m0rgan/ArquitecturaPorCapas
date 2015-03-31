package co.com.eafit.conferre.conferencias.business.cliente;

import co.com.eafit.conferre.conferencias.business.asistentes.CrearAsistentesUseCase;
import co.com.eafit.conferre.conferencias.data.to.AsistentesTO;
import co.com.eafit.conferre.soporte.ExcepcionUnitOfWork;

public class RestClienteFacade implements ClienteFacade {
	
	@Override
	   public AsistentesTO crearAsistentes(AsistentesTO asistente) throws ExcepcionUnitOfWork {
	    CrearAsistentesUseCase useCase = new CrearAsistentesUseCase();
	    AsistentesTO assistantResult = null;
	    try {
	      assistantResult = (AsistentesTO) useCase.execute(asistente); 
	    }
	    catch (ExcepcionUnitOfWork e) {
	      throw e;
	    }
	    return assistantResult;
	  }

}
