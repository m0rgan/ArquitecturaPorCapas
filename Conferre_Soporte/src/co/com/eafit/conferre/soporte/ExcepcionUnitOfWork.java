package co.com.eafit.conferre.soporte;

public class ExcepcionUnitOfWork extends Exception {

  public ExcepcionUnitOfWork(Exception e) {
    super(e);
  }
  
  public ExcepcionUnitOfWork(String exception) {
    super(exception);
  }
}
