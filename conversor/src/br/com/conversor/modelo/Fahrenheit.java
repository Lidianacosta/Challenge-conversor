package br.com.conversor.modelo;

public class Fahrenheit implements ConversoesTemperatura{

       /** 
     * @param valor
     * @return double
     */
    @Override
    public double ConverterParaFahrenheit(double valor) {
        return valor;
    }

    /** 
     * @param valor
     * @return double
     */
    @Override
    public double ConverterParaCelsius(double valor) {
        return ( valor - 32) * 5/9;
    }

    /** 
     * @param valor
     * @return double
     */
    @Override
    public  double ConverterParaKelvin(double valor) {
        return ( valor - 32) * 5/9 + 273.15 ;
    }
    
}
