//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2016.11.14 a las 07:54:03 PM CLST 
//


package cl.easygroup.easyfarm.webservice.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para usuario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="usuario">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cl/easygroup/easyfarm/webservices/easyfarmservice}baseEntity">
 *       &lt;sequence>
 *         &lt;element name="activo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="almacens" type="{http://cl/easygroup/easyfarm/webservices/easyfarmservice}almacen" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="direccions" type="{http://cl/easygroup/easyfarm/webservices/easyfarmservice}direccion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="idUsuario" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nick" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usuarioRoles" type="{http://cl/easygroup/easyfarm/webservices/easyfarmservice}usuarioRole" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usuario", propOrder = {
    "activo",
    "almacens",
    "direccions",
    "idUsuario",
    "nick",
    "nombre",
    "password",
    "usuarioRoles"
})
public class Usuario
    extends BaseEntity
{

    protected int activo;
    @XmlElement(nillable = true)
    protected List<Almacen> almacens;
    @XmlElement(nillable = true)
    protected List<Direccion> direccions;
    protected int idUsuario;
    protected String nick;
    protected String nombre;
    protected String password;
    @XmlElement(nillable = true)
    protected List<UsuarioRole> usuarioRoles;

    /**
     * Obtiene el valor de la propiedad activo.
     * 
     */
    public int getActivo() {
        return activo;
    }

    /**
     * Define el valor de la propiedad activo.
     * 
     */
    public void setActivo(int value) {
        this.activo = value;
    }

    /**
     * Gets the value of the almacens property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the almacens property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlmacens().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Almacen }
     * 
     * 
     */
    public List<Almacen> getAlmacens() {
        if (almacens == null) {
            almacens = new ArrayList<Almacen>();
        }
        return this.almacens;
    }

    /**
     * Gets the value of the direccions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the direccions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDireccions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Direccion }
     * 
     * 
     */
    public List<Direccion> getDireccions() {
        if (direccions == null) {
            direccions = new ArrayList<Direccion>();
        }
        return this.direccions;
    }

    /**
     * Obtiene el valor de la propiedad idUsuario.
     * 
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * Define el valor de la propiedad idUsuario.
     * 
     */
    public void setIdUsuario(int value) {
        this.idUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad nick.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNick() {
        return nick;
    }

    /**
     * Define el valor de la propiedad nick.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNick(String value) {
        this.nick = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad password.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Define el valor de la propiedad password.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the usuarioRoles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the usuarioRoles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUsuarioRoles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UsuarioRole }
     * 
     * 
     */
    public List<UsuarioRole> getUsuarioRoles() {
        if (usuarioRoles == null) {
            usuarioRoles = new ArrayList<UsuarioRole>();
        }
        return this.usuarioRoles;
    }

}
