package co.com.eafit.conferre.conferencias.business.sillas;

import java.util.UUID;

import co.com.eafit.conferre.conferencias.business.base.UnitOfWork;
import co.com.eafit.conferre.conferencias.data.base.FabricaDAO;
import co.com.eafit.conferre.conferencias.data.base.ObjetoTO;
import co.com.eafit.conferre.conferencias.data.dac.AsistentesDAO;
import co.com.eafit.conferre.conferencias.data.dac.SillasDAO;
import co.com.eafit.conferre.conferencias.data.to.AsistentesTO;
import co.com.eafit.conferre.conferencias.data.to.SillasTO;
import co.com.eafit.conferre.soporte.ExcepcionUnitOfWork;

public class CrearSillasUseCase implements UnitOfWork {
@Override
	public ObjetoTO ejecutar(ObjetoTO parametros)  {
		// TODO Auto-generated method stub
		SillasTO silla = (SillasTO) parametros;
	    
		SillasDAO sillasDAO = FabricaDAO.crearSillasDAO();
		SillasTO resultado;
	    try {
	      resultado = (SillasTO) sillasDAO.crear(silla);
	      	    }
	    catch (Exception e) {
	     resultado=null;
	    }
	    return (ObjetoTO) resultado;

	}
}
