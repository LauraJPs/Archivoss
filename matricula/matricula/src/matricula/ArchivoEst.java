/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matricula;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/**
 *
 * @author Jimena
 */



public class ArchivoEst {
    
    
    static void crear(){ 
        FileWriter fichero = null;  //objeto principal (archivo)
        PrintWriter linea = null;  
        String rutaDescargas = System.getProperty("user.home") + "\\Downloads\\";
        String nombreArchivo = "estudiantes.txt";
        String rutaArchivo = rutaDescargas + nombreArchivo;
        
       try {
           
            //objeto de contenido de archivo
           
           fichero = new FileWriter(rutaArchivo,true); //crea el archivo 
            linea = new PrintWriter(fichero); //apunta el PrintWriter al archivo creado            
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String dato; //variable para almacenar nombre y apellido
            String cadena; //nombre;apellido;
            
            // Solicitar y leer la información del estudiante           
            System.out.println("Código: ");
            dato = reader.readLine();
            cadena = dato + "#";
            System.out.println("Nombre: ");
            dato = reader.readLine();
            cadena = cadena + dato + "#";
            System.out.println("Apellido: ");
            dato = reader.readLine();
            cadena = cadena + dato + "#";
            System.out.println("Número de créditos: ");
            dato = reader.readLine();
            cadena = cadena + dato + "#";
            System.out.println("Promedio: ");
            //double promedio = Double.parseDouble(reader.readLine());
            dato = reader.readLine();
            cadena = cadena + dato + "#";
            linea.println(cadena);
            //BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo, true));
            //writer.write(cadena);
           
            //writer.close();       
            System.out.println("La información del estudiante se ha guardado en el archivo: " + rutaArchivo);
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
       finally{
            try{
                if(fichero != null){
                    fichero.close();
                }
            }catch(IOException e1){
                System.out.print("Error cerrando archivo");
            }
        }
       
       }
    static void buscar(String filtro, int index){
        String rutaDescargas = System.getProperty("user.home") + "\\Downloads\\";
        String nombreArchivo = "estudiantes.txt";
        String rutaArchivo = rutaDescargas + nombreArchivo;
        File archivo = null;  //apuntar al archivo almancenado DD
        FileReader contenido = null;  //acceder a todo el contenido del archivo
        BufferedReader linea = null; //accede linea a linea al contenido
        
        try{
            archivo = new File(rutaArchivo);
            contenido = new FileReader(archivo);
            linea = new BufferedReader(contenido);
            
            String cadena=""; //variable captura los datos del archivo
            while((cadena=linea.readLine()) != null){ //recorre todo el archivo
                String dato[] = cadena.split("#");
                if(dato[index].contains(filtro)){
                    System.out.println("Codigo: "+ dato[0]);
                    System.out.println(" Nombre: "+ dato[1]);  
                    System.out.println(" Apellido: "+ dato[2]);
                    System.out.println(" Numero de créditos: "+ dato[3]);
                    System.out.println(" Promedio: "+ dato[4]);
                    
                }   
            }
         }catch(IOException e){
           System.out.print("Error consultando archivo");
        }
        finally{
            try{
                if(contenido != null){
                    contenido.close();
                }
            }catch(IOException e1){
                System.out.print("Error cerrando archivo");
            }
        }
    }

    public static void main(String[] args) {
        try {        
             crear();    
             System.out.println("================");
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             System.out.println("Digite criterio (0 - codigo / 1 -nombre / 2 - apellido)");             
             String dato = br.readLine();
             int criterio = Integer.parseInt(dato);
             System.out.println("Digite el elemento a buscar");             
             dato = br.readLine();            
             buscar(dato,criterio);
             System.out.println("================");
             
         } catch (IOException ex) {
             System.out.println("Error");
         }
    }
    }

