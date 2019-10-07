using System;


namespace CConsola {

    class MainClass {

        public static void Main(string[] args){

            Menu.Create("Menú Categorias")
                .Add("1 - Nuevo", nuevo)
                .Add("2 - Editar", editar)
                .Add("3 - Borrar", borrar)
                .ExitWhen("0 - salir")
                .Loop();




        }

    private static void nuevo() {
            Console.WriteLine("Has entrado en nuevo.");
            Console.ReadLine();
    }

    
    private static void editar() {
            Console.WriteLine("Has entrado en editar.");
            Console.ReadLine();
    }

    private static void borrar() {
            Console.WriteLine("Has entrado en borrar.");
            Console.ReadLine();
    }
    
    public static int readInteger(string label) {
            while (true) {
                Console.Write(label);
                string linea = Console.ReadLine();
                try {
                    return Int32.Parse(linea);
                }
                catch{

                    Console.WriteLine("Formato inválido. vuelve a introducir.");

                }
            }
        }

        public static int readOption(string label, string options) { 
            while (true) {
                Console.Write(label);
                string option = Console.ReadLine();
                if (option == "0")
                    return 0;
            }
        }

    }
}
