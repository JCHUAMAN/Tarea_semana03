package Programa;
import java.util.Scanner;
public class Tarea02 {
    public static void main (String[] arg){
            Scanner teclado=new Scanner (System.in);
            int nota1, nota2, nota3;
            System.out.print("Ingrese la Primera Nota: ");
            nota1=teclado.nextInt();
            System.out.print("Ingrese la Segunda Nota: ");
            nota2=teclado.nextInt();
            System.out.print("Ingrese la Tercera Nota: ");
            nota3=teclado.nextInt();
            int promedio;
            promedio=(nota1 + nota2 + nota3) / 3;
            if (promedio >=7)
            {
                System.out.println("Aprobado: " + promedio);
            }
                
    }

    
}