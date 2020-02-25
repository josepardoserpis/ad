package serpis.ad;



import java.util.*;
import javax.persistence.*;

public class ArticuloDAO {
	
	public static void InsertarArticulo() {
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
	
	public static void ListarArticulo(EntityManager entityManager) {
		
		List<Articulo>articulos = entityManager.createQuery("from articulo order by id", Articulo.class).getResultList();
		
		for (Articulo articulo : articulos)
    		System.out.printf("%4d %s \n" , articulo.getId(),articulo.getCategoria(),articulo.getNombre(),articulo.getPrecio()); 
	}
	
	public static void EliminarArticulo (EntityManager entityManager) {
		
	}

}
