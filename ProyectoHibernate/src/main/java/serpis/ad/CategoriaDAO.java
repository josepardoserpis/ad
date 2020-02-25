package serpis.ad;

import java.util.*;
import javax.persistence.*;

public class CategoriaDAO {
	
	public static void InsertarCategoria() {
		
		Categoria categoria = new Categoria();
		
		System.out.println("Dime la categoria: ");
		Scanner teclado = new Scanner(System.in);
		String nombre = teclado.nextLine();
		
		categoria.setNombre(nombre);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("serpis.ad.proyectohibernate");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(categoria);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
		
		
	}
	public static void ListarCategoria(EntityManager entityManager) {
		
		List<Categoria>categorias = entityManager.createQuery("from articulo order by id", Categoria.class).getResultList();
		
		for (Categoria categoria : categorias)
			System.out.printf("%3d %s \n" ,categoria.getId(),categoria.getNombre()); 
	}
	
	public static void EliminarCategoria (EntityManager entityManager) {
		
	}

}
