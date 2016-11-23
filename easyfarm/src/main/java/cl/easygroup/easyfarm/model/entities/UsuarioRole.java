package cl.easygroup.easyfarm.model.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the UsuarioRoles database table.
 * 
 */
@Entity
@Table(name="UsuarioRoles")
@NamedQuery(name="UsuarioRole.findAll", query="SELECT u FROM UsuarioRole u")
public class UsuarioRole extends BaseEntity<String> implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UsuarioRolePK id;

	private String authority;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="idUsuario")
	private Usuario usuario;

	public UsuarioRole() {
	}

	public UsuarioRolePK getId() {
		return this.id;
	}

	public void setId(UsuarioRolePK id) {
		this.id = id;
	}

	public String getAuthority() {
		return this.authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}