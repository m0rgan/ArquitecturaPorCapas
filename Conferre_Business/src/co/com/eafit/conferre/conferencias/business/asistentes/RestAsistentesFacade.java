
package co.com.eafit.conferre.conferencias.business.asistentes;

import co.com.eafit.conferre.conferencias.data.*;
import co.com.eafit.conferre.conferencias.data.to.AsistentesTO;
import co.com.eafit.conferre.soporte.*;

public class RestAsistentesFacade implements AsistentesFacade {
	@Override
	   public AsistentesTO crearAsistentes(AsistentesTO asistentes) throws ExcepcionUnitOfWork {
	    CrearAsistentesUseCase useCase = new CrearAsistentesUseCase();
	    AsistentesTO assistantResult = null;
	    try {
	      assistantResult = (AsistentesTO) useCase.ejecutar(asistentes); 
	    }
	    catch (ExcepcionUnitOfWork e) {
	      throw e;
	    }
	    return assistantResult;
	  }



}


