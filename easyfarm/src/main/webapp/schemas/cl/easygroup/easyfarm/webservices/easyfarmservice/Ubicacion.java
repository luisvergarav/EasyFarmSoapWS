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
 * <p>Clase Java para ubicacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ubicacion">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cl/easygroup/easyfarm/webservices/easyfarmservice}baseEntity">
 *       &lt;sequence>
 *         &lt;element name="almacen" type="{http://cl/easygroup/easyfarm/webservices/easyfarmservice}almacen" minOccurs="0"/>
 *         &lt;element name="almacens" type="{http://cl/easygroup/easyfarm/webservices/easyfarmservice}almacen" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="calle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ciudad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comuna" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="latitud" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="longitud" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroCalle" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ubicacion_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ubicacion", propOrder = {
    "almacen",
    "almacens",
    "calle",
    "ciudad",
    "comuna",
    "latitud",
    "longitud",
    "numeroCalle",
    "region",
    "ubicacionID"
})
public class Ubicacion
    extends BaseEntity
{

    protected Almacen almacen;
    @XmlElement(nillable = true)
    protected List<Almacen> almacens;
    protected String calle;
    protected String ciudad;
    protected String comuna;
    protected String latitud;
    protected String longitud;
    protected int numeroCalle;
    protected String region;
    @XmlElement(name = "ubicacion_ID")
    protected int ubicacionID;

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
     * Obtiene el valor de la propiedad calle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Define el valor de la propiedad calle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalle(String value) {
        this.calle = value;
    }

    /**
     * Obtiene el valor de la propiedad ciudad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Define el valor de la propiedad ciudad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCiudad(String value) {
        this.ciudad = value;
    }

    /**
     * Obtiene el valor de la propiedad comuna.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComuna() {
        return comuna;
    }

    /**
     * Define el valor de la propiedad comuna.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComuna(String value) {
        this.comuna = value;
    }

    /**
     * Obtiene el valor de la propiedad latitud.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitud() {
        return latitud;
    }

    /**
     * Define el valor de la propiedad latitud.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitud(String value) {
        this.latitud = value;
    }

    /**
     * Obtiene el valor de la propiedad longitud.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongitud() {
        return longitud;
    }

    /**
     * Define el valor de la propiedad longitud.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitud(String value) {
        this.longitud = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroCalle.
     * 
     */
    public int getNumeroCalle() {
        return numeroCalle;
    }

    /**
     * Define el valor de la propiedad numeroCalle.
     * 
     */
    public void setNumeroCalle(int value) {
        this.numeroCalle = value;
    }

    /**
     * Obtiene el valor de la propiedad region.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Define el valor de la propiedad region.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Obtiene el valor de la propiedad ubicacionID.
     * 
     */
    public int getUbicacionID() {
        return ubicacionID;
    }

    /**
     * Define el valor de la propiedad ubicacionID.
     * 
     */
    public void setUbicacionID(int value) {
        this.ubicacionID = value;
    }

}
