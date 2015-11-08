
package Beta;

/**
 * @author 68NK7.
 * @author DAVID GUTIERREZ SOLANO.
 * @version Red 1.0v.
 * @since Octuber 10th, 2015.
 */
public class NodoPrimario { //Clase nodo de registro de usuario
    public String nombreApellidos;   //Variables para registros de datos
    public String sexo; //Genero
    public String fechaNacim;   //Fecha de nacimiento
    public String telefono; //Telefono
    public String correo;   //Correo electronico
    public String direccion;    //Direccion de residencia
    public String usuario;  //nombre de usuario
    public String clave;    //Contraseña de usuario
    public String descripcion;  //Descripcion personal de usuario
    public String lugarEstudio; //Lugar donde estudia
    public String deporte;  //Deporte favorito
    public String actividades;  //Actividades a realizar
    public String publicacion;
    public NodoPrimario siguiente;  //Siguiente nodo-enlace
    //Se crea el constructor del nodo
    public NodoPrimario (String nombreApellidos, String sexo, String fechaNacim, String telefono, String correo,String direccion, String usuario, String clave, String descripcion, String lugarEstudio, String deporte, String actividades,String publicacion){
        this.nombreApellidos=nombreApellidos; //Variables del constructor
        this.sexo=sexo;
        this.fechaNacim=fechaNacim;
        this.telefono=telefono;
        this.correo=correo;
        this.direccion=direccion;
        this.usuario=usuario;
        this.clave=clave;
        this.descripcion=descripcion;
        this.lugarEstudio=lugarEstudio;
        this.deporte=deporte;
        this.actividades=actividades;
        this.publicacion=publicacion;
    }    
}
