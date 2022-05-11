package test;

import static org.junit.Assert.*;

import org.junit.Test;

import entities.Asiento;
import entities.Pasaje;
import entities.Pasajero;
import entities.Vuelo;

public class testVuelos {

	@Test
	public void queSePuedaCrearUnPasajero() {
		Pasajero pasajeroNuevo = new Pasajero("Martin",41914511, 500.0,true);
		final String NOMBRE_DE_PASAJERO_ESPERADO = "Martin";
		
		assertEquals(NOMBRE_DE_PASAJERO_ESPERADO,pasajeroNuevo.getNombre());
		
	}
	
	@Test
	public void queSePuedaCrearUnVuelo() {
		Vuelo vueloNuevo = new Vuelo("Africa","Oceania",1);
		final Integer NUMERO_DE_VUELO_ESPERADO = 1;
		
		assertEquals(NUMERO_DE_VUELO_ESPERADO,vueloNuevo.getNumeroDeVuelo());
	}
	
	@Test
	public void queSePuedaCrearUnAsiento() {
		Asiento asientoNuevo = new Asiento(1);
		final Integer NUMERO_DE_ASIENTO_ESPERADO = 1;
		
		assertEquals(NUMERO_DE_ASIENTO_ESPERADO,asientoNuevo.getNumeroAsiento());
	}
	
	@Test
	public void queSePuedaCrearUnPasaje() {
		Pasajero pasajeroEsperado = new Pasajero("Martin",41914511, 500.0,true);
		Vuelo vueloEsperado = new Vuelo("Africa","Oceania",1);
		Asiento asientoEsperado = new Asiento(1);
		final Double PRECIO_ESPERADO = 10.0;
		Pasaje pasajeNuevo = new Pasaje(pasajeroEsperado, vueloEsperado, asientoEsperado,PRECIO_ESPERADO);
		
		assertNotNull(pasajeNuevo);
	}
	
	@Test
	public void queSePuedaComprarUnPasaje() {
		Pasajero pasajeroEsperado = new Pasajero("Martin",41914511, 500.0,true);
		Vuelo vueloEsperado = new Vuelo("Africa","Oceania",1);
		Asiento asientoEsperado = new Asiento(1);
		final Double PRECIO_ESPERADO = 10.0;
		Pasaje pasajeNuevo = new Pasaje(pasajeroEsperado, vueloEsperado, asientoEsperado,PRECIO_ESPERADO);
		
		pasajeroEsperado.comprarPasaje(pasajeNuevo);
		
		assertNotNull(pasajeroEsperado.getPasajes());
	}
	
	@Test
	public void queNoSePuedaComprarDosPasajesParaElMismoPasajeroYVuelo() {
		Pasajero pasajeroEsperado = new Pasajero("Martin",41914511, 500.0,true);
		
		Vuelo vueloEsperado = new Vuelo("Africa","Oceania",1);
		
		Asiento asientoEsperado = new Asiento(1);
		Asiento asientoEsperado2 = new Asiento(2);
		
		final Double PRECIO_ESPERADO = 10.0;
		final Double PRECIO_ESPERADO2 = 5.0;
		Pasaje pasajeNuevo = new Pasaje(pasajeroEsperado, vueloEsperado, asientoEsperado, PRECIO_ESPERADO);
		Pasaje pasajeNuevo2 = new Pasaje(pasajeroEsperado, vueloEsperado, asientoEsperado2, PRECIO_ESPERADO2);
		
		final Integer CANTIDAD_DE_PASAJES_ESPERADO = 1;
		
		pasajeroEsperado.comprarPasaje(pasajeNuevo);
		pasajeroEsperado.comprarPasaje(pasajeNuevo2);
		
		System.out.println(pasajeroEsperado.getPasajes().toString());
		
		assertEquals(CANTIDAD_DE_PASAJES_ESPERADO,(Integer)pasajeroEsperado.getPasajes().size());
	}
	
	@Test
	public void queALosPasajerosVipSeLesApliqueUnCincoPorcientoDeDescuento() {
		Pasajero pasajeroEsperado = new Pasajero("Martin",41914511, 20.0, true);
		Pasajero pasajeroEsperado2 = new Pasajero("Brenda",39042312, 20.0, false);
		
		Vuelo vueloEsperado = new Vuelo("Africa","Oceania",1);
		
		Asiento asientoEsperado = new Asiento(1);
		
		final Double PRECIO_ESPERADO = 10.0;
		final Double PRECIO_ESPERADO2 = 10.0;
		Pasaje pasajeNuevo = new Pasaje(pasajeroEsperado, vueloEsperado, asientoEsperado, PRECIO_ESPERADO);
		Pasaje pasajeNuevo2 = new Pasaje(pasajeroEsperado2, vueloEsperado, asientoEsperado, PRECIO_ESPERADO2);
		
		final Double MONTO_RESTANTE_ESPERADO = 10.5; 
		final Double MONTO_RESTANTE_ESPERADO2 = 10.0;
		
		pasajeroEsperado.comprarPasaje(pasajeNuevo);
		pasajeroEsperado2.comprarPasaje(pasajeNuevo2);
		
		
		assertEquals(MONTO_RESTANTE_ESPERADO,(Double)pasajeroEsperado.getMonto());
		assertEquals(MONTO_RESTANTE_ESPERADO2,(Double)pasajeroEsperado2.getMonto());
		
	}
	
	/*
	@Test
	public void queSeLePuedaAsignarUnAsientoParaUnPasajeroEnUnVuelo() {
		Pasajero pasajeroEsperado = new Pasajero("Martin",41914511, 20.0, true);
		Pasajero pasajeroEsperado2 = new Pasajero("Brenda",39042312, 20.0, true);
		
		Vuelo vueloEsperado = new Vuelo("Africa","Oceania",1);
		
		Asiento asientoEsperado = new Asiento(1);
		
		final Double PRECIO_ESPERADO = 10.0;
		final Double PRECIO_ESPERADO2 = 5.0;
		Pasaje pasajeNuevo = new Pasaje(pasajeroEsperado, vueloEsperado, asientoEsperado, PRECIO_ESPERADO);
		Pasaje pasajeNuevo2 = new Pasaje(pasajeroEsperado2, vueloEsperado, asientoEsperado, PRECIO_ESPERADO2);
		
		final Double MONTO_RESTANTE_ESPERADO = 5.0; 
		
		pasajeroEsperado.comprarPasaje(pasajeNuevo);
		pasajeroEsperado.comprarPasaje(pasajeNuevo2);
		
		
		
		assertEquals(MONTO_RESTANTE_ESPERADO,(Double)pasajeroEsperado.getMonto());
	}
	*/
	
}

/*
1. Que se pueda comprar un pasaje para un pasajero en un vuelo.
2. Que no se pueda comprar 2 pasajes para el mismo pasajero y vuelo.
3. Que a los pasajeros VIP se les aplique un 5% de descuento.
4. Que se pueda asignar un asiento para un pasajero en un vuelo.
5. Que no se pueda asignar un asiento a un vuelo si el asiento está ocupado.
6. Que no se pueda asignar un asiento si el avión ya despegó.
7. Que se pueda obtener una lista de pasajeros que no volaron.
*/