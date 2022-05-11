package entities;

import java.util.*;

public class Vuelo {
	private Integer numeroDeVuelo;
	private String origen;
	private String destino;
	private HashSet<Asiento> asientos;
	private HashSet<Pasajero> pasajeros;
	
	public Vuelo(String origen, String destino, Integer numeroDeVuelo) {
		this.origen = origen;
		this.destino = destino;
		this.numeroDeVuelo = numeroDeVuelo;
		this.asientos = new HashSet<Asiento>();
		this.pasajeros = new HashSet<Pasajero>();
	}
	
	
	//GETTERS Y SETTERS
	
	public Integer getNumeroDeVuelo() {
		return numeroDeVuelo;
	}

	public void setNumeroDeVuelo(Integer numeroDeVuelo) {
		this.numeroDeVuelo = numeroDeVuelo;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public HashSet<Asiento> getAsientos() {
		return asientos;
	}

	public void setAsientos(HashSet<Asiento> asientos) {
		this.asientos = asientos;
	}

	public HashSet<Pasajero> getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(HashSet<Pasajero> pasajeros) {
		this.pasajeros = pasajeros;
	}
	
	
}
