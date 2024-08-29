package Programa;
import java.util.Scanner;
public class Tarea03 {
    public static void main (String[] arg){
        String nombre, clave;
        Scanner entrada =  new Scanner(System.in);
        System.out.print("Ingrese Nombre de Usurio: ");
        nombre = entrada.nextLine();
        System.out.print("Ingrese La Clave: ");
        clave= entrada.nextLine();
        if (nombre.equals("juan")&& clave.equals("123456")){
            System.out.println("Bienvenido al Sistema");
        }
    else{
            System.out.println("Nombre de usuario o contraseña Incorrecto");
        }
    }
}
