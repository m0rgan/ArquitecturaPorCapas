package co.com.eafit.conferre.conferencias.business.espacio;


import java.util.List;

import co.com.eafit.conferre.conferencias.data.base.ObjetoTO;
import co.com.eafit.conferre.conferencias.data.to.EspacioTO;
import co.com.eafit.conferre.soporte.ExcepcionUnitOfWork;

public interface EspacioFacade {
	public ObjetoTO crearEspacio(ObjetoTO space) throws ExcepcionUnitOfWork;
	  public ObjetoTO EncontrarEspacios() throws ExcepcionUnitOfWork;
}
