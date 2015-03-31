package co.com.eafit.conferre.conferencias.business.sillas;

import co.com.eafit.conferre.conferencias.business.asistentes.CrearAsistentesUseCase;
import co.com.eafit.conferre.conferencias.data.base.ObjetoTO;
import co.com.eafit.conferre.conferencias.data.to.AsistentesTO;
import co.com.eafit.conferre.conferencias.data.to.SillasTO;

public class RestSillasFacade implements SillasFacade {
	@Override
	   public ObjetoTO crearSillas(ObjetoTO sillas) {
	    CrearSillasUseCase useCase = new CrearSillasUseCase();
	     SillasTO sillasResult = null;
	    try {
	    	sillasResult = (SillasTO) useCase.ejecutar(sillas); 
	    }
	    catch (Exception e) {
	      throw e;
	    }
	    return (ObjetoTO)sillasResult;
	  }
}
