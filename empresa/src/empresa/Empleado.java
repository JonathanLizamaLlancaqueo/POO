package empresa;

public class Empleado {
      
      
      //Atributos de relación
      private Departamento departamentoDirigido;
      
      //Atributos de la clase Empleado
      private String nombre;
      private String rut;

      //Metodo toString para mostrar los atributos de la clase Empleado
      @Override
      public String toString() {
            return "Nombre departamento: " + this.departamentoDirigido +"\n"
                    +"Nombre Director: " + this.nombre + "\n"
                    + "Rut director: " + this.rut + "\n";
      }

      //Constructor con parametros.
      public Empleado(Departamento departamentoDirigido, String nombre, String rut) {
            this.departamentoDirigido = departamentoDirigido;
            this.nombre = nombre;
            this.rut = rut;
      }

      //Metodos get de la clase Empleado para asignarle un valor inicial a nuestros atributos.
      public String getNombre() {
            return nombre;
      }

      public String getRut() {
            return rut;
      }

      public Departamento getDepartamentoDirigido() {
            return departamentoDirigido;
      }

      //Metodos set para modificar o cambiar el valor de nuestros atributos.
      public void setNombre(String nombre) {
            this.nombre = nombre;
      }

      public void setRut(String rut) {
            this.rut = rut;
      }

      public void setDepartamentoDirigido(Departamento departamentoDirigido) {
            this.departamentoDirigido = departamentoDirigido;
      }

}
