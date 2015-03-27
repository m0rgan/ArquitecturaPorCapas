package co.com.eafit.conferre.conferencias.data.dac;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

import co.com.eafit.conferre.conferencias.data.base.DAOGenerico;
import co.com.eafit.conferre.conferencias.data.base.ObjetoTO;
import co.com.eafit.conferre.conferencias.data.to.ConferenciaTO;
import co.com.eafit.conferre.conferencias.data.to.EspacioTO;
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
		EspacioTO espparametros = (EspacioTO) parametros;
		Collection<ObjetoTO> esp = null;
		PreparedStatement preparedStatement = null;
		String selectSQL = "SELECT * FROM Espacio WHERE Espacioid = ?";
		try{
			preparedStatement = conn.prepareStatement(selectSQL);
			preparedStatement.setString(1, espparametros.getId());;
			// execute select SQL statement
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()){
				EspacioTO e = new EspacioTO();
				e.setId(rs.getString("Espacioid"));
				e.setNombre(rs.getString("Nombre"));
				e.setDisponible(rs.getBoolean("Disponible"));
				esp.add(e);
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
		return esp;
	}

	@Override
	public ObjetoTO update(ObjetoTO nuevoObjeto) {
		EspacioTO espacio = null;
		
		try {
			espacio = (EspacioTO) nuevoObjeto;
			PreparedStatement prep = conn.prepareStatement("UPDATE Espacios SET Nombre = ?, Disponible = ? WHERE Espacioid = ?");
			prep.setString(1, espacio.getNombre());
			prep.setString(2, espacio.getDisponible().toString());
			prep.setString(3, espacio.getId());
			
			int resultado = prep.executeUpdate();
			prep.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return espacio;
	}

	@Override
	public int borrar(ObjetoTO objetoaBorrar) {
		EspacioTO espacio = null;
		int resultado = 0;
		
		try {
			espacio = (EspacioTO) objetoaBorrar;
			PreparedStatement prep = conn.prepareStatement("DELETE FROM Espacios WHERE Espacioid = ?");
			prep.setString(1, espacio.getId());

			resultado = prep.executeUpdate();
			prep.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return resultado;
	}

}
