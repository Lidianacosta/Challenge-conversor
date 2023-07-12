package br.com.conversor.modelo;

/**
 * converter moedas e temperaturas.
 */

public class Conversor  {
    
    public final static Reais converterParaReais = new Reais();

    public final static Dollar converterParaDollar = new Dollar();

    public final static Euro converterParaEuro = new Euro();

    public final static LibrasEsterlinas converterParaLibrasEsterlinas = new LibrasEsterlinas();

    public final static PesoArgentino converterParaPesoArgentino = new PesoArgentino();

    public final static PesoChileno converterParaPesoChileno = new PesoChileno();


    /** escolha da conversão */
    public static final String[] OPCOES_DE_CONVERSAO = { "Conversor de Moedas", "Conversor de Temperatura" };
    /** Escolha qual moeda para conversão*/
    public static final String[] MOEDA_CONVERTER = { "Reais","Dollar", "Euro","Libras Esterlinas", "Peso argentino", "Peso Chileno" };
    /** opções para converter temperaturas*/
    public static final String[] OPCOES_CONVERTER_TEMPERATURA = {"Converter de Celsius a Fahrenheit", "Converter de Celsius a Kelvin", "Converter de Fahrenheit a Celsius", "Converter de Fahrenheit a Kelvin", "Converter de Kelvin a Fahrenheit", "Converter de Kelvin a Celsius"};

    
    /** 
     * @param valorDeConversao
     * @param valor
     * @return double
     */
    public static double ConverterValor (double valorDeConversao, double valor){
        return valorDeConversao * valor;
    }

    
    /** 
     * @param valor
     * @return double
     */
    public static double kelvinFahrenheit(double valor) {
        return(valor - 273.15) * 9/5 + 32;
    }

    
    /** 
     * @param valor
     * @return double
     */
    public static double kelvinCelsius(double valor) {
        return valor - 273.15;
    }

    
    /** 
     * @param valor
     * @return double
     */
    public static double celsiusFahrenheit(double valor) {
        return ( valor * 9/5) + 32 ;
    }

    
    /** 
     * @param valor
     * @return double
     */
    public static double celsiusKelvin(double valor) {
        return valor + 273.15 ;
    }

    
    /** 
     * @param valor
     * @return double
     */
    public static double fahrenheitCelsius(double valor) {
        return ( valor - 32) * 5/9;
    }

    
    /** 
     * @param valor
     * @return double
     */
    public static double fahrenheitKelvin(double valor) {
        return ( valor - 32) * 5/9 + 273.15 ;
    }


}
