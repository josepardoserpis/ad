package serpis.ad;

import java.util.*;
import javax.persistence.*;

public class ArticuloDAO {
	
	private void psv() {
		// TODO Auto-generated method stub
		
		Articulo articulo = new Articulo();
		
		System.out.println("Dime el articulo: ");
		Scanner teclado = new Scanner(System.in);
		String nombre = teclado.nextLine();
		
		articulo.setNombre(nombre);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("serpis.ad.proyectohibernate");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(articulo);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
		

	}

}
