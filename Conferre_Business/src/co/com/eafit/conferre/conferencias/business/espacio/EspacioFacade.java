package co.com.eafit.conferre.conferencias.business.espacio;


import java.util.List;

import co.com.eafit.conferre.conferencias.data.to.EspacioTO;
import co.com.eafit.conferre.soporte.ExcepcionUnitOfWork;

public interface EspacioFacade {
	public EspacioTO crearEspacio(EspacioTO space) throws ExcepcionUnitOfWork;
	  public List<EspacioTO> EncontrarEspacios() throws ExcepcionUnitOfWork;
}
