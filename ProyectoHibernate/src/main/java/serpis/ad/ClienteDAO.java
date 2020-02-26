package serpis.ad;
import java.util.*;

import javax.persistence.*;

public class ClienteDAO {
	
	public static void InsertarCliente (EntityManager entityManager) {
		
		Cliente cliente = new Cliente ();
		System.out.println("Nombre del cliente: ");
		
		Scanner teclado = new Scanner(System.in);
		String nombre = teclado.nextLine();
		
		cliente.setNombre(nombre);
		

		entityManager.getTransaction().begin();
		entityManager.persist(cliente);
		entityManager.getTransaction().commit();


		
		
		
	}
	public static void ListarCliente(EntityManager entityManager) {
		
		List<Cliente>clientes = entityManager.createQuery("from Cliente order by id", Cliente.class).getResultList();
		System.out.println();
		for (Cliente cliente : clientes)
    		System.out.printf("%3d %s \n" , cliente.getId(),cliente.getNombre()); 
	}
	
	public static void EliminarCliente (EntityManager entityManager) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime la id del cliente a eliminar:");
		Long idcliente = teclado.nextLong();
		
		Cliente recogeCliente = entityManager.find(Cliente.class, idcliente);
		
		entityManager.getTransaction().begin();
		entityManager.remove(recogeCliente);
		entityManager.getTransaction().commit();
		entityManager.close();
		
	}

}
