package Clases;


import Excepciones.Excepcion;

public class Resta extends Suma {

    Resta(int op1, int op2) {
        super(op1, op2);
        // TODO Auto-generated constructor stub
    }

    @Override
    public int getResultado() throws Excepcion {

        int valor1 = super.getOperando1();
        int valor2 = super.getOperando2();
        return (valor1 - valor2);
    }
}
