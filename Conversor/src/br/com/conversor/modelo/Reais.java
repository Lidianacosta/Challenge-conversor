package br.com.conversor.modelo;

public class Reais  {

    /** valor do dollar no momento que foi feito o programa*/
    private final double DOLLAR = 4.8; 
    /** valor do Euro no momento que foi feito o programa*/
    private final double EURO = 5.27;
    /** valor da Libras Estelinas no momento que foi feito o programa*/
    private final double LIBRASESTERLINAS = 6.17;
    /** valor do Peso argentino no momento que foi feito o programa*/
    private final double PESOARGENTINO = 0.019;
    /** valor do Peso Chileno no momento que foi feito o programa*/
    private final double PESOCHILENO = 0.0061;
    /** escolha da conversão */
    public final String[] OPCOES_CONVERTER_MOEDAS = { "Converter de Reais a Dólar", "Converter de Reais a Euro","Converter de Reais a Libras Esterlinas", "Converter de Reais a Peso argentino", " Converter de Reais a Peso Chileno" };

    public double converterDollar(double valor) {
        return this.DOLLAR * valor;
    }

    public double converterEuro(double valor) {
        return this.EURO * valor;
    }

    public double converterLibrasEsterlinas(double valor) {
        return this.LIBRASESTERLINAS * valor;
    }

    public double converterPesoArgentino(double valor) {
        return this.PESOARGENTINO * valor;
    }

    public double converterPesoClileno(double valor) {
        return this.PESOCHILENO * valor;
    }

}
