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
 * <p>Clase Java para direccionPK complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="direccionPK">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idCiudad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idComuna" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idRegion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idUsuario" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "direccionPK", propOrder = {
    "idCiudad",
    "idComuna",
    "idRegion",
    "idUsuario"
})
public class DireccionPK {

    protected int idCiudad;
    protected int idComuna;
    protected int idRegion;
    protected int idUsuario;

    /**
     * Obtiene el valor de la propiedad idCiudad.
     * 
     */
    public int getIdCiudad() {
        return idCiudad;
    }

    /**
     * Define el valor de la propiedad idCiudad.
     * 
     */
    public void setIdCiudad(int value) {
        this.idCiudad = value;
    }

    /**
     * Obtiene el valor de la propiedad idComuna.
     * 
     */
    public int getIdComuna() {
        return idComuna;
    }

    /**
     * Define el valor de la propiedad idComuna.
     * 
     */
    public void setIdComuna(int value) {
        this.idComuna = value;
    }

    /**
     * Obtiene el valor de la propiedad idRegion.
     * 
     */
    public int getIdRegion() {
        return idRegion;
    }

    /**
     * Define el valor de la propiedad idRegion.
     * 
     */
    public void setIdRegion(int value) {
        this.idRegion = value;
    }

    /**
     * Obtiene el valor de la propiedad idUsuario.
     * 
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * Define el valor de la propiedad idUsuario.
     * 
     */
    public void setIdUsuario(int value) {
        this.idUsuario = value;
    }

}
