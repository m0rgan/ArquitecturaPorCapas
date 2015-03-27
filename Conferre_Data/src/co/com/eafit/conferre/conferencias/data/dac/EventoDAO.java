package co.com.eafit.conferre.conferencias.data.dac;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;

import co.com.eafit.conferre.conferencias.data.base.DAOGenerico;
import co.com.eafit.conferre.conferencias.data.base.ObjetoTO;
import co.com.eafit.conferre.conferencias.data.to.EventoTO;

public class EventoDAO implements DAOGenerico {
	
	java.sql.Connection  conn;
	
	public EventoDAO(Connection conn2) {
		this.conn = conn2;
	}

	@Override
	public EventoTO crear(ObjetoTO parametro) {
		EventoTO even = null;
		
		try {
			even = (EventoTO) parametro;
			PreparedStatement prep = conn.prepareStatement("INSERT INTO eventos values(?,?,?,?,?)");
			prep.setString(1, even.getUbicacion());
			prep.setString(2, even.getTipo_evento());
			prep.setString(3, even.getNumero_de_personas());
			
			Date fecha = new Date(even.getFecha().getTime());
			prep.setDate(4, fecha);
			prep.setInt(5, even.getHora());
			
			int resultado = prep.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return even;
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
