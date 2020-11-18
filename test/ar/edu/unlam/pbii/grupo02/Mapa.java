package ar.edu.unlam.pbii.grupo02;

import java.util.HashSet;
import java.util.TreeSet;

public class Mapa {
private String ciudad;
private HashSet<Vehiculo> lista;
private Integer CantidadDeVehiculos;


public Mapa(String ciudad) {

	this.ciudad = ciudad;
	lista = new HashSet<Vehiculo>();
	this.CantidadDeVehiculos=0;
}


public Boolean agregarVehiculo(Vehiculo vehiculo1){
	Boolean agrego = false;
	if(lista.add(vehiculo1)){
		agrego= true;
		this.setCantidadDeVehiculos(lista.size());
	}
return agrego;
}






public HashSet<Vehiculo> getLista() {
	return lista;
}


public void setLista(HashSet<Vehiculo> lista) {
	this.lista = lista;
}


public String getCiudad() {
	return ciudad;
}

public void setCiudad(String ciudad) {
	this.ciudad = ciudad;
}





public boolean hayCoalicion() throws ColitionException {
	Boolean colision= false;
	for(Vehiculo e: lista){
		for(Vehiculo i: lista){
			if(e!=i && e.getLatitud().equals(i.getLatitud())&& e.getLongitud().equals(i.getLongitud()) ){
			colision=true;
			throw new ColitionException();
			}
		}
	}

	return colision;
}








public Integer getCantidadDeVehiculos() {
	return CantidadDeVehiculos;
}
public void setCantidadDeVehiculos(Integer cantidadDeVehiculos) {
	CantidadDeVehiculos = cantidadDeVehiculos;
}

	
	
}
