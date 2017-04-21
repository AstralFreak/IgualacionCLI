/**
 * Created by Pablo Nogueira on 20/04/2017.
 */

import java.sql.Timestamp;
import java.util.Date;
import java.util.Scanner;

public class IgualacionCLI {

        public static void main(String[] args) {
        /*System.Scanner*/
/* Inicializar las variables para nombre y apellidos del sujeto, nombre y apellidos del aplicador u numero de caso*/

            String NommbreSujeto;
            String ApellidosSujeto;
            int NumeroCaso;
            int NumeroAplicador;
            String Inciso;


            Inciso = "Cual de estos es mas grande?";


            Scanner in = new Scanner(System.in);
            System.out.println("!Bienvenido! ¿Estas listo para comenzar?");
            System.out.println("Por favor intruduzca los datos que se le solicitan a continuacion para realizar el registro apropiado.");
            System.out.println("Despues de introducir los datos, se presentaran las instrucciones al sujeto.");

            System.out.println("Nombre del sujeto");
            NommbreSujeto = in.nextLine();
            System.out.println("Apellidos del sujeto");
            ApellidosSujeto = in.nextLine();
            System.out.println("Número de caso");
            NumeroCaso = in.nextInt();
            System.out.println("Número del aplicador");
            NumeroAplicador = in.nextInt();


            System.out.println("A continuacion te mostraremos 2 numeros. Dino por favor cual es el mayor");

        /*Este bloque crea el timestamp para el inicio del ensayo*/
            Date date= new Date();
            long time = date.getTime();
            Timestamp ts = new Timestamp(time);


        /*inciso 1*/
        int Inciso1;
            System.out.println(Inciso);
            System.out.println("42  o   32");
            Inciso1 = in.nextInt();


        /*inciso 2*/
        int Inciso2;
            System.out.println(Inciso);
            System.out.println("22  o   32");
            Inciso2 = in.nextInt();

        /*inciso 3*/
        int Inciso3;
            System.out.println(Inciso);
            System.out.println("1000  o   0001");
            Inciso3 = in.nextInt();

/* codigo para el reporte final*/

    /*Muestra la fecha y hora de inicio del ensayo en el formato: año-mes-dia, 24 horas*/
            System.out.println("Fecha y hora del ensayo: "+ ts);

            /*Estas dos lineas muestran el nombre y apellido del sujeto*/
            System.out.print("Sujeto: "+NommbreSujeto);
            System.out.println(" " + ApellidosSujeto);

        /*Esta linea muestra el numero de caso*/
            System.out.println("Expediente: " + NumeroCaso);

        /*Esta Linea muestra el Nombre y apellido del aplicador*/
            System.out.println("Aplicador: " + NumeroAplicador);

         /*Esta linea muestra las respuestas*/

            System.out.println("Respuesta 1: " + Inciso1 + "  Respuesta 2: " + Inciso2 + "  Respuesta 3: "  + Inciso3);


    }

}
