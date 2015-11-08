
package Beta;
import java.util.*;
/**
 * @author 68NK7.
 * @author DAVID GUTIERREZ SOLANO.
 * @version Red 1.0v.
 * @since Octuber 10th, 2015.
 * 
 */
public class ListaMetodos { //Clase de metodos apara las operaciones necesarias del sistema
    public String listaVacia="no hay usuarios registrados";
    Scanner entrada=new Scanner(System.in);
    MenuInicio instancia2=new MenuInicio();
    
    public NodoPrimario primero;    //primer nodo
    public boolean esVacia(){   //Metodo de comprobacion de la lista, estado vacia o con datos.
        if(primero==null){  //Comprobacion de nodos
            return true;    //condicion verdad
        }
        else{
            return false;   //condicion falsa
        }
    }
    //Metodo para el registro de los nuevos usuarios.
    public void agregaUsuarios(String nombreApellidos, String sexo, String fechaNacim, String telefono, String correo, String direccion, String usuario,String clave, String descripcion, String lugarEstudio, String deporte, String actividades,String publicacion){  //Registro de usuarios
    NodoPrimario nuevoNodo=new NodoPrimario(nombreApellidos, sexo, fechaNacim, telefono, correo, direccion, usuario, clave, descripcion, lugarEstudio, deporte, actividades,publicacion);
    if(esVacia()){  
        primero=nuevoNodo;  //Si la lista es vacia, se guarda el primer usuario
    }
    else{   //Condicion para registrar los nuevos usuario si ya contine datos nuestra lista
            nuevoNodo.siguiente=primero;
            primero=nuevoNodo;
        }
    }
    //Metodo para mostrar en pantalla los usuarios registrados
    public void mostrarUsuarios(){  
    NodoPrimario auxiliar=primero;  //Creamos un temporal para las condiciones
    if(esVacia()){
        System.out.println(listaVacia.toUpperCase());   //Mensaje de la lista vacia
    }
    else{   //Condicion si hay datos en la lista
        while(auxiliar!=null){  //Mientras auxiliar sea diferente a vacio, mostramos los datos deseados al usuario
            System.out.print("Nombre y Apellidos: "+auxiliar.nombreApellidos+"\nSexo: "+auxiliar.sexo+"\nFecha Nacimiento: "+auxiliar.fechaNacim+
                             "\nTelefono: "+auxiliar.telefono+"\nCorreo: "+auxiliar.correo+"\nDireccion: "+auxiliar.direccion+"\n");
            auxiliar=auxiliar.siguiente;    //Enlazamos el siguiente nodo  
        }
    }
    }
//    public void buscarUsuario(String nombreBuscado){  //Metodo para buscar por medio del nombre y apellidos
//        if(primero.nombreApellidos.equals(nombreBuscado)){    //Condicion 1: primero nodo igual al datos buscado
//            System.out.println("DATOS DEL USUARIO\n"+primero.nombreApellidos+"\n"+primero.sexo+"\n"+primero.fechaNacim+"\n"+primero.telefono+
//                                "\n"+primero.correo+"\n"+primero.direccion+"\n"+primero.usuario);
//        }
//        else{
//            NodoPrimario auxiliar=primero;  //nodo auxiliar
//            while(auxiliar.siguiente!=null){    //Simepre que auxiliar-siguiente sea distinto a NULL
//            if(auxiliar.nombreApellidos==nombreBuscado){  //Condicion 2: comparacion de auxiliar con dato buscado
//                System.out.println("DATOS DEL USUARIO\n"+auxiliar.nombreApellidos+"\n"+auxiliar.sexo+"\n"+auxiliar.fechaNacim+"\n"+auxiliar.telefono+
//                                "\n"+auxiliar.correo+"\n"+auxiliar.direccion+"\n"+auxiliar.usuario);
//                break;
//              }
//            }
//        }
//    }
    public void buscarUsuario(String nombreB){
    
        if(esVacia()){
            System.out.println(listaVacia.toUpperCase());
        }
        else{
        
            NodoPrimario auxiliar=primero;
            while((auxiliar!=null)&&(auxiliar.nombreApellidos!=nombreB)){
                auxiliar=auxiliar.siguiente;
                System.out.println("DATOS DEL USUARIO\n"+auxiliar.nombreApellidos+"\n"+auxiliar.sexo+"\n"+auxiliar.fechaNacim+"\n"+auxiliar.telefono+
                                   "\n"+auxiliar.correo+"\n"+auxiliar.direccion+"\n"+auxiliar.usuario);
            }
        } 
    }
    public void validarSesion(String usuarioN, String claveN){
        if((primero.usuario==usuarioN) && (primero.clave==claveN)){
            String opc1;
            do{
            System.out.println();
            System.out.println("Menu"); 
            System.out.println();
            System.out.println("1. Editar Informacion Personal");
            System.out.println("2. Ver Publicaciones");
            System.out.println("3. Escribir Publicacion");
            System.out.println("4. Ver Solicitudes");
            System.out.println("5. Buscar Amigos");
            System.out.println("6. Cerrar Sesion");
            int opc2;
            System.out.print("Escoja una opcion: ");
            opc2=entrada.nextInt();
            switch (opc2){
                case 1:
                    System.out.println();
                    System.out.print("Nombre y Apellidos: ");
                    primero.nombreApellidos=entrada.next();               
                    System.out.println();
                    System.out.print("Sexo: ");
                    primero.sexo=entrada.next();
                    System.out.println();
                    System.out.print("Fecha de Nacimiento: ");
                    primero.fechaNacim=entrada.next();
                    System.out.println();
                    System.out.print("Telefono: ");
                    primero.telefono=entrada.next();
                    System.out.println();
                    System.out.print("Correo: ");
                    primero.correo=entrada.next();
                    System.out.println();   
                    System.out.print("Direccion: ");
                    primero.direccion=entrada.next();
                    System.out.println();
                    System.out.print("Usuario: ");
                    primero.usuario=entrada.next();
                    System.out.println();
                    System.out.print("Contraseña: ");
                    primero.clave=entrada.next();
                    System.out.println();
                    System.out.print("Descripcion Personal: ");
                    primero.descripcion=entrada.next();
                    System.out.println();   
                    System.out.print("Lugar de Estudio: ");
                    primero.lugarEstudio=entrada.next();
                    System.out.println();
                    System.out.print("Deporte: ");
                    primero.deporte=entrada.next();
                    System.out.println();
                    System.out.print("Actividades: ");
                    primero.actividades=entrada.next();
                    //registroUsuarios(primero.nombreApellidos,primero.sexo,primero.fechaNacim,primero.telefono, primero.correo, primero.direccion, primero.usuario, primero.clave,primero.descripcion,primero.lugarEstudio,primero.deporte,primero.actividades);
                    break;
                case 2:
                    if(primero.publicacion==null){
                        System.out.println("No hay publicaciones");
                    }
                    else{
                        NodoPrimario aux=primero;
                        while(aux.siguiente!=null){
                            System.out.println(aux.publicacion);
                        }
                    }
                    break;
                case 3:
                    if(primero.publicacion==null){
                        System.out.print("Publicacion: ");
                        primero.publicacion=entrada.next();
                    }
                    else{
                        NodoPrimario aux=primero;
                        while(aux.siguiente!=null){
                            if(aux.publicacion==null){
                                System.out.print("Publicacion: ");
                                aux.publicacion=entrada.next();
                            }
                        }
                    }
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    break;
            }
            System.out.print("Ingrese \'Y\' para volver al menu\nsino 6 para salir del sistema");
            opc1=entrada.next();
            }while(opc1=="Y"||opc1=="y");       
        }
        else {
            NodoPrimario auxiliar=primero;
            while((auxiliar.usuario!=null)&&(auxiliar.clave!=null)){
                //proceso de busqueda y editar
                if((auxiliar.usuario==usuarioN)&&(auxiliar.clave==claveN)){
                    String opc1;
                    do{
                    System.out.println();
                    System.out.println("Menu"); 
                    System.out.println();
                    System.out.println("1. Editar Informacion Personal");
                    System.out.println("2. Ver Publicaciones");
                    System.out.println("3. Escribir Publicacion");
                    System.out.println("4. Ver Solicitudes");
                    System.out.println("5. Buscar Amigos");
                    System.out.println("6. Cerrar Sesion");
                    int opc2;
                    System.out.print("Escoja una opcion: ");
                    opc2=entrada.nextInt();
                    switch (opc2){
                        case 1:
                            System.out.println();
                            System.out.print("Nombre y Apellidos: ");
                            auxiliar.nombreApellidos=entrada.next();               
                            System.out.println();
                            System.out.print("Sexo: ");
                            auxiliar.sexo=entrada.next();
                            System.out.println();
                            System.out.print("Fecha de Nacimiento: ");
                            auxiliar.fechaNacim=entrada.next();
                            System.out.println();
                            System.out.print("Telefono: ");
                            auxiliar.telefono=entrada.next();
                            System.out.println();
                            System.out.print("Correo: ");
                            auxiliar.correo=entrada.next();
                            System.out.println();   
                            System.out.print("Direccion: ");
                            auxiliar.direccion=entrada.next();
                            System.out.println();
                            System.out.print("Usuario: ");
                            auxiliar.usuario=entrada.next();
                            System.out.println();
                            System.out.print("Contraseña: ");
                            auxiliar.clave=entrada.next();
                            System.out.println();
                            System.out.print("Descripcion Personal: ");
                            auxiliar.descripcion=entrada.next();
                            System.out.println();   
                            System.out.print("Lugar de Estudio: ");
                            auxiliar.lugarEstudio=entrada.next();
                            System.out.println();
                            System.out.print("Deporte: ");
                            auxiliar.deporte=entrada.next();
                            System.out.println();
                            System.out.print("Actividades: ");
                            auxiliar.actividades=entrada.next();
                            //registroUsuarios(primero.nombreApellidos,primero.sexo,primero.fechaNacim,primero.telefono, primero.correo, primero.direccion, primero.usuario, primero.clave,primero.descripcion,primero.lugarEstudio,primero.deporte,primero.actividades);
                            break;
                        case 2:
                            if(auxiliar.publicacion==null){
                                System.out.println("No hay publicaciones");
                            }
                            else{
                                NodoPrimario aux=primero;
                                while(aux.siguiente!=null){
                                    System.out.println(aux.publicacion);
                                }
                            }
                            break;
                        case 3:
                            if(auxiliar.publicacion==null){
                                System.out.print("Publicacion: ");
                                auxiliar.publicacion=entrada.next();
                            }
                            else{
                                NodoPrimario aux=primero;
                                while(aux.siguiente!=null){
                                    if(aux.publicacion==null){
                                        System.out.print("Publicacion: ");
                                        aux.publicacion=entrada.next();
                                    }
                                }
                            }
                            break;
                        case 4:

                            break;
                        case 5:

                            break;
                        case 6:
                            break;
                    }
                    System.out.print("Ingrese \'Y\' para volver al menu\nsino 6 para salir del sistema");
                    opc1=entrada.next();
                    }while(opc1=="Y"||opc1=="y");      
                }
                else{
                    System.out.println("Usuario o contraseña no coinciden");
                    System.out.println();
                    iniciarSesion();
                }
            }               
        }
}
    public void iniciarSesion(){
        
                System.out.println("Iniciar sesion".toUpperCase());
                System.out.println();
                System.out.print("usuario: ".toUpperCase());
                String usuarioN=entrada.next();
                System.out.print("contraseña: ".toUpperCase());
                String claveN=entrada.next();
                validarSesion(usuarioN, claveN);//llamar al metodo de iniciar session
                System.out.println();      
                }
    
    public void registroUsuario(){
                System.out.println("Registro en TROLL´S RED");
                System.out.println();
                System.out.print("Nombre y Apellidos: ");
                String nombreApellidos=entrada.next();               
                System.out.println();
                System.out.print("Sexo: ");
                String sexo=entrada.next();
                System.out.println();
                System.out.print("Fecha de Nacimiento: ");
                String fechaNacim=entrada.next();
                System.out.println();
                System.out.print("Telefono: ");
                String telefono=entrada.next();
                System.out.println();
                System.out.print("Correo: ");
                String correo=entrada.next();
                System.out.println();   
                System.out.print("Direccion: ");
                String direccion=entrada.next();
                System.out.println();
                System.out.print("Usuario: ");
                String usuario=entrada.next();
                System.out.println();
                System.out.print("Contraseña: ");
                String clave=entrada.next();
                String descripcion=null,lugarEstudio=null,deporte=null,actividades=null,publicacion=null;
                agregaUsuarios(nombreApellidos,sexo,fechaNacim,telefono, correo, direccion, usuario, clave,descripcion,lugarEstudio,deporte,actividades,publicacion);
    
    }
    public void editarDatosUsuario(){
        
    }
}
   