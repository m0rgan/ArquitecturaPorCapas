package co.com.eafit.conferre.conferencias.data.dac;

import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;

import co.com.eafit.conferre.conferencias.data.base.DAOGenerico;
import co.com.eafit.conferre.conferencias.data.base.ObjetoTO;
import co.com.eafit.conferre.conferencias.data.to.ListaDeEsperaTO;

public class ListaDeEsperaDAO implements DAOGenerico {
	
	java.sql.Connection  conn;
	
	public ListaDeEsperaDAO(Connection conn2) {
		this.conn = conn2;
	}

	@Override
	public ObjetoTO crear(ObjetoTO parametro) {
		ListaDeEsperaTO list = null;
		try {
			list = (ListaDeEsperaTO) parametro;
			PreparedStatement prep = conn.prepareStatement("INSERT INTO lista de espera values(?,?,?)");
			prep.setString(1, list.getId_conferencia());
			prep.setString(2, list.getId_evento());
			prep.setArray(3, (Array) list.getAsistentes());
			int resultado = prep.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
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
