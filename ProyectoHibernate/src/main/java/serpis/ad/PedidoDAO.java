package serpis.ad;
import java.math.*;
import java.util.*;

import javax.persistence.*;

public class PedidoDAO {
	public static void InsertarPedido (EntityManager entityManager) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("inserta el cliente: ");
		Long idcliente = teclado.nextLong();
		
		Cliente cliente = entityManager.find(Cliente.class, idcliente);
		
		Pedido pedido = new Pedido(cliente);
		PedidoLinea pedidoLinea = new PedidoLinea(pedido);
		
		System.out.println("inserta el articulo:");
		Scanner teclado2 = new Scanner(System.in);
		int idcategoria = teclado2.nextInt();
		
		System.out.println("inserta la cantidad:");
		int unidades = teclado2.nextInt();
		
		Articulo articulo = entityManager.find(Articulo.class, idcategoria);
		System.out.println(articulo.getPrecio());
		pedidoLinea.setPrecio(articulo.getPrecio());
		pedidoLinea.setArticulo(articulo);
		pedidoLinea.setUnidades(unidades);
		pedidoLinea.setImporte(articulo.getPrecio() * unidades);
		pedido.setImporte(articulo.getPrecio() * unidades);
		
		
		
		entityManager.getTransaction().begin();
		entityManager.persist(pedido);
		entityManager.getTransaction().commit();
		entityManager.close();


		
	}
	
	public static void ListarPedido (EntityManager entityManager) {
		

		List<Pedido>pedidos= entityManager.createQuery("from Pedido order by id", Pedido.class).getResultList();
		System.out.println();
		for (Pedido pedido : pedidos)
			System.out.println(pedido.toString());
		
		entityManager.getTransaction().begin();
		entityManager.close();
		
	}
	
	
	public static void EliminarPedido (EntityManager entityManager) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime el id del pedido a borrar: ");
		Long idpedido = teclado.nextLong();
		 
		
		Pedido recogePedido = entityManager.find(Pedido.class, idpedido);
		
		entityManager.getTransaction().begin();
		entityManager.remove(recogePedido);
		entityManager.getTransaction().commit();
		entityManager.close();

		
		
		
		
	}

}
