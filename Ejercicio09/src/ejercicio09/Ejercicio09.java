package ejercicio09;
public class Ejercicio09 {
    public static void main(String[] args) {
        double var1 = 81.0;
        double var2 = 25.0;
        int var3 = 10;
        int var4 = 50;
        double raizA = Math.sqrt(var1);
        double raizB = Math.sqrt(var2);
        double calculo = raizA + raizB * var3;
        boolean resultado = calculo >= var4;
        System.out.println("El resultado es: " + resultado);
    }
}