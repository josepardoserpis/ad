package serpis.ad;

import java.util.*;
import javax.persistence.*;


public class MenuPrincipal {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("serpis.ad.proyectohibernate");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		
		System.out.println("Escoge una opción: ");
		
		System.out.println("1-Pedidos");
		System.out.println("2-Clientes");
		System.out.println("3-Articulos");
		
		Scanner teclado = new Scanner(System.in);
		
		int opcion= teclado.nextInt();
		
		switch (opcion) {
		case 1:
			
			//Llamar al metodo de pedidoDAO de añadir, modificar o eliminar
			
			System.out.println("Has elegido pedidos, ¿Qué quieres hacer?");
			
			
			
			
			break;
			
		case 2:
			
			//Llamar al metodo de clientesDAO de añadir, modificar o eliminar
			
		case 3:
			
			//Llamar al metodo de ArticulosDAO de añadir, modificar o eliminar
			
			
			break;	

		default:
			break;
		}

	}

}
