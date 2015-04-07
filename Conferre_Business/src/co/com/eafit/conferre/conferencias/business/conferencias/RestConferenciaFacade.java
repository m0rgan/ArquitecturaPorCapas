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
	
	List<ConferenciaTO> conferenciasLista = null;
	
	
	public ConferenciaTO crearConferencia(ConferenciaTO conferencia) {
		ConferenciaTO conferenciaResult = null;
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
		conferenciasLista.add(conferenciaResult);
		return conferenciasLista;
	}

	public List<ConferenciaTO> getConferenciasLista() {
		return conferenciasLista;
	}

	public void setConferenciasLista(ConferenciaTO conferencia) {
		this.conferenciasLista.add(conferencia);
	}
}