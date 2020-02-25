package serpis.ad;
import java.math.*;
import java.util.*;

import javax.persistence.*;

public class PedidoDAO {
	public static void InsertarPedido (EntityManager entityManager) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime el cliente: ");
		Long idcliente = teclado.nextLong();
		
		Cliente cliente = entityManager.find(Cliente.class, idcliente);
		
		Pedido pedido = new Pedido(cliente);
		PedidoLinea pedidoLinea = new PedidoLinea(pedido);
		
		System.out.println("Dime el articulo:");
		Scanner teclado2 = new Scanner(System.in);
		Long idcategoria = teclado.nextLong();
		
		Articulo articulo1 = entityManager.find(Articulo.class, idcategoria);
		pedidoLinea.setArticulo(articulo1);
		pedidoLinea.setUnidades(new BigDecimal(4));
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("serpis.ad.proyectohibernate");
		EntityManager entityManager1 = entityManagerFactory.createEntityManager();
		
		entityManager.persist(pedido);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
		
	}
	
	public static void ListarPedido (EntityManager entityManager) {
		
		List<Pedido>pedidos= entityManager.createQuery("from Pedido order by id", Pedido.class).getResultList();
		
		for (Pedido pedido : pedidos)
			System.out.printf("%d  %s  %s %n",pedido.getCliente(),pedido.getFecha(),pedido.getId(),pedido.getImporte());
	}
	public static void EliminarPedido (EntityManager entityManager) {
		
	}

}
