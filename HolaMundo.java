/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;
import java.util.*;
/**
 *
 * @author B11
 */
public class HolaMundo {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String lluvia;
        // Saludar Al Mundo
        System.out.println("Hola Mundo. Bienvenidos a PROGCOM-B");
        System.out.println("Esta lloviendo?");
        //Estamos definiendo un objeto de tipo Scanner
        Scanner play = new Scanner(System.in);
        lluvia=play.nextLine();
        
        System.out.println("Tu respuesta fue: "+lluvia);
        
        if (lluvia=="si"){
            System.out.println("Use sombrilla. Guarde la ropa");
        }else{
            System.out.println("Salga tranquilo");
        }
        
        //IF ternario
        //Tipo de dato (variable)=(condición)? Código si es V: Código si es F:
        String aguacero = (lluvia.equals("si")) ? "Use sombrilla. Guarde la ropa":"Salga tranquilo"
        System.out.println(aguacero);
    }
    
}
