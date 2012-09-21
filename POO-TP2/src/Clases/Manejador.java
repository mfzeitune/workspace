package Clases;


import Excepciones.Excepcion;
import Excepciones.OperException;

public class Manejador {

    /**
     * a.	Suma -> 2, 4 b.	Suma �> 1, 9 c.	Resta -> 5, 7 d.	Multiplicaci�n -> 2,
     * 4 e.	Divisi�n -> 10, 5 f.	Divisi�n -> 10, 0 -excepcion
     */
    public static void main(String[] args) throws OperException, Excepcion {
        
        Suma a = new Suma(2, 4);
        Suma b = new Suma(1, 9);
        Resta c = new Resta(5, 7);
        Multiplicacion d = new Multiplicacion(2, 4);
        Division e = new Division(10, 5);
        Division f = new Division(10, 0);
        Proceso p = new Proceso();
        
        try {
        	p.procesar(a);
            p.procesar(b);
            p.procesar(c);
            p.procesar(d);
            p.procesar(f);
            p.procesar(e);
            p.procesar(e);
        } catch (Exception ex) {
            // TODO Auto-generated catch block
        }
        
        
        
        
        
    }
}
