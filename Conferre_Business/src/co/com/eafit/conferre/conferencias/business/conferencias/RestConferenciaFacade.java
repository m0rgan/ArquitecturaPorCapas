package co.com.eafit.conferre.conferencias.business.conferencias;

import java.util.List;

import co.com.eafit.conferre.conferencias.data.base.ObjetoTO;
import co.com.eafit.conferre.conferencias.data.to.ConferenciaTO;
import co.com.eafit.conferre.conferencias.web.model.Espacio;


public class RestConferenciaFacade implements ConferenciasFacade {

	public ObjetoTO crearConferencia(ObjetoTO conferencia) {
		CrearConferenciaUseCase useCase = new CrearConferenciaUseCase();
		ConferenciaTO conferenciaResult = null;
		try {
			conferenciaResult = (ConferenciaTO) useCase.ejecutar(conferencia);
		} catch(Exception e) {
			
		}
		return conferenciaResult;
	}

	@Override
	public List<ObjetoTO> obtenerEspacios() {
		// TODO Auto-generated method stub
		return null;
	}
}
