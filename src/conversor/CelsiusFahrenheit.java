/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

/**
 *
 * @author Juliana
 */
public class CelsiusFahrenheit extends Conversor {
    private static final double UN_FAHRENHEIT = 32;
    
    @Override
    public Double convertirValor1Valor2(Double celsius) {
        return (celsius * 9/5) + UN_FAHRENHEIT;
    }

    @Override
    public Double convertirValor2Valor1(Double fahrenheit) {
        return  (fahrenheit - UN_FAHRENHEIT) * 5/9;
    }

    @Override
    public String getLabelValor1() {
        return "Celsius ";
    }

    @Override
    public String getLabelValor2() {
        return "Fahrenheit ";
    }

    @Override
    public String toString() {
        return "Celsius a Fahrenheit";
    }
    
    
}
