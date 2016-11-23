//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2016.11.14 a las 07:47:51 PM CLST 
//


package cl.easygroup.easyfarm.webservice.model.productor.agregar;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import cl.easygroup.easyfarm.webservice.model.Almacen;


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
 *         &lt;element name="idUsuario" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="producer" type="{http://cl/easygroup/easyfarm/webservices/easyfarmservice}almacen"/>
 *         &lt;element name="tipoProducer" type="{http://www.w3.org/2001/XMLSchema}integer"/>
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
    "idUsuario",
    "producer",
    "tipoProducer"
})
@XmlRootElement(name = "addProductorRequest")
public class AddProductorRequest {

    protected Integer idUsuario;
    @XmlElement(required = true)
    protected Almacen producer;
    protected Integer tipoProducer;

    /**
     * Obtiene el valor de la propiedad idUsuario.
     * 
     */
    public Integer getIdUsuario() {
        return idUsuario;
    }

    /**
     * Define el valor de la propiedad idUsuario.
     * 
     */
    public void setIdUsuario(Integer value) {
        this.idUsuario = value;
    }

    /**
     * Obtiene el valor de la propiedad producer.
     * 
     * @return
     *     possible object is
     *     {@link Almacen }
     *     
     */
    public Almacen getProducer() {
        return producer;
    }

    /**
     * Define el valor de la propiedad producer.
     * 
     * @param value
     *     allowed object is
     *     {@link Almacen }
     *     
     */
    public void setProducer(Almacen value) {
        this.producer = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoProducer.
     * 
     */
    public Integer getTipoProducer() {
        return tipoProducer;
    }

    /**
     * Define el valor de la propiedad tipoProducer.
     * 
     */
    public void setTipoProducer(Integer value) {
        this.tipoProducer = value;
    }

}
