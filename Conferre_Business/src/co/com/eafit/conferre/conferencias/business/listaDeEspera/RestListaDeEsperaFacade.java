package co.com.eafit.conferre.conferencias.business.listaDeEspera;

import co.com.eafit.conferre.conferencias.data.to.ListaDeEsperaTO;

@Path("/listaDeEspera")
public class RestListaDeEsperaFacade implements ListaDeEsperaFacade {
	
	@Override
	@Path("/")
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public ListaDeEsperaTO crearListaDeEspera(ListaDeEsperaTO listaDeEspera) {
		CrearListaDeEsperaUseCase useCase = new CrearListaDeEsperaUseCase();
	    ListaDeEsperaTO listaDeEsperaresult = null;
	    try {
	    	listaDeEsperaresult = (ListaDeEsperaTO) useCase.ejecutar(listaDeEsperaresult); 
	    } catch (Exception e) {
	    	throw e;
	    }
	    return listaDeEsperaresult;
	  }
}