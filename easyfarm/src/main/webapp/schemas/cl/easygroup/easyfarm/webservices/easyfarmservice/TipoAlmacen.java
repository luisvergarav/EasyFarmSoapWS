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
 * <p>Clase Java para tipoAlmacen complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoAlmacen">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cl/easygroup/easyfarm/webservices/easyfarmservice}baseEntity">
 *       &lt;sequence>
 *         &lt;element name="almacens" type="{http://cl/easygroup/easyfarm/webservices/easyfarmservice}almacen" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idTipoAlmacen" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoAlmacen", propOrder = {
    "almacens",
    "descripcion",
    "idTipoAlmacen"
})
public class TipoAlmacen
    extends BaseEntity
{

    @XmlElement(nillable = true)
    protected List<Almacen> almacens;
    protected String descripcion;
    protected int idTipoAlmacen;

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
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad idTipoAlmacen.
     * 
     */
    public int getIdTipoAlmacen() {
        return idTipoAlmacen;
    }

    /**
     * Define el valor de la propiedad idTipoAlmacen.
     * 
     */
    public void setIdTipoAlmacen(int value) {
        this.idTipoAlmacen = value;
    }

}
