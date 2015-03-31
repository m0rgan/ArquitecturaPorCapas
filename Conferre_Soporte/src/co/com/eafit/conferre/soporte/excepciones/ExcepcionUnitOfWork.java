package co.com.eafit.conferre.soporte.excepciones;

public class ExcepcionUnitOfWork extends Exception {

  public ExcepcionUnitOfWork(Exception e) {
    super(e);
  }
  
  public ExcepcionUnitOfWork(String exception) {
    super(exception);
  }
}
