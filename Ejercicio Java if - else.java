/******************************************************************************

edad=int(input("Cuál es tu edad?"))
if edad>=18
 print("Usted es mayor de edad.")
else:
 print("Usted es menor de edad")

*******************************************************************************/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Cuál es tu edad");
        int age = lector.nextInt();
        if (age < 10) {
            System.out.println("Aún eres un niño");
        } else if (age >= 10 && age < 14) {
            System.out.println("Eres un preadolescente");
        } else if (age >= 14 && age < 18) {
            System.out.println("Eres un adolescente");
        } else if (age >= 18 && age < 30) {
            System.out.println("Eres un adulto joven");
        } else {
            System.out.println("Eres un adulto");
        }
        
        lector.close();
    }
}
	