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
 * <p>Clase Java para mensaje complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="mensaje">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cl/easygroup/easyfarm/webservices/easyfarmservice}baseEntity">
 *       &lt;sequence>
 *         &lt;element name="almacen" type="{http://cl/easygroup/easyfarm/webservices/easyfarmservice}almacen" minOccurs="0"/>
 *         &lt;element name="id" type="{http://cl/easygroup/easyfarm/webservices/easyfarmservice}mensajePK" minOccurs="0"/>
 *         &lt;element name="texto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoMensaje" type="{http://cl/easygroup/easyfarm/webservices/easyfarmservice}tipoMensaje" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mensaje", propOrder = {
    "almacen",
    "id",
    "texto",
    "tipoMensaje"
})
public class Mensaje
    extends BaseEntity
{

    protected Almacen almacen;
    protected MensajePK id;
    protected String texto;
    protected TipoMensaje tipoMensaje;

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
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link MensajePK }
     *     
     */
    public MensajePK getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link MensajePK }
     *     
     */
    public void setId(MensajePK value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad texto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTexto() {
        return texto;
    }

    /**
     * Define el valor de la propiedad texto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTexto(String value) {
        this.texto = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoMensaje.
     * 
     * @return
     *     possible object is
     *     {@link TipoMensaje }
     *     
     */
    public TipoMensaje getTipoMensaje() {
        return tipoMensaje;
    }

    /**
     * Define el valor de la propiedad tipoMensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoMensaje }
     *     
     */
    public void setTipoMensaje(TipoMensaje value) {
        this.tipoMensaje = value;
    }

}
