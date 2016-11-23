package cl.easygroup.easyfarm.model.VO;

import java.io.Serializable;

public class AlmacenVO implements Serializable {
	private static final long serialVersionUID = 1L;

	private int idAlmacen;

	private String activo;

	private String imagen;

	private String nombreAlmacen;

	private String tipoAlmacen;
	
	private UbicacionVO ubicacion;

	public AlmacenVO() {
	}

	public int getIdAlmacen() {
		return this.idAlmacen;
	}

	public void setIdAlmacen(int idAlmacen) {
		this.idAlmacen = idAlmacen;
	}

	public String getActivo() {
		return this.activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	public String getImagen() {
		return this.imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getNombreAlmacen() {
		return this.nombreAlmacen;
	}

	public void setNombreAlmacen(String nombreAlmacen) {
		this.nombreAlmacen = nombreAlmacen;
	}

	public String getTipoAlmacen() {
		return this.tipoAlmacen;
	}

	public void setTipoAlmacen(String tipoAlmacen) {
		this.tipoAlmacen = tipoAlmacen;
	}

	public UbicacionVO getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(UbicacionVO ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	

}