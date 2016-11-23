//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2016.11.15 a las 02:07:06 AM CLST 
//


package cl.easygroup.easyfarm.webservices.easyfarmservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para almacen complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="almacen">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cl/easygroup/easyfarm/webservices/easyfarmservice}baseEntity">
 *       &lt;sequence>
 *         &lt;element name="activo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actualizacions" type="{http://cl/easygroup/easyfarm/webservices/easyfarmservice}actualizacion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="articulos" type="{http://cl/easygroup/easyfarm/webservices/easyfarmservice}articulo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="idAlmacen" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="imagen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mensajes" type="{http://cl/easygroup/easyfarm/webservices/easyfarmservice}mensaje" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nombreAlmacen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promocions" type="{http://cl/easygroup/easyfarm/webservices/easyfarmservice}promocion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tipoAlmacen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoAlmacenBean" type="{http://cl/easygroup/easyfarm/webservices/easyfarmservice}tipoAlmacen" minOccurs="0"/>
 *         &lt;element name="ubicacion" type="{http://cl/easygroup/easyfarm/webservices/easyfarmservice}ubicacion" minOccurs="0"/>
 *         &lt;element name="ubicacions" type="{http://cl/easygroup/easyfarm/webservices/easyfarmservice}ubicacion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="usuario" type="{http://cl/easygroup/easyfarm/webservices/easyfarmservice}usuario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "almacen", propOrder = {
    "activo",
    "actualizacions",
    "articulos",
    "idAlmacen",
    "imagen",
    "mensajes",
    "nombreAlmacen",
    "promocions",
    "tipoAlmacen",
    "tipoAlmacenBean",
    "ubicacion",
    "ubicacions",
    "usuario"
})
public class Almacen
    extends BaseEntity
{

    protected String activo;
    @XmlElement(nillable = true)
    protected List<Actualizacion> actualizacions;
    @XmlElement(nillable = true)
    protected List<Articulo> articulos;
    protected int idAlmacen;
    protected String imagen;
    @XmlElement(nillable = true)
    protected List<Mensaje> mensajes;
    protected String nombreAlmacen;
    @XmlElement(nillable = true)
    protected List<Promocion> promocions;
    protected String tipoAlmacen;
    protected TipoAlmacen tipoAlmacenBean;
    protected Ubicacion ubicacion;
    @XmlElement(nillable = true)
    protected List<Ubicacion> ubicacions;
    protected Usuario usuario;

    /**
     * Obtiene el valor de la propiedad activo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivo() {
        return activo;
    }

    /**
     * Define el valor de la propiedad activo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivo(String value) {
        this.activo = value;
    }

    /**
     * Gets the value of the actualizacions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actualizacions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActualizacions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Actualizacion }
     * 
     * 
     */
    public List<Actualizacion> getActualizacions() {
        if (actualizacions == null) {
            actualizacions = new ArrayList<Actualizacion>();
        }
        return this.actualizacions;
    }

    /**
     * Gets the value of the articulos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the articulos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArticulos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Articulo }
     * 
     * 
     */
    public List<Articulo> getArticulos() {
        if (articulos == null) {
            articulos = new ArrayList<Articulo>();
        }
        return this.articulos;
    }

    /**
     * Obtiene el valor de la propiedad idAlmacen.
     * 
     */
    public int getIdAlmacen() {
        return idAlmacen;
    }

    /**
     * Define el valor de la propiedad idAlmacen.
     * 
     */
    public void setIdAlmacen(int value) {
        this.idAlmacen = value;
    }

    /**
     * Obtiene el valor de la propiedad imagen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * Define el valor de la propiedad imagen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImagen(String value) {
        this.imagen = value;
    }

    /**
     * Gets the value of the mensajes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mensajes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMensajes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Mensaje }
     * 
     * 
     */
    public List<Mensaje> getMensajes() {
        if (mensajes == null) {
            mensajes = new ArrayList<Mensaje>();
        }
        return this.mensajes;
    }

    /**
     * Obtiene el valor de la propiedad nombreAlmacen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreAlmacen() {
        return nombreAlmacen;
    }

    /**
     * Define el valor de la propiedad nombreAlmacen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreAlmacen(String value) {
        this.nombreAlmacen = value;
    }

    /**
     * Gets the value of the promocions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promocions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromocions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Promocion }
     * 
     * 
     */
    public List<Promocion> getPromocions() {
        if (promocions == null) {
            promocions = new ArrayList<Promocion>();
        }
        return this.promocions;
    }

    /**
     * Obtiene el valor de la propiedad tipoAlmacen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoAlmacen() {
        return tipoAlmacen;
    }

    /**
     * Define el valor de la propiedad tipoAlmacen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoAlmacen(String value) {
        this.tipoAlmacen = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoAlmacenBean.
     * 
     * @return
     *     possible object is
     *     {@link TipoAlmacen }
     *     
     */
    public TipoAlmacen getTipoAlmacenBean() {
        return tipoAlmacenBean;
    }

    /**
     * Define el valor de la propiedad tipoAlmacenBean.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoAlmacen }
     *     
     */
    public void setTipoAlmacenBean(TipoAlmacen value) {
        this.tipoAlmacenBean = value;
    }

    /**
     * Obtiene el valor de la propiedad ubicacion.
     * 
     * @return
     *     possible object is
     *     {@link Ubicacion }
     *     
     */
    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    /**
     * Define el valor de la propiedad ubicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Ubicacion }
     *     
     */
    public void setUbicacion(Ubicacion value) {
        this.ubicacion = value;
    }

    /**
     * Gets the value of the ubicacions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ubicacions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUbicacions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ubicacion }
     * 
     * 
     */
    public List<Ubicacion> getUbicacions() {
        if (ubicacions == null) {
            ubicacions = new ArrayList<Ubicacion>();
        }
        return this.ubicacions;
    }

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link Usuario }
     *     
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link Usuario }
     *     
     */
    public void setUsuario(Usuario value) {
        this.usuario = value;
    }

}
