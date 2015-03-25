package co.com.eafit.conferre.conferencias.data.dac;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;

import co.com.eafit.conferre.conferencias.data.base.DAOGenerico;
import co.com.eafit.conferre.conferencias.data.base.ObjetoTO;
import co.com.eafit.conferre.conferencias.data.to.AsistentesTO;

public class AsistentesDAO implements DAOGenerico {
	
	java.sql.Connection  conn;
	
	public AsistentesDAO(Connection conn2) {
		this.conn = conn2;
	}

	@Override
	public ObjetoTO crear(ObjetoTO parametro) {
		AsistentesTO asis = null;
		try {
			asis = (AsistentesTO) parametro;
			PreparedStatement prep = conn.prepareStatement("INSERT INTO asistentes values(?,?,?,?)");
			prep.setString(1, asis.getId());
			prep.setString(2, asis.getNombre());
			prep.setString(3, asis.getTelefono());
			prep.setString(4, asis.getCorreo());
			int resultado = prep.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return asis;
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
