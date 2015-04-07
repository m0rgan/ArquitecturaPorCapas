package co.com.eafit.conferre.conferencias.business.conferencias;

import java.util.List;

import co.com.eafit.conferre.conferencias.data.base.ObjetoTO;
import co.com.eafit.conferre.conferencias.data.to.ConferenciaTO;

@Path("/conferencias")
public class RestConferenciaFacade implements ConferenciasFacade {

	@Override
	@Path("/")
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	
	ConferenciaTO conferenciaResult = null;
	public ConferenciaTO crearConferencia(ConferenciaTO conferencia) {
		CrearConferenciaUseCase useCase = new CrearConferenciaUseCase();
		
		try {
			conferenciaResult = (ConferenciaTO) useCase.ejecutar(conferencia);
		} catch (Exception e) {
			throw e;
		}
		return conferenciaResult;
	}

	@Override
	public List<ObjetoTO> obtenerEspacios() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	public List<ConferenciaTO> obtenerListaDeConferencias() {
		List<ConferenciaTO> conferenciasLista = null;
		conferenciasLista.add(conferenciaResult);
		return conferenciasLista;
	}
}