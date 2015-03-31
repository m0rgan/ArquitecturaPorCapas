


import co.com.eafit.conferre.soporte.*;
import co.com.eafit.conferre.conferencias.data.*;
import co.com.eafit.conferre.conferencias.data.base.ObjetoTO;
import co.com.eafit.conferre.conferencias.data.to.AsistentesTO;
import co.com.eafit.conferre.soporte.*;

public interface AsistentesFacade {
	public ObjetoTO crearAsistentes(ObjetoTO asistentes) throws ExcepcionUnitOfWork;
}
