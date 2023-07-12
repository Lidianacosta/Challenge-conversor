package br.com.conversor.modelo;

public class LibrasEsterlinas {
    /** valor da real no momento que foi feito o programa */
    private final double REAL = 6.26;

    /** valor do dollar no momento que foi feito o programa */
    private final double DOLLAR = 1.29;
    /** valor do Euro no momento que foi feito o programa */
    private final double EURO = 1.17;
    /** valor do Peso argentino no momento que foi feito o programa */
    private final double PESOARGENTINO = 339.71;
    /** valor do Peso Chileno no momento que foi feito o programa */
    private final double PESOCHILENO = 1051.18;

    public final String[] OPCOES_CONVERTER_MOEDAS = { "Converter de Libras Esterlinas a Dólar",
            "Converter de Libras Esterlinas a Euro", "Converter de Libras Esterlinas a Reais",
            "Converter de Libras Esterlinas a Peso argentino", " Converter de Libras Esterlinas a Peso Chileno" };

    public double converterReais(double valor) {
        return this.REAL * valor;
    }

    public double converterDollar(double valor) {
        return this.DOLLAR * valor;
    }

    public double converterEuro(double valor) {
        return this.EURO * valor;
    }

    public double converterPesoArgentino(double valor) {
        return this.PESOARGENTINO * valor;
    }

    public double converterPesoClileno(double valor) {
        return this.PESOCHILENO * valor;
    }

}
