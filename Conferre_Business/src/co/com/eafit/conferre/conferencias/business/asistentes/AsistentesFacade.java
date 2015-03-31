



package co.com.eafit.conferre.conferencias.business.asistentes;
import co.com.eafit.conferre.conferencias.data.*;
import co.com.eafit.conferre.conferencias.data.to.CLientesTO;
import co.com.eafit.conferre.soporte.*;

public interface AsistentesFacade {
	public CLientesTO crearAsistentes(CLientesTO asistentes) throws ExcepcionUnitOfWork;
}
