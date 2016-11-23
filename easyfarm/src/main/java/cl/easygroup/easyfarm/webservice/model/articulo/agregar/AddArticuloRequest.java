//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2016.11.15 a las 02:07:06 AM CLST 
//


package cl.easygroup.easyfarm.webservice.model.articulo.agregar;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import cl.easygroup.easyfarm.webservice.model.Articulo;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idProductor" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="articulo" type="{http://cl/easygroup/easyfarm/webservices/easyfarmservice}articulo"/>
 *         &lt;element name="idTipoArticulo" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "idProductor",
    "articulo",
    "idTipoArticulo"
})
@XmlRootElement(name = "addArticuloRequest")
public class AddArticuloRequest {

    @XmlElement(required = true)
    protected BigInteger idProductor;
    @XmlElement(required = true)
    protected Articulo articulo;
    @XmlElement(required = true)
    protected BigInteger idTipoArticulo;

    /**
     * Obtiene el valor de la propiedad idProductor.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdProductor() {
        return idProductor;
    }

    /**
     * Define el valor de la propiedad idProductor.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdProductor(BigInteger value) {
        this.idProductor = value;
    }

    /**
     * Obtiene el valor de la propiedad articulo.
     * 
     * @return
     *     possible object is
     *     {@link Articulo }
     *     
     */
    public Articulo getArticulo() {
        return articulo;
    }

    /**
     * Define el valor de la propiedad articulo.
     * 
     * @param value
     *     allowed object is
     *     {@link Articulo }
     *     
     */
    public void setArticulo(Articulo value) {
        this.articulo = value;
    }

    /**
     * Obtiene el valor de la propiedad idTipoArticulo.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdTipoArticulo() {
        return idTipoArticulo;
    }

    /**
     * Define el valor de la propiedad idTipoArticulo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdTipoArticulo(BigInteger value) {
        this.idTipoArticulo = value;
    }

}
