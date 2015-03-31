package co.com.eafit.conferre.conferencias.data.dac;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

import co.com.eafit.conferre.conferencias.data.base.DAOGenerico;
import co.com.eafit.conferre.conferencias.data.base.ObjetoTO;
import co.com.eafit.conferre.conferencias.data.to.CLientesTO;
import co.com.eafit.conferre.conferencias.data.to.CLientesTO;
import co.com.eafit.conferre.conferencias.data.to.CLientesTO;
import co.com.eafit.conferre.conferencias.data.to.ConferenciaTO;
import co.com.eafit.conferre.conferencias.data.to.EspacioTO;

public class AsistentesDAO implements DAOGenerico {
	
	java.sql.Connection  conn;
	
	public AsistentesDAO(Connection conn2) {
		this.conn = conn2;
	}

	@Override
	public ObjetoTO crear(ObjetoTO parametro) {
		CLientesTO asis = null;
		try {
			asis = (CLientesTO) parametro;
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
		CLientesTO confparametros = (CLientesTO) parametros;
		Collection<ObjetoTO> asis = null;
		PreparedStatement preparedStatement = null;

		String selectSQL = "SELECT * FROM Asistentes WHERE Asistenteid = ?";

			try {
			preparedStatement = conn.prepareStatement(selectSQL);
			preparedStatement.setString(1, confparametros.getId());
			// execute select SQL statement
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				CLientesTO c = new CLientesTO();
				c.setId(rs.getString("Asistenteid"));
				c.setNombre(rs.getString("Nombre"));
				c.setTelefono(rs.getString("Telefono"));
				c.setCorreo(rs.getString("Correo"));
				asis.add(c);
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
		return asis;
	}

	@Override
	public ObjetoTO update(ObjetoTO nuevoObjeto) {
		CLientesTO asis = null;
		
		try {
			asis = (CLientesTO) nuevoObjeto;
			PreparedStatement prep = conn.prepareStatement("UPDATE Asistentes SET Nombre = ?, Telefono = ?, Correo = ? WHERE  Asistenteid = ?");
			prep.setString(1, asis.getNombre());
			prep.setString(2, asis.getTelefono());
			prep.setString(3, asis.getCorreo());
			prep.setString(4, asis.getId());
			
			int resultado = prep.executeUpdate();
			prep.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return asis;
	}

	@Override
	public int borrar(ObjetoTO objetoaBorrar) {
		CLientesTO asis = null;
		int resultado = 0;
		
		try {
			asis = (CLientesTO) objetoaBorrar;
			PreparedStatement prep = conn.prepareStatement("DELETE FROM Asistentes WHERE Asistenteid = ?");
			prep.setString(1, asis.getId());

			resultado = prep.executeUpdate();
			prep.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return resultado;
	}

}
