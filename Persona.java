package prueba;

/*
 * @author agustin
 */
//Codigo de la clase persona
public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;
    
    //constructor
    
    public Persona (String nombre, String apellidos, int edad){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.edad=edad;          
    }
    
    //Metodos
    public String getNombre(){
        return nombre;
    }
    public String getApellidos(){
        return apellidos;
    }
    public int getEdad(){
        return edad;
    }
}
