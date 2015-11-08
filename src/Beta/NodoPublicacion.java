
package Beta;

/**
 *
 * @author 68NK7
 */
public class NodoPublicacion {
    public String publicacion;
    public String mensaje;
    public NodoPublicacion siguen;
    
    public NodoPublicacion(String publicacion,String mensaje){
        this.publicacion=publicacion;
        this.mensaje=mensaje;
    }
}
