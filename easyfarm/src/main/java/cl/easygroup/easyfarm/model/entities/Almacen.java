package cl.easygroup.easyfarm.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the Almacen database table.
 * 
 */
@Entity
@NamedQuery(name="Almacen.findAll", query="SELECT a FROM Almacen a")
@Table(name="Almacen")
public class Almacen extends BaseEntity<String> implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idAlmacen;

	private String activo;

	private String imagen;

	private String nombreAlmacen;

	private String tipoAlmacen;

	//bi-directional many-to-one association to Actualizacion
	@OneToMany(mappedBy="almacen")
	private List<Actualizacion> actualizacions;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="idUsuario")
	private Usuario usuario;

	//bi-directional many-to-one association to TipoAlmacen
	@ManyToOne
	@JoinColumn(name="idTipoAlmacen")
	private TipoAlmacen tipoAlmacenBean;

	//bi-directional many-to-one association to Ubicacion
	@ManyToOne(
	cascade= CascadeType.PERSIST)
	@JoinColumn(name="Ubicacion_Ubicacion_ID")
	private Ubicacion ubicacion;

	//bi-directional many-to-one association to Articulo
	@OneToMany(mappedBy="almacen")
	private List<Articulo> articulos;

	//bi-directional many-to-one association to Mensaje
	@OneToMany(mappedBy="almacen")
	private List<Mensaje> mensajes;

	//bi-directional many-to-one association to Promocion
	@OneToMany(mappedBy="almacen")
	private List<Promocion> promocions;

	//bi-directional many-to-one association to Ubicacion
	@OneToMany(mappedBy="almacen")
	private List<Ubicacion> ubicacions;

	public Almacen() {
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

	public List<Actualizacion> getActualizacions() {
		return this.actualizacions;
	}

	public void setActualizacions(List<Actualizacion> actualizacions) {
		this.actualizacions = actualizacions;
	}

	public Actualizacion addActualizacion(Actualizacion actualizacion) {
		getActualizacions().add(actualizacion);
		actualizacion.setAlmacen(this);

		return actualizacion;
	}

	public Actualizacion removeActualizacion(Actualizacion actualizacion) {
		getActualizacions().remove(actualizacion);
		actualizacion.setAlmacen(null);

		return actualizacion;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public TipoAlmacen getTipoAlmacenBean() {
		return this.tipoAlmacenBean;
	}

	public void setTipoAlmacenBean(TipoAlmacen tipoAlmacenBean) {
		this.tipoAlmacenBean = tipoAlmacenBean;
	}

	public Ubicacion getUbicacion() {
		return this.ubicacion;
	}

	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}

	public List<Articulo> getArticulos() {
		return this.articulos;
	}

	public void setArticulos(List<Articulo> articulos) {
		this.articulos = articulos;
	}

	public Articulo addArticulo(Articulo articulo) {
		getArticulos().add(articulo);
		articulo.setAlmacen(this);

		return articulo;
	}

	public Articulo removeArticulo(Articulo articulo) {
		getArticulos().remove(articulo);
		articulo.setAlmacen(null);

		return articulo;
	}

	public List<Mensaje> getMensajes() {
		return this.mensajes;
	}

	public void setMensajes(List<Mensaje> mensajes) {
		this.mensajes = mensajes;
	}

	public Mensaje addMensaje(Mensaje mensaje) {
		getMensajes().add(mensaje);
		mensaje.setAlmacen(this);

		return mensaje;
	}

	public Mensaje removeMensaje(Mensaje mensaje) {
		getMensajes().remove(mensaje);
		mensaje.setAlmacen(null);

		return mensaje;
	}

	public List<Promocion> getPromocions() {
		return this.promocions;
	}

	public void setPromocions(List<Promocion> promocions) {
		this.promocions = promocions;
	}

	public Promocion addPromocion(Promocion promocion) {
		getPromocions().add(promocion);
		promocion.setAlmacen(this);

		return promocion;
	}

	public Promocion removePromocion(Promocion promocion) {
		getPromocions().remove(promocion);
		promocion.setAlmacen(null);

		return promocion;
	}

	public List<Ubicacion> getUbicacions() {
		return this.ubicacions;
	}

	public void setUbicacions(List<Ubicacion> ubicacions) {
		this.ubicacions = ubicacions;
	}

	public Ubicacion addUbicacion(Ubicacion ubicacion) {
		getUbicacions().add(ubicacion);
		ubicacion.setAlmacen(this);

		return ubicacion;
	}

	public Ubicacion removeUbicacion(Ubicacion ubicacion) {
		getUbicacions().remove(ubicacion);
		ubicacion.setAlmacen(null);

		return ubicacion;
	}

}