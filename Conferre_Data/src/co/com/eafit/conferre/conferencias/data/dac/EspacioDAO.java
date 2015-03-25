package co.com.eafit.conferre.conferencias.data.dac;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;

import co.com.eafit.conferre.conferencias.data.base.DAOGenerico;
import co.com.eafit.conferre.conferencias.data.base.ObjetoTO;
import co.com.eafit.conferre.conferencias.data.to.EspacioTO;


public class EspacioDAO implements DAOGenerico {

java.sql.Connection  conn;
	
	public EspacioDAO(Connection conn2) {
		this.conn = conn2;
	}

	@Override
	public ObjetoTO crear(ObjetoTO parametro) {
		EspacioTO espacio = null;
		try {
			espacio = (EspacioTO) parametro;
			PreparedStatement prep = conn.prepareStatement("INSERT INTO espacios values(?,?)");
			prep.setString(1, espacio.getNombre());
			prep.setBoolean(2, espacio.getDisponible());
			int resultado = prep.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return espacio;
	}

	@Override
	public Collection<ObjetoTO> recuperar(ObjetoTO parametros) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ObjetoTO update(ObjetoTO nuevoObjeto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int borrar(ObjetoTO objetoaBorrar) {
		// TODO Auto-generated method stub
		return 0;
	}

}
