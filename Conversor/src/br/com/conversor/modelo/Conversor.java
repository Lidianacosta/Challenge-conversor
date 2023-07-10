package br.com.conversor.modelo;

/**@
 * converter moedas e temperaturas.
 */

public class Conversor  {
    /** valor do dollar no momento que foi feito o programa*/
    public static final double DOLLAR = 4.8; 
    /** valor do Euro no momento que foi feito o programa*/
    public static final double EURO = 5.27;
    /** valor da Libras Estelinas no momento que foi feito o programa*/
    public static final double LIBRASESTERLINAS = 6.17;
    /** valor do Peso argentino no momento que foi feito o programa*/
    public static final double PESOARGENTINO = 0.019;
    /** valor do Peso Chileno no momento que foi feito o programa*/
    public static final double PESOCHILENO = 0.0061;
    /** escolha da conversão */
    public static final String[] OPCOES_DE_CONVERSAO = { "Conversor de Moedas", "Conversor de Temperatura" };
    /** opções para converter moedas*/
    public static final String[] OPCOES_CONVERTER_MOEDAS = { "Converter de Reais a Dólar", "Converter de Reais a Euro","Converter de Reais a Libras Esterlinas", "Converter de Reais a Peso argentino", " Converter de Reais a Peso Chileno" };
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
