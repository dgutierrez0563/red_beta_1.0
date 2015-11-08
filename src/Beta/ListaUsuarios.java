/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beta;

/**
 *
 * @author Abigail
 */
public class ListaUsuarios {
    //Aqui va la clase NodoUsuario
    
    public String listaVacia="no hay usuarios registrados";
    MenuInicio instancia2=new MenuInicio();
    
    public NodoUsuario primero;    //primer nodo
    public boolean esVacia(){   //Metodo de comprobacion de la lista, estado vacia o con datos.
        if(primero==null){  //Comprobacion de nodos
            return true;    //condicion verdad
        }
        else{
            return false;   //condicion falsa
        }
    }
    //Metodo para el registro de los nuevos usuarios.
    public void insertarUsuarios(NodoUsuario usuario){  //Registro de usuarios
    NodoUsuario nuevoNodo=usuario;
    if(esVacia()){  
        primero=nuevoNodo;  //Si la lista es vacia, se guarda el primer usuario
    }
    else{   //Condicion para registrar los nuevos usuario si ya contine datos nuestra lista
            nuevoNodo.siguiente=primero;
            primero=nuevoNodo;
        }
    }
    //Metodo para mostrar en pantalla los usuarios registrados
//    public void mostrarUsuarios(){  
//    NodoUsuario auxiliar=primero;  //Creamos un temporal para las condiciones
//    if(esVacia()){
//        System.out.println(listaVacia.toUpperCase());   //Mensaje de la lista vacia
//    }
//    else{   //Condicion si hay datos en la lista
//        while(auxiliar!=null){  //Mientras auxiliar sea diferente a vacio, mostramos los datos deseados al usuario
//            System.out.print("Nombre: "+auxiliar.nombre+"\nApellidos: "+auxiliar.apellidos+"\nSexo: "+auxiliar.sexo+"\nFecha Nacimiento: "+auxiliar.fechaNacimiento+
//                             "\nTelefono: "+auxiliar.telefono+"\nCorreo: "+auxiliar.correo+"\nDireccion: "+auxiliar.direccion+"\n");
//            auxiliar=auxiliar.siguiente;    //Enlazamos el siguiente nodo  
//        }
//    }
//    }
    public void agregarAmigos(){
        
    
    }
    
    
    public ListaUsuarios buscarPorNombre(String nombre){
        ListaUsuarios usuariosEncontrados=new ListaUsuarios();
        
        NodoUsuario auxiliar=primero;
        while(auxiliar!=null){  //Mientras auxiliar sea diferente a vacio, mostramos los datos deseados al usuario
          if(auxiliar.nombre.equals(nombre)){
              usuariosEncontrados.insertarUsuarios(/*recibe temporal del usuario*/);
                 }
                auxiliar=auxiliar.siguiente;    //Enlazamos el siguiente nodo  
            }
        return ListaUsuarios;
    }
    
    
}
