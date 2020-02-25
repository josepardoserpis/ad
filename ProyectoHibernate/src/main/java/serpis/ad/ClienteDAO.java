package serpis.ad;
import java.util.*;

import javax.persistence.*;

public class ClienteDAO {
	
	public static void InsertarCliente () {
		
		Cliente cliente = new Cliente ();
		System.out.println("Nombre del cliente: ");
		
		Scanner teclado = new Scanner(System.in);
		String nombre = teclado.nextLine();
		
		cliente.setNombre(nombre);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("serpis.ad.proyectohibernate");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(cliente);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
		
		
		
	}
	public static void ListarCliente(EntityManager entityManager) {
		
		List<Cliente>clientes = entityManager.createQuery("from articulo order by id", Cliente.class).getResultList();
		
		for (Cliente cliente : clientes)
    		System.out.printf("%3d %s \n" , cliente.getId(),cliente.getNombre()); 
	}
	
	public static void EliminarCliente (EntityManager entityManager) {
		
	}

}
