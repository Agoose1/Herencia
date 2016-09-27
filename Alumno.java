package prueba;

/**
 *
 * @author agustin
 */
//Codigo clase alumno
public class Alumno extends Persona {
    //campos especificos de la subclase

    private String idProfesor;

    //Constructor de la sub-clase: incluimos como parámetros al menos los del constructor de la superclase
    public Alumno(String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        idProfesor = "";
    }

    //Metodos especificos de la sub-clase
    public void setidProfesor(String idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getidProfesor() {
        return idProfesor;
    }

    public void mostrarNAC() {
        // nombre = "Paco"; Si tratáramos de acceder directamente a un campo privado de la superclase, salta un error
        // Sí podemos acceder a variables de instancia a través de los métodos de acceso públicos de la superclase
        System.out.println("Alumno de nombre: " + getNombre() + " " + getApellidos() + " con edad de " + getEdad()
                + " y Id de alumno: " + getidProfesor());
    }
}
