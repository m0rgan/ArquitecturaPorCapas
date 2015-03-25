package co.com.eafit.conferre.conferencias.data.dac;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;

import co.com.eafit.conferre.conferencias.data.base.DAOGenerico;
import co.com.eafit.conferre.conferencias.data.base.ObjetoTO;
import co.com.eafit.conferre.conferencias.data.to.ClienteTO;

public class ClienteDAO implements DAOGenerico {

	java.sql.Connection  conn;
	
	public ClienteDAO(Connection conn2) {
		this.conn = conn2;
	}
	
	@Override
	public ObjetoTO crear(ObjetoTO parametro) {
		ClienteTO clien = null;
		
		try {
			clien = (ClienteTO) parametro;
			PreparedStatement prep = conn.prepareStatement("INSERT INTO conferencias values(?,?,?)");
			prep.setString(1, clien.getNombre());
			prep.setString(2, clien.getTelefono());
			prep.setString(3, clien.getCorreo());
			
			
			int resultado = prep.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return clien;
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
