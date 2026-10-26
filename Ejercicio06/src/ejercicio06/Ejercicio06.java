package ejercicio06;
public class Ejercicio06 {
    public static void main(String[] args) {
        double var1 = 81.0;
        int var2 = 9;
        int var3 = 3;
        int var4 = 9;
        int var5 = 10;
        int var6 = 1;
        double operacion = (Math.sqrt(var1) + var2) / var3;
        boolean condicion1 = operacion == var4;
        boolean condicion2 = var5 > var6;
        boolean resultado = condicion1 && condicion2;
        System.out.println("El resultado es: " + resultado);
    }
}