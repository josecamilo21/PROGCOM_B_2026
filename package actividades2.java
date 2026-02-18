package actividades2;
import java.util.*;

public class Actividades2 {
    public static void main(String[] args) {
        //Ejercicio 1:
        Scanner sc = new Scanner(System.in);

        System.out.println("Base:");
        double base = sc.nextDouble();

        System.out.println("Altura:");
        double altura = sc.nextDouble();

        // Cálculo del área de un triángulo: (b * h) / 2
        double area = (base * altura) / 2;

        System.out.println("Area = " + area);
        //Ejercicio 2:
        
        
        System.out.println("Grados Celsius:");
        double c = sc.nextDouble();
        
        double f = (c * 9 / 5) + 32;
        
        System.out.println("Fahrenheit = " + f);
        
        //Ejercicio 3:
        
        System.out.println("Numero 1:");
        double n1 = sc.nextDouble();
        
        System.out.println("Numero 2:");
        double n2 = sc.nextDouble();
        
        System.out.println("Numero 3:");
        double n3 = sc.nextDouble();
        
        double promedio = (n1 + n2 + n3) / 3;
               
                
                System.out.println("promedio = " + promedio);
                
        //Ejercicio 4:
        
        System.out.println("Radio:");
        double radio = sc.nextDouble();
        
        double area2 = 3.1416 * radio * radio;
        double perimetro = 2 * 3.1416 * radio;
        
        System.out.println("Area = " + area);
        System.out.println("Perimetro = " + perimetro);
    }
}
