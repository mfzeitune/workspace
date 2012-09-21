package Clases;


import Excepciones.Excepcion;

public class Suma {

    private int operando1 = 0;
    private int operando2 = 0;

    public int getOperando1() {
        return operando1;
    }

    public void setOperando1(int operando1) {
        this.operando1 = operando1;
    }

    public int getOperando2() {
        return operando2;
    }

    public void setOperando2(int operando2) {
        this.operando2 = operando2;
    }

    Suma(int op1, int op2) {
        operando1 = op1;
        operando2 = op2;
    }

    public int getResultado() throws Excepcion {

        if (operando2 < 0) {
// Prueba de Excepcion arrojandola cuando el operando 2 es menor a 0
            throw new Excepcion("Pueba \"Excepcion\"");
        }
        int resultado = getOperando1() + getOperando2();
        return resultado;
    }
}