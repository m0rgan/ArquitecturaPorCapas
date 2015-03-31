package co.com.eafit.conferre.conferencias.business.sillas;

import co.com.eafit.conferre.conferencias.data.base.ObjetoTO;
import co.com.eafit.conferre.soporte.ExcepcionUnitOfWork;

public interface SillasFacade {
	public ObjetoTO crearSillas(ObjetoTO sillas) throws ExcepcionUnitOfWork;
}
