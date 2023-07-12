package br.com.conversor.modelo;

public class PesoChileno {
    /** valor do Real no momento que foi feito o programa */
    private final double REAL = 0.0060;

    /** valor do dollar no momento que foi feito o programa */
    private final double DOLLAR = 0.0012;
    /** valor do Euro no momento que foi feito o programa */
    private final double EURO = 0.0011;
    /** valor da Libras Estelinas no momento que foi feito o programa */
    private final double LIBRASESTERLINAS = 0.00095;
    /** valor do Peso argentino no momento que foi feito o programa */
    private final double PESOARGENTINO = 0.32;

    public final String[] OPCOES_CONVERTER_MOEDAS = { "Converter de Peso Chileno a Dólar",
            "Converter de Peso Chileno a Euro", "Converter de Peso Chileno a Libras Esterlinas",
            "Converter de Peso Chileno a Peso argentino", " Converter de Peso Chileno a Reais" };

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

    public double converterPesoArgentino(double valor) {
        return this.PESOARGENTINO * valor;
    }

}
