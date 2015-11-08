
package Beta;

/**
 * @author 68NK7.
 * @author DAVID GUTIERREZ SOLANO.
 * @version Red 1.0v.
 * @since Octuber 10th, 2015.
 */
public class NodoUsuario { //Clase nodo de registro de usuario
    public String nombre;   //Variable para nombre
    public String apellidos; //Variable para apellido
    public String sexo; //Genero
    public String fechaNacimiento;   //Fecha de nacimiento
    public String telefono; //Telefono
    public String correo;   //Correo electronico
    public String direccion;    //Direccion de residencia
    public String nombreUsuario;  //nombre de usuario
    public String clave;    //Contraseña de usuario
    public String descripcionPersonal;  //Descripcion personal de usuario
    public String lugarEstudio; //Lugar donde estudia
    public String deporte;  //Deporte favorito
    public String actividades;  //Actividades a realizar
    public NodoUsuario siguiente;  //Siguiente nodo-enlace
    public ListaUsuarios usuarioAmigos;
    public ListaUsuarios solicitudUsuario;
    //Se crea el constructor del nodo
    public NodoUsuario (String nombre,String apellidos, String sexo, String fechaNacimiento, String telefono, String correo,String direccion, String nombreUsuario, String clave, String descripcionPersonal, String lugarEstudio, String deporte, String actividades){
        this.nombre=nombre; //Variables del constructor
        this.apellidos=apellidos;
        this.sexo=sexo;
        this.fechaNacimiento=fechaNacimiento;
        this.telefono=telefono;
        this.correo=correo;
        this.direccion=direccion;
        this.nombreUsuario=nombreUsuario;
        this.clave=clave;
        this.descripcionPersonal=descripcionPersonal;
        this.lugarEstudio=lugarEstudio;
        this.deporte=deporte;
        this.actividades=actividades;
        this.usuarioAmigos=new ListaUsuarios();
        this.solicitudUsuario=new ListaUsuarios();
        
    }    
}
