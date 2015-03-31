
package co.com.eafit.conferre.conferencias.business.asistentes;

import co.com.eafit.conferre.conferencias.data.*;
import co.com.eafit.conferre.conferencias.data.to.AsistentesTO;
import co.com.eafit.conferre.soporte.*;
import co.com.eafit.conferre.soporte.excepciones.ExcepcionUnitOfWork;

public class RestAsistentesFacade implements AsistentesFacade {
	@Override
	   public AsistentesTO crearAsistentes(AsistentesTO asistentes) {
	    CrearAsistentesUseCase useCase = new CrearAsistentesUseCase();
	    AsistentesTO assistantResult = null;
	    try {
	      assistantResult = (AsistentesTO) useCase.ejecutar(asistentes); 
	    }
	    catch (Exception e) {
	      throw e;
	    }
	    return assistantResult;
	  }



}


