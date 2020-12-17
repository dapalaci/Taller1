package clases;

public class CapacidadEndeudamiento {
    Integer ingresosTotales;
    Integer gastosFijos;
    Integer gastoVaribales;
    double capendeuda;
    final double POR_FIJO = 0.35;

    //Metodos getter and setter para la clase
    public Integer getIngresosTotales() {
		return ingresosTotales;
	}

	public void setIngresosTotales(Integer ingresosTotales) {
		this.ingresosTotales = ingresosTotales;
	}

	public Integer getGastosFijos() {
		return gastosFijos;
	}

	public void setGastosFijos(Integer gastosFijos) {
		this.gastosFijos = gastosFijos;
	}

	public Integer getGastoVaribales() {
		return gastoVaribales;
	}

	public void setGastoVaribales(Integer gastoVaribales) {
		this.gastoVaribales = gastoVaribales;
	}
    //Construye un metodo que retorne una cadena con las propiedades de la clase

    public String getCapacidadEndeudamiento() {
        // retornar la capacidad de endeudamiento puede ser una cadena con el valor
        return String.valueOf(capendeuda);
    }

    public double prCalcularCapacidad(int ingresos, int gastos, int variables) {
    	capendeuda = ((ingresosTotales - gastosFijos - gastoVaribales)*POR_FIJO);
    	return capendeuda;
    }
	
}

