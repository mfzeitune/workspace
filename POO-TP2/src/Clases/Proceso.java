package Clases;


import Excepciones.Excepcion;
import Excepciones.OperException;

public class Proceso {

    Excepcion e;
    OperException ope;

    public void procesar(Suma s) throws Excepcion, OperException {
    	
        try{
        	int result = s.getResultado();
        	 System.out.println(result);
        }
       catch (Exception e) {
		// TODO: handle exception
	} 
        

    }
}
