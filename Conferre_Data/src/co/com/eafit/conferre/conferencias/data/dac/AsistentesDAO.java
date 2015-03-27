package co.com.eafit.conferre.conferencias.data.dac;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
		AsistentesTO asisparametros = (AsistentesTO) parametros;
		Collection<ObjetoTO> asis = null;
		PreparedStatement preparedStatement = null;
		String selectSQL = "SELECT * FROM Asistentes WHERE Asistentesid = ?";
		try{
			preparedStatement = conn.prepareStatement(selectSQL);
			preparedStatement.setString(1, asisparametros.getId());;
			// execute select SQL statement
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				AsistentesTO a = new AsistentesTO();
				a.setId(rs.getString("Asistentesid"));
				a.setNombre(rs.getString("Nombre"));
				a.setTelefono(rs.getString("Telefono"));
				a.setCorreo(rs.getString("Correo"));
				asis.add(a);
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int borrar(ObjetoTO objetoaBorrar) {
		// TODO Auto-generated method stub
		return 0;
	}

}
