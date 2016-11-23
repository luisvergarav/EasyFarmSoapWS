//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2016.11.14 a las 07:54:03 PM CLST 
//


package cl.easygroup.easyfarm.webservice.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para direccion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="direccion">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cl/easygroup/easyfarm/webservices/easyfarmservice}baseEntity">
 *       &lt;sequence>
 *         &lt;element name="calle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comuna" type="{http://cl/easygroup/easyfarm/webservices/easyfarmservice}comuna" minOccurs="0"/>
 *         &lt;element name="id" type="{http://cl/easygroup/easyfarm/webservices/easyfarmservice}direccionPK" minOccurs="0"/>
 *         &lt;element name="latitud" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="longitud" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="numeroCalle" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "direccion", propOrder = {
    "calle",
    "comuna",
    "id",
    "latitud",
    "longitud",
    "numeroCalle",
    "usuario"
})
public class Direccion
    extends BaseEntity
{

    protected String calle;
    protected Comuna comuna;
    protected DireccionPK id;
    protected int latitud;
    protected int longitud;
    protected int numeroCalle;
    protected Usuario usuario;

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
     * Obtiene el valor de la propiedad comuna.
     * 
     * @return
     *     possible object is
     *     {@link Comuna }
     *     
     */
    public Comuna getComuna() {
        return comuna;
    }

    /**
     * Define el valor de la propiedad comuna.
     * 
     * @param value
     *     allowed object is
     *     {@link Comuna }
     *     
     */
    public void setComuna(Comuna value) {
        this.comuna = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link DireccionPK }
     *     
     */
    public DireccionPK getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link DireccionPK }
     *     
     */
    public void setId(DireccionPK value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad latitud.
     * 
     */
    public int getLatitud() {
        return latitud;
    }

    /**
     * Define el valor de la propiedad latitud.
     * 
     */
    public void setLatitud(int value) {
        this.latitud = value;
    }

    /**
     * Obtiene el valor de la propiedad longitud.
     * 
     */
    public int getLongitud() {
        return longitud;
    }

    /**
     * Define el valor de la propiedad longitud.
     * 
     */
    public void setLongitud(int value) {
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
