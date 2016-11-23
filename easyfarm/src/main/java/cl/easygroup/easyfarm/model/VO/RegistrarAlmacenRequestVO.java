package cl.easygroup.easyfarm.model.VO;

public class RegistrarAlmacenRequestVO {
	private Integer usuario;
	private AlmacenVO almacenVO;
	private Integer tipoAlmacenBean;

	public Integer getUsuario() {
		return usuario;
	}

	public void setUsuario(Integer usuario) {
		this.usuario = usuario;
	}

	public AlmacenVO getAlmacenVO() {
		return almacenVO;
	}

	public void setAlmacenVO(AlmacenVO almacenVO) {
		this.almacenVO = almacenVO;
	}

	public Integer getTipoAlmacenBean() {
		return tipoAlmacenBean;
	}

	public void setTipoAlmacenBean(Integer tipoAlmacenBean) {
		this.tipoAlmacenBean = tipoAlmacenBean;
	}

}
