package cl.easygroup.easyfarm.endpoint;

import java.util.Date;
import java.util.List;

import javax.jws.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import cl.easygroup.easyfarm.model.entities.Almacen;
import cl.easygroup.easyfarm.model.entities.Articulo;
import cl.easygroup.easyfarm.model.entities.ArticuloPK;
import cl.easygroup.easyfarm.model.entities.TipoAlmacen;
import cl.easygroup.easyfarm.model.entities.Ubicacion;
import cl.easygroup.easyfarm.model.entities.Usuario;
import cl.easygroup.easyfarm.service.AlmacenServiceImpl;
import cl.easygroup.easyfarm.service.ArticuloServiceImpl;
import cl.easygroup.easyfarm.service.TipoAlmacenServiceImpl;
import cl.easygroup.easyfarm.service.TipoArticuloServiceImpl;
import cl.easygroup.easyfarm.service.UbicacionServiceImpl;
import cl.easygroup.easyfarm.service.UsuarioServiceImpl;
import cl.easygroup.easyfarm.webservice.model.articulo.agregar.AddArticuloRequest;
import cl.easygroup.easyfarm.webservice.model.articulo.agregar.AddArticuloResponse;
import cl.easygroup.easyfarm.webservice.model.productor.agregar.AddProductorRequest;
import cl.easygroup.easyfarm.webservice.model.productor.agregar.AddProductorResponse;
import cl.easygroup.easyfarm.webservice.model.usuario.actualizar.UpdateUsuarioRequest;
import cl.easygroup.easyfarm.webservice.model.usuario.actualizar.UpdateUsuarioResponse;
import cl.easygroup.easyfarm.webservice.model.usuario.agregar.AddUsuarioRequest;
import cl.easygroup.easyfarm.webservice.model.usuario.agregar.AddUsuarioResponse;

@Endpoint
public class EasyFarmServiceEndPoint {
	private static final String TARGET_NAMESPACE_AGREGARPRODUCTOR = "http://cl/easygroup/easyfarm/webservices/productor/agregar";
	private static final String TARGET_NAMESPACE_AGREGARUSUARIO = "http://cl/easygroup/easyfarm/webservices/usuario/agregar";
	private static final String TARGET_NAMESPACE_ACTUALIZARUSUARIO = "http://cl/easygroup/easyfarm/webservices/usuario/actualizar";
	private static final String TARGET_NAMESPACE_AGREGARARTICULO = "http://cl/easygroup/easyfarm/webservices/articulo/agregar";
	@Autowired
	protected UsuarioServiceImpl usuarioService;
	@Autowired
	protected TipoAlmacenServiceImpl tipoAlmacenService;
	@Autowired
	protected AlmacenServiceImpl almacenService;
	@Autowired
	protected UbicacionServiceImpl ubicacionService;
	
	@Autowired
	protected ArticuloServiceImpl articuloService;
	@Autowired
	protected TipoArticuloServiceImpl tipoArticuloService;
	

	public TipoArticuloServiceImpl getTipoArticuloService() {
		return tipoArticuloService;
	}

	public void setTipoArticuloService(TipoArticuloServiceImpl tipoArticuloService) {
		this.tipoArticuloService = tipoArticuloService;
	}

	public UsuarioServiceImpl getUsuarioService() {
		return usuarioService;
	}

	public void setUsuarioService(UsuarioServiceImpl usuarioService) {
		this.usuarioService = usuarioService;
	}

	public TipoAlmacenServiceImpl getTipoAlmacenService() {
		return tipoAlmacenService;
	}

	public void setTipoAlmacenService(TipoAlmacenServiceImpl tipoAlmacenService) {
		this.tipoAlmacenService = tipoAlmacenService;
	}

	public AlmacenServiceImpl getAlmacenService() {
		return almacenService;
	}

	public void setAlmacenService(AlmacenServiceImpl almacenService) {
		this.almacenService = almacenService;
	}

	public UbicacionServiceImpl getUbicacionService() {
		return ubicacionService;
	}

	public void setUbicacionService(UbicacionServiceImpl ubicacionService) {
		this.ubicacionService = ubicacionService;
	}
	
	public ArticuloServiceImpl getArticuloService() {
		return articuloService;
	}

	public void setArticuloService(ArticuloServiceImpl articuloService) {
		this.articuloService = articuloService;
	}

