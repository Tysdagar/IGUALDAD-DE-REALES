Tutor y compañeros buenos dias.

Yo seleccione el 3 ejercicio del escenario 1:

Nombre: Evaluador de igualdad de reales.

Descripcion:  En este problema se debe hacer un programa que reciba 3 números; los dos primeros son los números reales a comparar y el último es la tolerancia dada. Los números se consideran iguales si su diferencia es máximo la tolerancia dada, pero no la sobrepasa.

Descripcion de Entrada: tres números reales; el último de ellos será positivo con toda seguridad.

Descripcion de Salida: equals si los dos primeros números son iguales según la tolerancia dada; not equals si no lo son.

Casos de prueba: 

Ejemplo de entrada: 2.999 , 3 , 0.00000001
Ejemplo de salida: equals

Ejemplo de entrada: 3 ,  2.999 ,  0.00000001
Ejemplo de salida: equals

Ejemplo de entrada: 2.999 , 3 , 0.01
Ejemplo de salida: not equals

Ejemplo de entrada: 3 , 2.999 , 0.01
Ejemplo de salida: not equals 




Codigo: 

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


Resultados:




Link repositorio del codigo: Igualdad de Reales


Nota: Se puede configurar para la utilidad scanner y recibir los valores desde el usuario y no hardcodeados pero lo hize asi por efectos de testing y mostrar de manera mas compacta los resultados.
