package co.com.eafit.conferre.conferencias.business.conferencias;

import java.util.List;

import co.com.eafit.conferre.conferencias.data.base.ObjetoTO;
import co.com.eafit.conferre.conferencias.data.to.ConferenciaTO;

public interface ConferenciasFacade {
	public ConferenciaTO crearConferencia(ConferenciaTO conferencia);
	public List<ObjetoTO> obtenerEspacios();
	public List<ConferenciaTO> obtenerListaDeConferencias();
}
