package br.com.conversor.modelo;

public class Celsius implements ConversoesTemperatura {

    @Override
    public double ConverterParaFahrenheit(double valor) {
        return ( valor * 9/5) + 32 ;
    }

    @Override
    public double ConverterParaCelsius(double valor) {
        return valor;
    }

    @Override
    public double ConverterParaKelvin(double valor) {
        return valor + 273.15 ;
    }
    
}
