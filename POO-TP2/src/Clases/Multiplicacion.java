package Clases;


public class Multiplicacion extends Suma {

//	private OperException operException;
    public Multiplicacion(int op1, int op2) {
        super(op1, op2);
    }

    @Override
    public int getResultado() {

        return (getOperando1() * getOperando2());
    }
}
