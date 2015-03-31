


import co.com.eafit.conferre.soporte.*;
import co.com.eafit.conferre.conferencias.data.*;
import co.com.eafit.conferre.conferencias.data.to.AsistentesTO;
import co.com.eafit.conferre.soporte.*;
import co.com.eafit.conferre.soporte.excepciones.ExcepcionUnitOfWork;

public interface AsistentesFacade {
	public AsistentesTO crearAsistentes(AsistentesTO asistentes) throws ExcepcionUnitOfWork;
}
