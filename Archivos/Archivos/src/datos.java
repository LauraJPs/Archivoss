
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrador
 */
public  class datos {
    private String URL="ejemplo.txt";
    
    public void crear(){
        String dato; //variable para almacenar nombre y apellido
        String cadena; //nombre;apellido;
        FileWriter fichero = null;  //objeto principal (archivo)
        PrintWriter linea = null;   //objeto de contenido de archivo
        
        try{
            fichero = new FileWriter(URL,true); //crea el archivo 
            linea = new PrintWriter(fichero); //apunta el PrintWriter al archivo creado
            // Inicia captura de datos del usuario
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Digite nombre:");
            dato = br.readLine();
            cadena = dato + ";";
            System.out.println("Digite apellido:");
            dato = br.readLine();
            cadena = cadena + dato + ";";
            System.out.println("Digite correo:");
            dato = br.readLine();
            cadena = cadena + dato + ";";
            
            linea.println(cadena); //escribiendo en el archivo
            
      }catch(IOException e){
           System.out.print("Error creando archivo");
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
     public ArrayList<Persona> mostrar(){
        File archivo = null;  //apuntar al archivo almancenado DD
        FileReader contenido = null;  //acceder a todo el contenido del archivo
        BufferedReader linea = null; //accede linea a linea al contenido
        ArrayList<Persona> p = new ArrayList<Persona>();
       
        try{
            archivo = new File(URL);
          //  printPaths(archivo);
            contenido = new FileReader(archivo);
            linea = new BufferedReader(contenido);
            
            String cadena=""; //variable captura los datos del archivo
            while((cadena=linea.readLine()) != null){ //recorre todo el archivo
                 Persona Temp= new Persona();
                String dato[] = cadena.split(";");                 
                Temp.setNombre(dato[0]);
                Temp.setApellido(dato[1]);
                Temp.setCorreo(dato[2]);
                p.add(Temp);               
            }
         }catch(IOException e){
           System.out.print("Error abriendo archivo");
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
        return p;
    }
     public  Persona mostrar(String filtro, int index){
         File archivo = null;  //apuntar al archivo almancenado DD
        FileReader contenido = null;  //acceder a todo el contenido del archivo
        BufferedReader linea = null; //accede linea a linea al contenido
         Persona p= new Persona();
        try{
            archivo = new File(URL);
            contenido = new FileReader(archivo);
            linea = new BufferedReader(contenido);
            
            String cadena=""; //variable captura los datos del archivo
            while((cadena=linea.readLine()) != null){ //recorre todo el archivo
                String dato[] = cadena.split(";");
                if(dato[index].contains(filtro)){
                    p.setNombre(dato[0]);
                    p.setApellido(dato[1]);
                    p.setCorreo(dato[2]);
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
        return p;
    }
}
