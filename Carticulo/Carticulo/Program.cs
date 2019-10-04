using System;
using MySql.Data.MySqlClient;
using System.Data;

namespace Carticulo
{
    class MainClass
    {

        public static void Main(string[] args){

            Console.WriteLine("Accediendo a dbprueba");

            IDbConnection dbConnection = new MySqlConnection("server=localhost;database=dbprueba;user=root;password=sistemas;ssl-mode=none");

            dbConnection.Open();



        }
    }
}
