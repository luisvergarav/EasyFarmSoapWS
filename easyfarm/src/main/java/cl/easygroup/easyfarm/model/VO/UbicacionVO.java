package cl.easygroup.easyfarm.model.VO;

import java.io.Serializable;
import java.util.List;


public class UbicacionVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	private int ubicacion_ID;

	private String calle;

	private String ciudad;

	private String comuna;

	private String latitud;

	private String longitud;

	private int numeroCalle;

	
	private String region;

	
	
	
	

	public UbicacionVO() {
	}

	public int getUbicacion_ID() {
		return this.ubicacion_ID;
	}

	public void setUbicacion_ID(int ubicacion_ID) {
		this.ubicacion_ID = ubicacion_ID;
	}

	public String getCalle() {
		return this.calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getComuna() {
		return this.comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public String getLatitud() {
		return this.latitud;
	}

	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	public String getLongitud() {
		return this.longitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}

	public int getNumeroCalle() {
		return this.numeroCalle;
	}

	public void setNumeroCalle(int numeroCalle) {
		this.numeroCalle = numeroCalle;
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}


}