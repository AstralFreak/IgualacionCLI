/**
 * Created by Pablo Nogueira on 20/04/2017.
 */

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.FileWriter;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
        boolean verdad1;
        String calificacion1;

            System.out.println(Inciso);
            System.out.println("42  o   32");
            double Inicio1 = System.nanoTime();
            Inciso1 = in.nextInt();
            double Tiempo1 = System.nanoTime();
            double resta1 = Tiempo1 - Inicio1;
            double total1 = resta1 / 1000000000.0;

            if(Inciso1 != 42){
                verdad1 = false;
                calificacion1 = " Incorrectamente.";
        }
            else {
                verdad1 = true;
                calificacion1 = " Correctamente.";
            }


        /*inciso 2*/
        int Inciso2;
            boolean verdad2;
            String calificacion2;
            System.out.println(Inciso);
            System.out.println("22  o   32");
            double Inicio2 = System.nanoTime();
            Inciso2 = in.nextInt();
            double Tiempo2 = System.nanoTime();
			double resta2 = Tiempo2 - Inicio2;
			double total2 = resta2 / 1000000000.0;

            if(Inciso2 != 32){
                verdad2 = false;
                calificacion2 = " Incorrectamente.";
            }
            else {
                verdad2 = true;
                calificacion2 = " Correctamente.";
            }


        /*inciso 3*/

            boolean verdad3;
            String calificacion3;

        int Inciso3;
            System.out.println(Inciso);
            System.out.println("1000  o   0001");
            double Inicio3 = System.nanoTime();
            Inciso3 = in.nextInt();
            double Tiempo3 = System.nanoTime();
			double resta3 = Tiempo3 - Inicio3;
			double total3 = resta3 / 1000000000.0;

            if(Inciso3 != 1000){
                verdad3 = false;
                calificacion3 = " Incorrectamente.";
            }
            else {
                verdad3 = true;
                calificacion3 = " Correctamente.";
            }


/*Codigo para registro en CSV*/

            String stringCaso  = Long.toString(NumeroCaso);
            String stringEnsayo = Long.toString(NumeroEnsayo);
            String fileName = stringCaso + "-" + stringEnsayo + ".csv";



                //Delimiter used in CSV file
            String COMMA_DELIMITER = ",";
                String NEW_LINE_SEPARATOR = "\n";

                //CSV file header
                 String FILE_HEADER = "TimeStamp,Caso,ApellidoSujeto,NombreSujeto,NumeroEnsayo," +
                        "NumeroAplicador,Respuesta1,Correcto1,Tiempo1,Respuesta2,Correcto2,Tiempo2,Respuesta3,Correcto3," +
                        "Tiempo3";


                    FileWriter fileWriter = null;

             try {
                 fileWriter = new FileWriter(fileName);



                        fileWriter = new FileWriter(fileName);

                        fileWriter.append(FILE_HEADER);
                        fileWriter.append(NEW_LINE_SEPARATOR);
                        fileWriter.append(String.valueOf(ts));
                        fileWriter.append(COMMA_DELIMITER);
                        fileWriter.append(String.valueOf(NumeroCaso));
                        fileWriter.append(COMMA_DELIMITER);
                        fileWriter.append(String.valueOf(ApellidosSujeto));
                        fileWriter.append(COMMA_DELIMITER);
                        fileWriter.append(String.valueOf(NommbreSujeto));
                        fileWriter.append(COMMA_DELIMITER);
                        fileWriter.append(String.valueOf(NumeroEnsayo));
                        fileWriter.append(COMMA_DELIMITER);
                        fileWriter.append(String.valueOf(NumeroAplicador));
                        fileWriter.append(COMMA_DELIMITER);
                        fileWriter.append(String.valueOf(Inciso1));
                        fileWriter.append(COMMA_DELIMITER);
                        fileWriter.append(String.valueOf(verdad1));
                        fileWriter.append(COMMA_DELIMITER);
                        fileWriter.append(String.valueOf(total1));
                        fileWriter.append(COMMA_DELIMITER);
                        fileWriter.append(String.valueOf(Inciso2));
                        fileWriter.append(COMMA_DELIMITER);
                        fileWriter.append(String.valueOf(verdad2));
                        fileWriter.append(COMMA_DELIMITER);
                        fileWriter.append(String.valueOf(total2));
                        fileWriter.append(COMMA_DELIMITER);
                        fileWriter.append(String.valueOf(Inciso3));
                        fileWriter.append(COMMA_DELIMITER);
                        fileWriter.append(String.valueOf(verdad3));
                        fileWriter.append(COMMA_DELIMITER);
                        fileWriter.append(String.valueOf(total3));
                  }

             catch (Exception e) {
                 e.printStackTrace();
             }finally {
                 try {
                     fileWriter.flush();
                     fileWriter.close();
                 }
                 catch (IOException e){
                     e.printStackTrace();
                 }

             }


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

            System.out.println("Respuesta 1: " + Inciso1 + "    Completado en: " + total1 + " segundos." + calificacion1);

            System.out.println("Respuesta 2: " + Inciso2 + "    Completado en: " + total2 + " segundos." + calificacion2);

            System.out.println("Respuesta 3: "  + Inciso3 + "   Completado en: " + total3 + " Segundos." + calificacion3);

            System.out.println("El reporte ha sido guardado como: " +fileName);


            Scanner terminar = new Scanner(System.in);

            System.out.println("Presiona ENTER para finalizar.....");

            terminar.nextLine();


    }

}
