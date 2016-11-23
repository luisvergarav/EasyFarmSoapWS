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
 * <p>Clase Java para comuna complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="comuna">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cl/easygroup/easyfarm/webservices/easyfarmservice}baseEntity">
 *       &lt;sequence>
 *         &lt;element name="ciudad" type="{http://cl/easygroup/easyfarm/webservices/easyfarmservice}ciudad" minOccurs="0"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="direccions" type="{http://cl/easygroup/easyfarm/webservices/easyfarmservice}direccion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="id" type="{http://cl/easygroup/easyfarm/webservices/easyfarmservice}comunaPK" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "comuna", propOrder = {
    "ciudad",
    "descripcion",
    "direccions",
    "id"
})
public class Comuna
    extends BaseEntity
{

    protected Ciudad ciudad;
    protected String descripcion;
    @XmlElement(nillable = true)
    protected List<Direccion> direccions;
    protected ComunaPK id;

    /**
     * Obtiene el valor de la propiedad ciudad.
     * 
     * @return
     *     possible object is
     *     {@link Ciudad }
     *     
     */
    public Ciudad getCiudad() {
        return ciudad;
    }

    /**
     * Define el valor de la propiedad ciudad.
     * 
     * @param value
     *     allowed object is
     *     {@link Ciudad }
     *     
     */
    public void setCiudad(Ciudad value) {
        this.ciudad = value;
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
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link ComunaPK }
     *     
     */
    public ComunaPK getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link ComunaPK }
     *     
     */
    public void setId(ComunaPK value) {
        this.id = value;
    }

}
