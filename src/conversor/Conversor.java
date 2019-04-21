/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

/**
 *
 * @author laboratorios
 */
public abstract class Conversor {
    /***
     * 
     * @param valor1 = recibe el valor a convertir ingresado en el primer textfield
     * @return valor tipo double que es resultado de la conversion seleccionada
     */
    public abstract Double convertirValor1Valor2(Double valor1);
    
    /**
     * 
     * @param valor1 = recibe el valor a convertir ingresado en el segundo textfield
     * @return valor tipo double que es resultado de la conversion seleccionada
     */
    public abstract Double convertirValor2Valor1(Double valor1);
    
    /**
     * 
     * @return leyenda que va a acompañar al primer textfield
     */
    public abstract String getLabelValor1();
    
    /**
     * 
     * @return leyenda que va a acompañar al segundo textfield
     */
    public abstract String getLabelValor2();
    
}
