/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beta;

/**
 *
 * @author 68NK7
 */
public class ListaPublicacion {
    public NodoPublicacion primer;
    String listaVacia="no hay publicaciones";
    public boolean subVacia(){
        if(primer==null){
            return true;
        }
        else{
            return false;
        }
    }
    public void subPublicar(String publicacion, String mensaje){
        NodoPublicacion nuevoN=new NodoPublicacion(publicacion, mensaje);
        if(subVacia()){
            primer=nuevoN;
        }
        else{
            nuevoN.siguen=primer;
            primer=nuevoN;
        }
    }
    public void verPublicacion(){
        NodoPublicacion temp=primer;
        if(subVacia()){
            System.out.println(listaVacia.toUpperCase());
        }
        else{
            while(temp!=null){
                System.out.println(temp.publicacion);
                temp=temp.siguen;
            }
        }
    }
    public void eliminaPublicacion(){   //Elimina la ultima publicacion
        if(primer==null){
            System.out.println(listaVacia.toUpperCase());
        }
        else{
            primer=primer.siguen;
        }
    }
}
