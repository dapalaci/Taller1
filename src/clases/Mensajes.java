package clases;


public class Mensajes {
	
	final static String MSG_FIJOS = "Ingrese sus gastos fijos";
	final static String MSG_VARIA = "Ingrese sus gastos variable";
	final static String MSG_CAPAC = "Su capacidad de endeudamiento es: ";
	
	CapacidadEndeudamiento ce = new CapacidadEndeudamiento();
	
	public void prGastoFijo() {
		System.out.println(MSG_FIJOS);
	}
	
	public void prGastoVariable() {
		System.out.println(MSG_VARIA);
	}
	
	public void prResultado(int ingMesuales, int gastosfijos, int gastosvaria ) {
		ce.setIngresosTotales(ingMesuales);
    	ce.setGastosFijos(gastosfijos);	
    	ce.setGastoVaribales(gastosvaria);
		double capacidad = ce.prCalcularCapacidad(ingMesuales, gastosfijos, gastosvaria);
		System.out.println(MSG_CAPAC + capacidad );
	}
}

