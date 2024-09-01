package Programa;
import java.util.Scanner;
public class Tarea01 {
    public static void main (String[] arg){
    Scanner teclado=new Scanner(System.in);
    int num;
    System.out.print("Ingrese un valor entero de 1 o 2 digitos: ");
    num=teclado.nextInt();
    if (num<10){
        System.out.print("Tiene un dígito");
            }
    else{
        System.out.print("Tiene dos dígitos");
    }
}
}
