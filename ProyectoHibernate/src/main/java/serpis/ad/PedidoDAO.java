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

}
