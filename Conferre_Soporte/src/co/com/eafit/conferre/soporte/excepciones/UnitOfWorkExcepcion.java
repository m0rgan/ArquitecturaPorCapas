package co.com.eafit.conferre.soporte.excepciones;

public class UnitOfWorkExcepcion extends Exception {

  public UnitOfWorkExcepcion(Exception e) {
    super(e);
  }
  
  public UnitOfWorkExcepcion(String exception) {
    super(exception);
  }
}
