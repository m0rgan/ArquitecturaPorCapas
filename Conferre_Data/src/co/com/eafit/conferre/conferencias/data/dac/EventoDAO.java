package co.com.eafit.conferre.conferencias.data.dac;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

import co.com.eafit.conferre.conferencias.data.base.DAOGenerico;
import co.com.eafit.conferre.conferencias.data.base.ObjetoTO;
import co.com.eafit.conferre.conferencias.data.to.ConferenciaTO;
import co.com.eafit.conferre.conferencias.data.to.EventoTO;
import co.com.eafit.conferre.conferencias.data.to.EventoTO;

public class EventoDAO implements DAOGenerico {
	
	java.sql.Connection  conn;
	
	public EventoDAO(Connection conn2) {
		this.conn = conn2;
	}

	@Override
	public ObjetoTO crear(ObjetoTO parametro) {
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
		EventoTO eventparametros = (EventoTO) parametros;
		Collection<ObjetoTO> event = null;
		PreparedStatement preparedStatement = null;

		String selectSQL = "SELECT * FROM Evento WHERE Eventoid = ?";

			try {
			preparedStatement = conn.prepareStatement(selectSQL);
			preparedStatement.setString(1, eventparametros.getId());
			// execute select SQL statement
			ResultSet rs = preparedStatement.executeQuery();
				while (rs.next()) {
					EventoTO e = new EventoTO();
					e.setId(rs.getString("Eventoid"));
					e.setUbicacion(rs.getString("Ubicacion"));
					e.setTipo_evento(rs.getString("Tipo Evento"));
					e.setId_conferencia(rs.getString("Id Conferencia"));
					e.setFecha(Date.valueOf(rs.getString("Fecha")));
					e.setHora(rs.getInt("Hora"));
					e.setNumero_de_personas(rs.getString("Numero de Personas"));
					event.add(e);
				}
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			} finally {
				if (preparedStatement != null) {
					try {
						preparedStatement.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				if (conn != null) {
					try {
						conn.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}	
		return event;
	}

	@Override
	public ObjetoTO update(ObjetoTO nuevoObjeto) {
		EventoTO evento = null;
		
		try {
			evento = (EventoTO) nuevoObjeto;
			PreparedStatement prep = conn.prepareStatement("UPDATE Eventos SET Ubicacion = ?, TipoEvento = ?, Fecha = ?, Hora = ?, NumeroDePersonas = ?, IdConferencia = ? WHERE Eventoid = ?");
			prep.setString(1, evento.getUbicacion());
			prep.setString(2, evento.getTipo_evento());
			Date fecha = new Date(evento.getFecha().getTime());
			prep.setDate(3, fecha);
			prep.setInt(4, evento.getHora());
			prep.setString(5, evento.getNumero_de_personas());
			prep.setString(5, evento.getId_conferencia());
			prep.setString(5, evento.getId());
			int resultado = prep.executeUpdate();
			prep.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return evento;
	}

	@Override
	public int borrar(ObjetoTO objetoaBorrar) {
		EventoTO evento = null;
		int resultado = 0;
		
		try {
			evento = (EventoTO) objetoaBorrar;
			PreparedStatement prep = conn.prepareStatement("DELETE FROM Eventos WHERE Eventoid = ?");
			prep.setString(1, evento.getId());

			resultado = prep.executeUpdate();
			prep.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return resultado;
	}

}
