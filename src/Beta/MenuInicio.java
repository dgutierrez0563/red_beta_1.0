
package Beta;

import java.util.Scanner;

/**
 * @author 68NK7.
 * @author DAVID GUTIERREZ SOLANO.
 * @version Red 1.0v.
 * @since Octuber 10th, 2015.
 */
public class MenuInicio{
    //ListaMetodos instancia=new ListaMetodos();
    public static void main(String[]args){
        ListaMetodos instancia=new ListaMetodos();
        Scanner entrada=new Scanner(System.in);
        String opcion2;
        do{
        System.out.println("troll´s red".toUpperCase());
        System.out.println();
        System.out.println("1. iniciar sesion".toUpperCase());
        System.out.println("2. registrarse".toUpperCase());
        System.out.println("3. salir del sistema".toUpperCase());
        System.out.println();
        System.out.print("ingrese una opcion: ".toUpperCase()); 
        int opcion=entrada.nextInt();
        System.out.println();
        switch (opcion){
            case 1:
                instancia.iniciarSesion();
                break;
            case 2:
                instancia.registroUsuario();
            case 3:
                break;
        }
        System.out.println();
        System.out.print("Ingrese \'Y\' para volver al menu\nsino 3 para salir del sistema");
        opcion2=entrada.next();
        System.out.println();
        }while(opcion2.equals("y") || opcion2.equals("Y")); 
        System.out.println();
    }        
}
