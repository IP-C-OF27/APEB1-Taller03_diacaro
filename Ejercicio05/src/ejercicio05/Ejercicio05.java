package ejercicio05;
public class Ejercicio05 {
    public static void main(String[] args) {
        int var1 = 2;
        int var2 = 2;
        int var3 = 12;
        int var4 = 1;
        double var5 = 3.0;
        double potencia = Math.pow(var1, var2);
        double operacion = potencia + var3 - var4;
        double resultado = operacion / var5;
        System.out.println("El resultado es: " + resultado);
    }
}