package serpis.ad;

import java.util.*;
import javax.persistence.*;


public class MenuPrincipal {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("serpis.ad.proyectohibernate");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		

		


		Scanner teclado = new Scanner(System.in);
		int opcion= -1;
		
		while (opcion != 0){
			System.out.println("-----------------------------------------------");
			System.out.println("Escoge una opción: ");
			System.out.println("1-Insertar");
			System.out.println("2-Listar");
			System.out.println("3-Eliminar");
			System.out.println("0- SALIR ");
			
			opcion = teclado.nextInt();
			if (opcion == 0) {
				break;
			}
			switch (opcion) {
			case 1:
				
				System.out.println("¿Que quieres insertar?");
				System.out.println("1-Pedidos");
				System.out.println("2-Clientes");
				System.out.println("3-Articulos");
				System.out.println("4-Categorias");
				
				
				Scanner teclado2 = new Scanner(System.in);
				int opcion2 = teclado2.nextInt();
				
				switch (opcion2) {
					case 1:
						
						PedidoDAO.InsertarPedido(entityManager);
					
						break;
					
					case 2:
						
						ClienteDAO.InsertarCliente(entityManager);					
					
						break;
					
					case 3:
						
						ArticuloDAO.InsertarArticulo(entityManager);
					
						break;
					case 4:
						
						CategoriaDAO.InsertarCategoria(entityManager);
						
						break;
						

					default:
						break;
				}
				
				break;
				
			case 2:
				
				
				System.out.println("¿Que quieres listar?");
				System.out.println("1-Pedidos");
				System.out.println("2-Clientes");
				System.out.println("3-Articulos"); 
				System.out.println("4-Categorias");
				
				Scanner teclado3 = new Scanner(System.in);
				int opcion3 = teclado3.nextInt();
				
				switch (opcion3) {
					case 1:
						
						PedidoDAO.ListarPedido(entityManager);
					
						break;
					
					case 2:
						
						ClienteDAO.ListarCliente(entityManager);	
					
						break;
					
					case 3:
						
						ArticuloDAO.ListarArticulo(entityManager);
					
						break;
					case 4:
						
						CategoriaDAO.ListarCategoria(entityManager);
						
						break;

					default:
						break;
						
				}
				
				break;
				
				
			case 3:
				
				
				System.out.println("¿Que quieres eliminar?");
				System.out.println("1-Pedidos");
				System.out.println("2-Clientes");
				System.out.println("3-Articulos");
				System.out.println("4-Categorias");
				
				Scanner teclado4 = new Scanner(System.in);
				int opcion4 = teclado4.nextInt();
				
				switch (opcion4) {
					case 1:
						
						PedidoDAO.EliminarPedido(entityManager);
					
						break;
					
					case 2:
						
						ClienteDAO.	EliminarCliente(entityManager);				
					
						break;
					
					case 3:
						
						ArticuloDAO.EliminarArticulo(entityManager);
					
						break;
					case 4:
						
						CategoriaDAO.EliminarCategoria(entityManager);
						
						break;

					default:
						break;
				}
				
				
				
					

			default:
				break;
			}
		}


	}

}
