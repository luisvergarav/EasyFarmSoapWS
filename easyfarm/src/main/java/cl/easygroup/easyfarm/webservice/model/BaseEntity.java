//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2016.11.14 a las 07:54:03 PM CLST 
//


package cl.easygroup.easyfarm.webservice.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para baseEntity complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="baseEntity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cl/easygroup/easyfarm/webservices/easyfarmservice}entity">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baseEntity")
@XmlSeeAlso({
    Almacen.class,
    Promocion.class,
    Ubicacion.class,
    UsuarioRole.class,
    TipoAlmacen.class,
    TipoArticulo.class,
    Articulo.class,
    Actualizacion.class,
    Direccion.class,
    Ciudad.class,
    Comuna.class,
    Usuario.class,
    Mensaje.class,
    TipoMensaje.class,
    Region.class
})
public abstract class BaseEntity
    extends Entity
{


}
