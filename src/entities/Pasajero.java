package entities;

import java.util.*;

public class Pasajero {
	private String nombre;
	private Integer dni;
	private Double monto;
	private Boolean esVip;
	private HashSet<Pasaje> pasajes;
	
	public Pasajero(String nombre, Integer dni, Double monto, Boolean esVip) {
		this.nombre = nombre;
		this.dni = dni;
		this.monto = monto;
		this.esVip = esVip;
		this.pasajes = new HashSet<Pasaje>();
	}

	public Boolean comprarPasaje(Pasaje pasajeNuevo) {
		Boolean exito = false;
		for(Pasaje pasajeActual : pasajes) {
			if(pasajeActual.getPasajeroAsignado().equals(pasajeNuevo.getPasajeroAsignado()) && pasajeActual.getVueloAsignado().equals(pasajeNuevo.getVueloAsignado())) {
				return exito;
			}
		}
		
		if(esVip) {
			realizarDescuento(pasajeNuevo);
			pasajes.add(pasajeNuevo);
		}
		else {
			this.monto -= pasajeNuevo.getPrecio();
			pasajes.add(pasajeNuevo);
		}
		return exito = true;
	}
	
	public void realizarDescuento(Pasaje pasaje) {
		Double resultado = pasaje.getPrecio() * 0.95;
		this.monto -= resultado;
	}
	
	//GETTERS Y SETTERS

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}

	public Boolean getEsVip() {
		return esVip;
	}

	public void setEsVip(Boolean esVip) {
		this.esVip = esVip;
	}

	public HashSet<Pasaje> getPasajes() {
		return pasajes;
	}

	public void setPasajes(HashSet<Pasaje> pasajes) {
		this.pasajes = pasajes;
	}
	
}
