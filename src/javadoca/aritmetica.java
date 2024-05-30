
package javadoca;

/**
 *
 * @author FrancisGamboa
 * @version Esta clase representa operaciones aritméticas básicas.
 * 
 */
public class aritmetica {

    /**
     * Suma dos números enteros.
     * 
     * @param a el primer número a sumar
     * @param b el segundo número a sumar
     * @return la suma de a y b
     */

    public int sumar(int a, int b) {
        return a + b;
    }

    /**
     * Resta dos números enteros.
     * 
     * @param a el minuendo
     * @param b el sustraendo
     * @return la resta de a y b
     */

    public int restar(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dos números enteros.
     * 
     * @param a el primer factor
     * @param b el segundo factor
     * @return el producto de a y b
     */

    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide dos números enteros.
     * 
     * @param a el dividendo
     * @param b el divisor
     * @return la división de a entre b
     * @throws IllegalArgumentException si se intenta dividir por cero
     */

    public double dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return (double) a / b;
    }
}
