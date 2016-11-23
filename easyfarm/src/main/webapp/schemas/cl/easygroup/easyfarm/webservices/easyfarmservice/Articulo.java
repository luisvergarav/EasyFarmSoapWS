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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para articulo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="articulo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cl/easygroup/easyfarm/webservices/easyfarmservice}baseEntity">
 *       &lt;sequence>
 *         &lt;element name="actualizacions" type="{http://cl/easygroup/easyfarm/webservices/easyfarmservice}actualizacion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="almacen" type="{http://cl/easygroup/easyfarm/webservices/easyfarmservice}almacen" minOccurs="0"/>
 *         &lt;element name="fechaActualizacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://cl/easygroup/easyfarm/webservices/easyfarmservice}articuloPK" minOccurs="0"/>
 *         &lt;element name="nombreArticulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="promocions" type="{http://cl/easygroup/easyfarm/webservices/easyfarmservice}promocion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tipoArticulo" type="{http://cl/easygroup/easyfarm/webservices/easyfarmservice}tipoArticulo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "articulo", propOrder = {
    "actualizacions",
    "almacen",
    "fechaActualizacion",
    "id",
    "nombreArticulo",
    "precio",
    "promocions",
    "tipoArticulo"
})
public class Articulo
    extends BaseEntity
{

    @XmlElement(nillable = true)
    protected List<Actualizacion> actualizacions;
    protected Almacen almacen;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaActualizacion;
    protected ArticuloPK id;
    protected String nombreArticulo;
    protected int precio;
    @XmlElement(nillable = true)
    protected List<Promocion> promocions;
    protected TipoArticulo tipoArticulo;

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
     * Obtiene el valor de la propiedad almacen.
     * 
     * @return
     *     possible object is
     *     {@link Almacen }
     *     
     */
    public Almacen getAlmacen() {
        return almacen;
    }

    /**
     * Define el valor de la propiedad almacen.
     * 
     * @param value
     *     allowed object is
     *     {@link Almacen }
     *     
     */
    public void setAlmacen(Almacen value) {
        this.almacen = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaActualizacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaActualizacion() {
        return fechaActualizacion;
    }

    /**
     * Define el valor de la propiedad fechaActualizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaActualizacion(XMLGregorianCalendar value) {
        this.fechaActualizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link ArticuloPK }
     *     
     */
    public ArticuloPK getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link ArticuloPK }
     *     
     */
    public void setId(ArticuloPK value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreArticulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreArticulo() {
        return nombreArticulo;
    }

    /**
     * Define el valor de la propiedad nombreArticulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreArticulo(String value) {
        this.nombreArticulo = value;
    }

    /**
     * Obtiene el valor de la propiedad precio.
     * 
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Define el valor de la propiedad precio.
     * 
     */
    public void setPrecio(int value) {
        this.precio = value;
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
     * Obtiene el valor de la propiedad tipoArticulo.
     * 
     * @return
     *     possible object is
     *     {@link TipoArticulo }
     *     
     */
    public TipoArticulo getTipoArticulo() {
        return tipoArticulo;
    }

    /**
     * Define el valor de la propiedad tipoArticulo.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoArticulo }
     *     
     */
    public void setTipoArticulo(TipoArticulo value) {
        this.tipoArticulo = value;
    }

}
