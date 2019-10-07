using System;

namespace CConsola
{
    class MainClass
    {
        public static void Main(string[] args){

            int entero = readInteger("Introduce un entero: ");
            Console.WriteLine("entero={0}", entero);
            int opcion = readOption("Elige opción [012]: ", "012");

        }
        public static int readInteger(string label) {
            Console.Write(label);
            String linea = Console.ReadLine();
            try {
                return Int32.Parse(linea);
            }catch{
                Console.WriteLine("Formato invalido. Vuelve a introducir. ");
            }

        }

        public static int readOption(string label, string options){
            while (true){



            }

        }
    }
}
