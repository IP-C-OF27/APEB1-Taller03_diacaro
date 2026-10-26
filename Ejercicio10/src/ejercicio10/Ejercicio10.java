package ejercicio10;
public class Ejercicio10 {
    public static void main(String[] args) {
        double var1 = 25.0;
        double var2 = 10.0;
        double var3 = 100.0;
        double var4 = 10.0;
        double var5 = 5.0;
        double var6 = 2.0;
        boolean condicion1 = (Math.sqrt(var1) * var2) >= var3;
        boolean condicion2 = (var4 / var5) >= var6;
        boolean resultado = (condicion1 && true) || false || condicion2;
        System.out.println("El resultado es: " + resultado);
    }
}