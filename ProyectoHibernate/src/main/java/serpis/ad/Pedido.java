package serpis.ad;

import java.math.*;
import java.time.LocalDateTime;
import java.util.*;

import javax.persistence.*;

@Entity
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private LocalDateTime fecha = LocalDateTime.now();
	private BigDecimal importe = BigDecimal.ZERO;
	
	@ManyToOne
	@JoinColumn(name="cliente")
	private Cliente cliente;
	
	@OneToMany (mappedBy ="pedido", cascade =CascadeType.ALL,orphanRemoval =true)
	
	private List<PedidoLinea> pedidoLineas = new ArrayList<PedidoLinea>();
	
	private Pedido() {}
	public Pedido(Cliente cliente) {
		this.cliente = cliente;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public BigDecimal getImporte() {
		return importe;
	}

	public void setImporte(BigDecimal importe) {
		this.importe = importe;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<PedidoLinea> getPedidoLineas() {
		return pedidoLineas;
	}

	public void setPedidoLineas(List<PedidoLinea> pedidoLineas) {
		this.pedidoLineas = pedidoLineas;
	}
	
	
	

}
