package co.com.eafit.conferre.conferencias.business.espacio;

import java.util.List;

import co.com.eafit.conferre.conferencias.data.to.EspacioTO;
import co.com.eafit.conferre.soporte.ExcepcionUnitOfWork;

public class RestEspacioFacade implements EspacioFacade {
	
	 public EspacioTO crearEspacio(EspacioTO espacio) throws ExcepcionUnitOfWork {
		    CrearEspacioUseCase useCase = new CrearEspacioUseCase();
		    EspacioTO spaceResult = null;
		    try {
		      spaceResult = (EspacioTO) useCase.ejecutar(espacio); 
		    }
		    catch (Exception e) {
		     spaceResult = null;
		    }
		    return spaceResult;
		  }
		  
		  @Override
	
		  public List<EspacioTO> EncontrarEspacios() throws ExcepcionUnitOfWork {
		    EncontrarEspacioUseCase useCase = new EncontrarEspacioUseCase();
		    List<EspacioTO> result =null;
		    try {
		    
		      //falta crear algo para buscar result = a lo que retorne la lista
		    	
		    }
		    catch (Exception e) {
		      result=null;
		    }
		    return result;
		  }

		

}
