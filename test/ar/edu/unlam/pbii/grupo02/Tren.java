package ar.edu.unlam.pbii.grupo02;

public class Tren  extends Vehiculo{
	private Integer CantidadDeVagones;
	private Integer CantidadDePasajerosPorVagon;
	private Integer VelocidadMaxima;

	
	
	
	
	
	public Tren(Integer cantidadDeVagones, Integer cantidadDePasajerosPorVagon, Integer velocidadMaxima, Double Latitud,
			Double Longitud) {
		super(Latitud, Longitud);
		CantidadDeVagones = cantidadDeVagones;
		CantidadDePasajerosPorVagon = cantidadDePasajerosPorVagon;
		VelocidadMaxima = velocidadMaxima;
	
	}
	public Integer getCantidadDeVagones() {
		return CantidadDeVagones;
	}
	public void setCantidadDeVagones(Integer cantidadDeVagones) {
		CantidadDeVagones = cantidadDeVagones;
	}
	public Integer getCantidadDePasajerosPorVagon() {
		return CantidadDePasajerosPorVagon;
	}
	public void setCantidadDePasajerosPorVagon(Integer cantidadDePasajerosPorVagon) {
		CantidadDePasajerosPorVagon = cantidadDePasajerosPorVagon;
	}
	public Integer getVelocidadMaxima() {
		return VelocidadMaxima;
	}
	public void setVelocidadMaxima(Integer velocidadMaxima) {
		VelocidadMaxima = velocidadMaxima;
	}

	
	
	
	
	
	
}
