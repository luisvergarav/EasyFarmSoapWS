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
 * <p>Clase Java para usuarioRole complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="usuarioRole">
 *   &lt;complexContent>
 *     &lt;extension base="{http://cl/easygroup/easyfarm/webservices/easyfarmservice}baseEntity">
 *       &lt;sequence>
 *         &lt;element name="authority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://cl/easygroup/easyfarm/webservices/easyfarmservice}usuarioRolePK" minOccurs="0"/>
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
@XmlType(name = "usuarioRole", propOrder = {
    "authority",
    "id",
    "usuario"
})
public class UsuarioRole
    extends BaseEntity
{

    protected String authority;
    protected UsuarioRolePK id;
    protected Usuario usuario;

    /**
     * Obtiene el valor de la propiedad authority.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthority() {
        return authority;
    }

    /**
     * Define el valor de la propiedad authority.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthority(String value) {
        this.authority = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link UsuarioRolePK }
     *     
     */
    public UsuarioRolePK getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link UsuarioRolePK }
     *     
     */
    public void setId(UsuarioRolePK value) {
        this.id = value;
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
