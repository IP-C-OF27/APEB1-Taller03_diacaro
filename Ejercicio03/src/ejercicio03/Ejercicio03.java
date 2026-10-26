package ejercicio03;
public class Ejercicio03 {
    public static void main(String[] args) {
        int var1 = 10;
        int var2 = 2;
        int var3 = 16;
        double var4 = 20.0;
        int var5 = 1;
        int var6 = 11;
        double potencia = Math.pow(var1, var2);
        double raizCuadrada = Math.sqrt(var3);
        double division = var4 / (var5 + var6);
        double resultado = potencia + raizCuadrada + division;
        System.out.println("El resultado es: " + resultado);
    }  
}