package Clases;


import Excepciones.Excepcion;
import Excepciones.OperException;

public class Division extends Suma {

    Division(int op1, int op2) {
        super(op1, op2);

    }

    @Override
    public int getResultado() throws OperException, Excepcion {

        if (getOperando2() == 0) {
            //throw new OperException("Division x 0");
            throw new OperException("Division x 0");
        }
        int resultado = getOperando1() / getOperando2();
        return resultado;
    }
}
