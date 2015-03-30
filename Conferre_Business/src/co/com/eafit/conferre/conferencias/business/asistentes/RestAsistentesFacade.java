
package co.com.eafit.conferre.conferencias.business.asistentes;

import co.com.eafit.conferre.conferencias.data.*;
import co.com.eafit.conferre.conferencias.data.to.AsistentesTO;
import co.com.eafit.conferre.soporte.*;

public class RestAsistentesFacade implements AsistentesFacade {
	@Override
	   public AsistentesTO crearAsistentesRest(AsistentesTO assistant) throws ExcepcionUnitOfWork {
	    CreateAssistantUseCase useCase = new CreateAssistantUseCase();
	    AsistentesTO assistantResult = null;
	    try {
	      assistantResult = (AsistentesTO) useCase.execute(assistant); 
	    }
	    catch (ExcepcionUnitOfWork e) {
	      throw e;
	    }
	    return assistantResult;
	  }

	@Override
	public AsistentesTO crearAsistentes(AsistentesTO asistentes)
			throws ExcepcionUnitOfWork {
		// TODO Auto-generated method stub
		return null;
	}

}


