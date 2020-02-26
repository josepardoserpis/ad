package serpis.ad;

import java.util.*;
import javax.persistence.*;

public class CategoriaDAO {
	
	public static void InsertarCategoria(EntityManager entityManager) {
		
		Categoria categoria = new Categoria();
		
		System.out.println("Dime la categoria: ");
		Scanner teclado = new Scanner(System.in);
		String nombre = teclado.nextLine();
		
		categoria.setNombre(nombre);
		


		entityManager.getTransaction().begin();
		entityManager.persist(categoria);
		entityManager.getTransaction().commit();


		
		
	}
	public static void ListarCategoria(EntityManager entityManager) {
		
		List<Categoria>categorias = entityManager.createQuery("from Categoria order by id", Categoria.class).getResultList();
		System.out.println();
		for (Categoria categoria : categorias)
			System.out.printf("%3d %s \n" ,categoria.getId(),categoria.getNombre()); 
	}
	
	public static void EliminarCategoria (EntityManager entityManager) {
		
		Scanner teclado = new Scanner(System.in);
		Long idcategoria = teclado.nextLong();
		
		Categoria recogeCategoria = entityManager.find(Categoria.class, idcategoria);
		
		entityManager.getTransaction().begin();
		entityManager.remove(recogeCategoria);
		entityManager.getTransaction().commit();
		entityManager.close();
		
	}

}
