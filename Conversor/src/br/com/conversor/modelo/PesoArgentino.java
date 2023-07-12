package br.com.conversor.modelo;

public class PesoArgentino {
    /** valor do real no momento que foi feito o programa */
    private final double REAL = 0.019;

    /** valor do dollar no momento que foi feito o programa */
    private final double DOLLAR = 0.0038;
    /** valor do Euro no momento que foi feito o programa */
    private final double EURO = 0.0035;
    /** valor da Libras Estelinas no momento que foi feito o programa */
    private final double LIBRASESTERLINAS = 0.0029;

    /** valor do Peso Chileno no momento que foi feito o programa */
    private final double PESOCHILENO = 3.09;

    public final String[] OPCOES_CONVERTER_MOEDAS = { "Converter de Peso argentino a Dólar",
            "Converter de Peso argentino a Euro", "Converter de Peso argentino a Libras Esterlinas",
            "Converter de Peso argentino a Reais", " Converter de Peso argentino a Peso Chileno" };

    public double converterReais(double valor) {
        return this.REAL * valor;
    }

    public double converterDollar(double valor) {
        return this.DOLLAR * valor;
    }

    public double converterEuro(double valor) {
        return this.EURO * valor;
    }

    public double converterLibrasEsterlinas(double valor) {
        return this.LIBRASESTERLINAS * valor;
    }

    public double converterPesoClileno(double valor) {
        return this.PESOCHILENO * valor;
    }

}
