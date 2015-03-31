
package co.com.eafit.conferre.conferencias.business.asistentes;

import co.com.eafit.conferre.conferencias.data.*;
import co.com.eafit.conferre.conferencias.data.base.ObjetoTO;
import co.com.eafit.conferre.conferencias.data.to.AsistentesTO;
import co.com.eafit.conferre.soporte.*;

public class RestAsistentesFacade implements AsistentesFacade {
	@Override
	   public ObjetoTO crearAsistentes(ObjetoTO asistentes) {
	    CrearAsistentesUseCase useCase = new CrearAsistentesUseCase();
	     AsistentesTO assistantResult = null;
	    try {
	      assistantResult = (AsistentesTO) useCase.ejecutar(asistentes); 
	    }
	    catch (Exception e) {
	      throw e;
	    }
	    return (ObjetoTO)assistantResult;
	  }



}


