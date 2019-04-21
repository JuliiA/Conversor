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
public class CentimetrosPulgadas extends Conversor{
    private static final double UNA_PULGADA = 2.54;
    
    /**
     *Convirte Centimetro a Pulgadas  
     * @param centimetros valor a convertir
     * @return Pulgadas
     */
    
    @Override
    public Double convertirValor1Valor2(Double centimetros) {
        return centimetros / UNA_PULGADA;
    }

    /**
     * Convierte valor Pulgadas a Centimetros
     * @param pulgadas
     * @return valor calculado
     */
    @Override
    public Double convertirValor2Valor1(Double pulgadas) {
        return pulgadas * UNA_PULGADA;
    }
    
    @Override
    public String toString() {
        return "Centimetros a Pulgada";
    }  

    @Override
    public String getLabelValor1() {
        return "Centimetros";
    }

    @Override
    public String getLabelValor2() {
        return "Pulgadas";
    }
    
    
}
