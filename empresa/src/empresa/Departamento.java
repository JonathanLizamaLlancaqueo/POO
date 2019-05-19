package empresa;

import java.util.Scanner;

public class Departamento {

      //Atributo de relacion
      private Empleado director;

      //Atributo de la clase Departamento
      private String nombre;

      @Override
      public String toString() {
            return "" + this.nombre;
      }

      //Constructor con parametros de la clase Departamento
      public Departamento(String nombre) {
            this.nombre = nombre;
      }

      public Departamento() {
            Scanner leer = new Scanner(System.in);
            director = new Empleado(new Departamento("Finanzas"), "Luis Mardones", "11.245.567-6");
            System.out.println(director.toString());
            
            System.out.println("desea cambiar el nombre del director?:   SI/NO");
            String respuesta = leer.nextLine();
            cambiarNombre(respuesta);
            
            System.out.println(director.toString());
            
            
            

      }
      
      private void cambiarNombre(String respuesta){
            Scanner leer = new Scanner(System.in);
            if(respuesta.equals("si") || respuesta.equals("SI")){
                  System.out.println("ingrese el nombre que desea colocar: ");
                  String nombreDirector = leer.nextLine();
                  director.setNombre(nombreDirector);
            } else
                  System.out.println("No se cambiara el nombre");
          
            
      }

}
