package serpis.ad;

import java.math.BigDecimal;

import javax.persistence.*;

public class PedidoLinea {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
	@JoinColumn(name = "pedido")
	private Pedido pedido;
	
	@ManyToOne
	@JoinColumn(name = "articulo")
	
	private Articulo articulo;
	private BigDecimal precio = BigDecimal.ZERO;
	private BigDecimal unidades = BigDecimal.ZERO;
	private BigDecimal importe = BigDecimal.ZERO;
	
	private PedidoLinea() {}
	
	public PedidoLinea(Pedido pedido) {
		this.pedido = pedido;
		pedido.getPedidoLineas().add(this);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Articulo getArticulo() {
		return articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public BigDecimal getUnidades() {
		return unidades;
	}

	public void setUnidades(BigDecimal unidades) {
		this.unidades = unidades;
	}

	public BigDecimal getImporte() {
		return importe;
	}

	public void setImporte(BigDecimal importe) {
		this.importe = importe;
	}
	
	

}
