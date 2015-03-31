package co.com.eafit.conferre.conferencias.business.listaDeEspera;

import co.com.eafit.conferre.conferencias.data.base.ObjetoTO;
import co.com.eafit.conferre.conferencias.data.to.ListaDeEsperaTO;
import co.com.eafit.conferre.soporte.ExcepcionUnitOfWork;

public class RestListaDeEsperaFacade implements ListaDeEsperaFacade {

	@Override
	
	  public ObjetoTO crearListaDeEspera(ObjetoTO lista) {
	    CrearListaDeEsperaUseCase useCase = new CrearListaDeEsperaUseCase();
	    ListaDeEsperaTO listaresult = null;
	    try {
	      listaresult = (ListaDeEsperaTO) useCase.ejecutar(listaresult); 
	    }
	    catch (Exception e) {
	      throw e;
	    }
	    return listaresult;
	  }
	
	
	
}
