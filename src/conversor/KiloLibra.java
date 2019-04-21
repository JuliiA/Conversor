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
public class KiloLibra extends Conversor{
    private static final double UNA_LIBRA = 2.20462;

    @Override
    public Double convertirValor1Valor2(Double kilo) {
        return kilo * UNA_LIBRA;
    }

    @Override
    public Double convertirValor2Valor1(Double libra) {
        return libra / UNA_LIBRA;
    }
    
    @Override
    public String toString() {
        return "Kilo a Libra";
    }     

    @Override
    public String getLabelValor1() {
        return "Kilos";
    }

    @Override
    public String getLabelValor2() {
        return "Libras";
    }
}
