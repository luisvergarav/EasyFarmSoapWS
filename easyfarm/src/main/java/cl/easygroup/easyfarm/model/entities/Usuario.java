package cl.easygroup.easyfarm.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the Usuario database table.
 * 
 */
@Entity
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
@Table(name="Usuario")
public class Usuario extends BaseEntity<String> implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idUsuario;

	private int activo;

	private String nick;

	private String nombre;

	private String password;

	//bi-directional many-to-one association to Almacen
	@OneToMany(mappedBy="usuario")
	private List<Almacen> almacens;

	//bi-directional many-to-one association to Direccion
	@OneToMany(mappedBy="usuario")
	private List<Direccion> direccions;

	//bi-directional many-to-one association to UsuarioRole
	@OneToMany(mappedBy="usuario",cascade = {CascadeType.PERSIST})		 
	private List<UsuarioRole> usuarioRoles;

	public Usuario() {
	}

	public int getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getActivo() {
		return this.activo;
	}

	public void setActivo(int activo) {
		this.activo = activo;
	}

	public String getNick() {
		return this.nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Almacen> getAlmacens() {
		return this.almacens;
	}

	public void setAlmacens(List<Almacen> almacens) {
		this.almacens = almacens;
	}

	public Almacen addAlmacen(Almacen almacen) {
		getAlmacens().add(almacen);
		almacen.setUsuario(this);

		return almacen;
	}

	public Almacen removeAlmacen(Almacen almacen) {
		getAlmacens().remove(almacen);
		almacen.setUsuario(null);

		return almacen;
	}

	public List<Direccion> getDireccions() {
		return this.direccions;
	}

	public void setDireccions(List<Direccion> direccions) {
		this.direccions = direccions;
	}

	public Direccion addDireccion(Direccion direccion) {
		getDireccions().add(direccion);
		direccion.setUsuario(this);

		return direccion;
	}

	public Direccion removeDireccion(Direccion direccion) {
		getDireccions().remove(direccion);
		direccion.setUsuario(null);

		return direccion;
	}

	public List<UsuarioRole> getUsuarioRoles() {
		return this.usuarioRoles;
	}
	 
	public void setUsuarioRoles(List<UsuarioRole> usuarioRoles) {
		this.usuarioRoles = usuarioRoles;
	}

	public UsuarioRole addUsuarioRole(UsuarioRole usuarioRole) {
		getUsuarioRoles().add(usuarioRole);
		usuarioRole.setUsuario(this);

		return usuarioRole;
	}

	public UsuarioRole removeUsuarioRole(UsuarioRole usuarioRole) {
		getUsuarioRoles().remove(usuarioRole);
		usuarioRole.setUsuario(null);

		return usuarioRole;
	}

}