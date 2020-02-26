package serpis.ad;

import java.math.BigDecimal;

import javax.persistence.*;

@Entity
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
	private double precio;
	private int unidades;
	private double importe;
	
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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}


	
	

}