	@PayloadRoot(namespace = TARGET_NAMESPACE_AGREGARARTICULO, localPart = "addArticuloRequest")
	public  @ResponsePayload AddArticuloResponse  addArticulo(@RequestPayload AddArticuloRequest request) {

		AddArticuloResponse serviceResponse = new AddArticuloResponse();
		try {
			Articulo articulo = new Articulo();
			
			articulo.setNombreArticulo(request.getArticulo().getNombreArticulo());
			articulo.setPrecio(request.getArticulo().getPrecio());
			
			
			
			articulo.setTipoArticulo(this.tipoArticuloService.get(request.getIdTipoArticulo().intValue()));
			Almacen almacen = this.almacenService.get(request.getIdProductor().intValue());
			articulo.setAlmacen(almacen);
			
			Date fecha = new Date( request.getArticulo().getFechaActualizacion().getMillisecond());
			articulo.setFechaActualizacion(fecha);
			
			ArticuloPK articuloId = new ArticuloPK();
			articuloId.setIdAlmacen(almacen.getIdAlmacen());
			
			articulo.setId(articuloId);
			boolean respuesta = this.articuloService.add(articulo);
			
			serviceResponse.setRespuesta(respuesta);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			serviceResponse.setRespuesta(false);
			return serviceResponse;
		}
		return serviceResponse;
	}
	
	/**
	 * Registrar Usuario
	 *
	 * @param dni
	 * @return ObtenerPolizasClienteResponseVO
	 */
	@PayloadRoot(namespace = TARGET_NAMESPACE_AGREGARUSUARIO, localPart = "addUsuarioRequest")
	public  @ResponsePayload AddUsuarioResponse  addUsuario(@RequestPayload AddUsuarioRequest request) {

		AddUsuarioResponse serviceResponse = new AddUsuarioResponse();
		try {
			Usuario usuario = new Usuario();
			
			usuario.setActivo(request.getUsuario().getActivo());
			usuario.setNombre(request.getUsuario().getNombre());
			usuario.setNick(request.getUsuario().getNick());
			usuario.setPassword(request.getUsuario().getPassword());
			
			boolean respuesta = this.usuarioService.add(usuario);
			serviceResponse.setRespuesta(respuesta);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			serviceResponse.setRespuesta(false);
			return serviceResponse;
		}
		return serviceResponse;
	}

	
	@PayloadRoot(namespace = TARGET_NAMESPACE_AGREGARPRODUCTOR, localPart = "addProductorRequest")
	public @ResponsePayload AddProductorResponse addProductor(@RequestPayload AddProductorRequest request) {

		AddProductorResponse serviceResponse = new AddProductorResponse();

		try {

			Almacen almacen = new Almacen();

			almacen.setActivo(request.getProducer().getActivo());
			almacen.setImagen(request.getProducer().getImagen());
			almacen.setNombreAlmacen(request.getProducer().getNombreAlmacen());
			almacen.setTipoAlmacen(request.getProducer().getTipoAlmacen());

			Usuario usuarioTemp = this.usuarioService.get(request.getIdUsuario());

			TipoAlmacen tipoAlmacenTemp = this.tipoAlmacenService.get(request.getTipoProducer());

			almacen.setTipoAlmacenBean(tipoAlmacenTemp);
			almacen.setUsuario(usuarioTemp);

			Ubicacion ubicacion = new Ubicacion();

			// ubicacion.setCalle(request.getAlmacenVO().getUbicacion().getCalle());
			// ubicacion.setCiudad(request.getAlmacenVO().getUbicacion().getCiudad());
			// ubicacion.setComuna(request.getAlmacenVO().getUbicacion().getComuna());
			// ubicacion.setLatitud(request.getAlmacenVO().getUbicacion().getLatitud());
			// ubicacion.setLongitud(request.getAlmacenVO().getUbicacion().getLongitud());
			// ubicacion.setRegion(request.getAlmacenVO().getUbicacion().getRegion());
			// ubicacion.setNumeroCalle(request.getAlmacenVO().getUbicacion().getNumeroCalle());

			// ubicacion.setAlmacen(almacen);

			// almacen.setUbicacion(ubicacion);

			boolean respuesta = this.almacenService.add(almacen);

			serviceResponse.setRespuesta(respuesta);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			serviceResponse.setRespuesta(false);
			return serviceResponse;
		}
		return serviceResponse;
	}
	
	
	/**
	 * Registrar Usuario
	 *
	 * @param dni
	 * @return ObtenerPolizasClienteResponseVO
	 */
	@PayloadRoot(namespace = TARGET_NAMESPACE_ACTUALIZARUSUARIO, localPart = "updateUsuarioRequest")
	public  @ResponsePayload UpdateUsuarioResponse  updateUsuario(@RequestPayload UpdateUsuarioRequest request) {

		UpdateUsuarioResponse serviceResponse = new UpdateUsuarioResponse();
		try {
			Usuario usuario = new Usuario();
			
			usuario.setIdUsuario(request.getUsuario().getIdUsuario());
			usuario.setActivo(request.getUsuario().getActivo());
			usuario.setNombre(request.getUsuario().getNombre());
			usuario.setNick(request.getUsuario().getNick());
			usuario.setPassword(request.getUsuario().getPassword());
			
			this.usuarioService.update(usuario);
			serviceResponse.setRespuesta(true);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			serviceResponse.setRespuesta(false);
			return serviceResponse;
		}
		return serviceResponse;
	}

}
