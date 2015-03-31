package co.com.eafit.conferre.conferencias.business.asistentes;

import java.util.UUID;

import co.com.eafit.conferre.conferencias.business.base.UnitOfWork;
import co.com.eafit.conferre.conferencias.data.base.FabricaDAO;
import co.com.eafit.conferre.conferencias.data.base.ObjetoTO;
import co.com.eafit.conferre.conferencias.data.dac.AsistentesDAO;
import co.com.eafit.conferre.conferencias.data.to.AsistentesTO;
import co.com.eafit.conferre.conferencias.data.*;
import co.com.eafit.conferre.soporte.*;
public class CrearAsistentesUseCase implements UnitOfWork {

	
	public ObjetoTO ejecutar(ObjetoTO parametros)  {
		// TODO Auto-generated method stub
		AsistentesTO asistente = (AsistentesTO) parametros;
	    
	    AsistentesDAO asistenteDAO = FabricaDAO.crearAsistentesDAO();
	    AsistentesTO resultado;
	    try {
	      resultado = (AsistentesTO) asistenteDAO.crear(asistente);
	      	    }
	    catch (Exception e) {
	     resultado=null;
	    }
	    return (ObjetoTO) resultado;

	}



}

