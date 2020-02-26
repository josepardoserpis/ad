package serpis.ad;



import java.util.*;
import javax.persistence.*;

public class ArticuloDAO {
	
	public static void InsertarArticulo(EntityManager entityManager) {
		
		Articulo articulo = new Articulo();
		
		System.out.println("Dime el nombre del articulo: ");
		Scanner teclado = new Scanner(System.in);
		String nombre = teclado.nextLine();
		

		
		
		System.out.println("Inserta la categoria del articulo: ");
		
		int categoria = teclado.nextInt();
		
		
		
		
		System.out.println("Inserta el precio del articulo: ");
		double precio = teclado.nextDouble();
		
		
		articulo.setNombre(nombre);
		articulo.setCategoria(categoria);
		articulo.setPrecio(precio);

		

		entityManager.getTransaction().begin();
		entityManager.persist(articulo);
		entityManager.getTransaction().commit();
		entityManager.close();


		

	}
	
	public static void ListarArticulo(EntityManager entityManager) {
		
		List<Articulo>articulos = entityManager.createQuery("from Articulo order by id", Articulo.class).getResultList();
		
		for (Articulo articulo : articulos)
    		System.out.println(articulo.toString());
	}
	
	public static void EliminarArticulo (EntityManager entityManager) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dime el id del articulo a borrar");
		Long idarticulo = teclado.nextLong();
		
		Articulo recogeArticulo = entityManager.find(Articulo.class, idarticulo);
		
		entityManager.getTransaction().begin();
		entityManager.remove(recogeArticulo);
		entityManager.getTransaction().commit();
		entityManager.close();
		
		
	}

}
