//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2016.11.15 a las 02:07:06 AM CLST 
//


package cl.easygroup.easyfarm.webservices.easyfarmservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para actualizacionPK complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="actualizacionPK">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idActualizacion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idAlmacen" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "actualizacionPK", propOrder = {
    "idActualizacion",
    "idAlmacen"
})
public class ActualizacionPK {

    protected int idActualizacion;
    protected int idAlmacen;

    /**
     * Obtiene el valor de la propiedad idActualizacion.
     * 
     */
    public int getIdActualizacion() {
        return idActualizacion;
    }

    /**
     * Define el valor de la propiedad idActualizacion.
     * 
     */
    public void setIdActualizacion(int value) {
        this.idActualizacion = value;
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

}
