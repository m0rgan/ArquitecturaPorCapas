package co.com.eafit.conferre.conferencias.data.dac;
import java.sql.Connection;
import java.util.Collection;
import co.com.eafit.conferre.conferencias.data.base.DAOGenerico;
import co.com.eafit.conferre.conferencias.data.base.ObjetoTO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;
import co.com.eafit.conferre.conferencias.data.base.DAOGenerico;
import co.com.eafit.conferre.conferencias.data.base.ObjetoTO;
import co.com.eafit.conferre.conferencias.data.to.*;

public class EspacioDAO implements DAOGenerico {

java.sql.Connection  conn;
	
	public EspacioDAO(Connection connect) {
		this.conn = connect;
	}

	@Override
	public ObjetoTO crear(ObjetoTO parametro) {
		EspacioTO espacio = null;
		
		try {
			espacio = (EspacioTO) parametro;
			PreparedStatement prep = conn.prepareStatement("INSERT INTO espacios values(?,?,?,?,?)");
			prep.setString(1, espacio.getNombre());
			prep.setString(2, espacio.getNombreConferencista());
			prep.setString(3, espacio.getTipo());
			
			Date fecha = new Date(conf.getFecha().getTime());
			prep.setDate(4, fecha);
			prep.setInt(5, conf.getSillasDisponibles());
			
			int resultado = prep.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conf;
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
