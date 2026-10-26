package ejercicio07;
public class Ejercicio07 {
    public static void main(String[] args) {
        double var1 = 81.0;
        int var2 = 9;
        int var3 = 3;
        int var4 = 9;
        int var5 = 10;
        int var6 = 1;
        double var7 = 100.0;
        double var8 = 25.0;
        double var9 = 100.0;
        double operacion = (Math.sqrt(var1) + var2) / var3;
        boolean condicion1 = operacion == var4;
        boolean condicion2 = var5 > var6;
        boolean condicion3 = (var7 / var8) >= Math.sqrt(var9);
        boolean resultado = condicion1 || (condicion2 && condicion3);
        System.out.println("El resultado es: " + resultado);
    }
}