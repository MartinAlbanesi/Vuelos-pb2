package entities;

public class Pasaje {
	private Vuelo vueloAsignado;
	private Pasajero pasajeroAsignado;
	private Asiento asientoAsignado;
	private Double precio;
	private Integer idPasaje;
	private static Integer idAumento = 0;
	
	public Pasaje(Pasajero pasajeroAsignado, Vuelo vueloAsignado, Asiento asientoAsignado, Double precio) {
		this.vueloAsignado = vueloAsignado;
		this.pasajeroAsignado = pasajeroAsignado;
		this.asientoAsignado = asientoAsignado;
		this.precio = precio;
		this.idPasaje = idAumento++;
	}

	//GETTERS Y SETTERS
	
	public Vuelo getVueloAsignado() {
		return vueloAsignado;
	}

	public void setVueloAsignado(Vuelo vueloAsignado) {
		this.vueloAsignado = vueloAsignado;
	}

	public Pasajero getPasajeroAsignado() {
		return pasajeroAsignado;
	}

	public void setPasajeroAsignado(Pasajero pasajeroAsignado) {
		this.pasajeroAsignado = pasajeroAsignado;
	}

	public Asiento getAsientoAsignado() {
		return asientoAsignado;
	}

	public void setAsientoAsignado(Asiento asientoAsignado) {
		this.asientoAsignado = asientoAsignado;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getIdPasaje() {
		return idPasaje;
	}

	public void setIdPasaje(Integer idPasaje) {
		this.idPasaje = idPasaje;
	}
	
	
	
	
}
