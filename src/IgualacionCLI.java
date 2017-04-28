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
            long NumeroCaso;
            long NumeroEnsayo;
            long NumeroAplicador;
            String Inciso;


            Inciso = "Cual de estos es mas grande?";


            Scanner in = new Scanner(System.in);
            System.out.println("!Bienvenido! ¿Estas listo para comenzar?");
            System.out.println("Por favor intruduzca los datos que se le solicitan a continuacion para realizar el registro apropiado.");
            System.out.println("Despues de introducir los datos, se presentaran las instrucciones al sujeto.");
            Scanner iniciar = new Scanner(System.in);

            System.out.println("Presiona ENTER para continuar.....");

            iniciar.nextLine();
            System.out.println("Nombre del sujeto");
            NommbreSujeto = in.nextLine();
            System.out.println("Apellidos del sujeto");
            ApellidosSujeto = in.nextLine();
            System.out.println("Número de caso");
            NumeroCaso = in.nextLong();
            System.out.println("Numero de ensayo");
            NumeroEnsayo = in.nextLong();
            System.out.println("Número del aplicador");
            NumeroAplicador = in.nextLong();


            System.out.println("A continuacion te mostraremos 2 numeros. Dino por favor cual es el mayor");

        /*Este bloque crea el timestamp para el inicio del ensayo*/
            Date date= new Date();
            long time = date.getTime();
            Timestamp ts = new Timestamp(time);


        /*inciso 1*/
        int Inciso1;
            System.out.println(Inciso);
            System.out.println("42  o   32");
            double Inicio1 = System.nanoTime();
            Inciso1 = in.nextInt();
            double Tiempo1 = System.nanoTime();
            double resta1 = Tiempo1 - Inicio1;
            double total1 = resta1 / 1000000000;

        /*inciso 2*/
        int Inciso2;
            System.out.println(Inciso);
            System.out.println("22  o   32");
            double Inicio2 = System.nanoTime();
            Inciso2 = in.nextInt();
            double Tiempo2 = System.nanoTime();
			double resta2 = Tiempo2 - Inicio2;
			double total2 = resta2 / 1000000000;

        /*inciso 3*/
        int Inciso3;
            System.out.println(Inciso);
            System.out.println("1000  o   0001");
            double Inicio3 = System.nanoTime();
            Inciso3 = in.nextInt();
            double Tiempo3 = System.nanoTime();
			double resta3 = Tiempo3 - Inicio3;
			double total3 = resta3 / 1000000000;
			

/* codigo para el reporte final*/

    /*Muestra la fecha y hora de inicio del ensayo en el formato: año-mes-dia, 24 horas*/
            System.out.println("Fecha y hora del ensayo: "+ ts);

            /*Estas dos lineas muestran el nombre y apellido del sujeto*/
            System.out.print("Sujeto: "+NommbreSujeto);
            System.out.println(" " + ApellidosSujeto);

        /*Esta linea muestra el numero de caso*/
            System.out.println("Expediente: " + NumeroCaso);

            System.out.println("Número de ensayo: " + NumeroEnsayo);

        /*Esta Linea muestra el Nombre y apellido del aplicador*/
            System.out.println("Aplicador: " + NumeroAplicador);

         /*Esta linea muestra las respuestas*/

            System.out.println("Respuesta 1: " + Inciso1 + "    Completado en: " + total1);

            System.out.println("Respuesta 2: " + Inciso2 + "    Completado en: " + total2);

            System.out.println("Respuesta 3: "  + Inciso3 + "   Completado en: " + total3);

            Scanner terminar = new Scanner(System.in);

            System.out.println("Presiona ENTER para finalizar.....");

            terminar.nextLine();

    }

}
