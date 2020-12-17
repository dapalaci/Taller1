package com.tcs;

import clases.CapacidadEndeudamiento;
import clases.Mensajes;
import javafx.scene.input.KeyCode;

import java.util.Scanner;

public class Principal {
    //Recuerda que aca empieza todo
    public static void main(String[] args) {
        //Con este objeto de la clase Scanner puedes capturar informacion por consola cada ves que lo uses
        // recuerda cerrar el flujo de consulta cada ves lo uses sobre para que los uses in.close()
        Scanner in = new Scanner(System.in);
        CapacidadEndeudamiento ce = new CapacidadEndeudamiento();
        Mensajes msg = new Mensajes();

        int ingMesuales;
        System.out.println("Ingrese sus ingresos mensuales");
        ingMesuales = in.nextInt();
        
        String gastosfijos = null;
    	String gastosvaria = "";
        String entrada = "SI";
        boolean fijosOk = false;
        boolean variablesOk = false;
        while (entrada.equals("SI")) {        	
            /*Esto te dara la primera entrada al proceso de solicitar los datos para instancir nuestro objeto
              ce.CapacidadEndedudamiento();
        	  Valida las entradas de los usuarios que no vayas a convertir una "A" numero y el calculo no te funcione
              Utiliza el metodo is numeric para vada entrada de ser necesarios */
        	if (fijosOk == false) {
        		msg.prGastoFijo();
            	gastosfijos = in.next();
        	
        		if (isNumeric(gastosfijos)) {
        			fijosOk = true;
                }
        	}else {
        	if (variablesOk == false) {
        		msg.prGastoVariable();
    			gastosvaria = in.next();
        	
        		if (isNumeric(gastosvaria)) {
        			variablesOk = true;
    			}
        	}}
        	if (fijosOk && variablesOk) {
        		entrada = "NO";
        		msg.prResultado(ingMesuales, Integer.parseInt(gastosfijos), Integer.parseInt(gastosvaria) );
        		in.close();
        		break;
        	}}
       }

    public static boolean isNumeric(String value) {
        // implementa un bloque try catch aca
    	try {
    		Double.parseDouble(value);
    		return true;
    		} catch (NumberFormatException nfe){
    		return false;
    	}
    	
        

    }
}
