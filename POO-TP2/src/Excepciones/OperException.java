package Excepciones;

public class OperException extends Excepcion {

    private static final long serialVersionUID = 1L;

    public OperException(String msg) {
        super(msg);
        //System.out.println(msg);
    }
}
