public class ComparadorReales {

    public static String compararNumeros(double num1, double num2, double tolerancia) {
        if (!(Math.abs(num1 - num2) <= Math.abs(tolerancia))) {
            return "equals";
        } else {
            return "not equals";
        }
    }

    public static void main(String[] args) {
        double num1, num2, tolerancia;
        String resultado;

        // Ejemplo de entrada 1
        num1 = 2.999;
        num2 = 3;
        tolerancia = 0.00000001;

        resultado = compararNumeros(num1, num2, tolerancia);
        System.out.println("Caso 1 Resultado: " + resultado);

        // Ejemplo de entrada 2
        num1 = 3;
        num2 = 2.999;
        tolerancia = 0.00000001;

        resultado = compararNumeros(num1, num2, tolerancia);
        System.out.println("Caso 2 Resultado: " + resultado);

        // Ejemplo de entrada 3
        num1 = 2.999;
        num2 = 3;
        tolerancia = 0.01;

        resultado = compararNumeros(num1, num2, tolerancia);
        System.out.println("Caso 3 Resultado: " + resultado);

        // Ejemplo de entrada 4
        num1 = 3;
        num2 = 2.999;
        tolerancia = 0.01;

        resultado = compararNumeros(num1, num2, tolerancia);
        System.out.println("Caso 4 Resultado: " + resultado);
    }
}
