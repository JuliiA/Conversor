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
public class MetrosKM extends Conversor{
    private static final double UN_KM = 1000;
    
    @Override
    public Double convertirValor1Valor2(Double metro) {
        return metro / UN_KM;
    }

    @Override
    public Double convertirValor2Valor1(Double KM) {
        return KM * UN_KM;
    }

    @Override
    public String toString() {
        return "Metros a KM";
    }  

    @Override
    public String getLabelValor1() {
        return "Metros";
    }

    @Override
    public String getLabelValor2() {
        return "Kms";
    }
}
