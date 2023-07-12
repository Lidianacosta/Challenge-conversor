package br.com.conversor.modelo;

public class Euro {
    /** valor do Real no momento que foi feito o programa */
    private final double REAL = 5.36;

    /** valor do dollar no momento que foi feito o programa */
    private final double DOLLAR = 1.10;
    /** valor da Libras Estelinas no momento que foi feito o programa */
    private final double LIBRASESTERLINAS = 0.85;
    /** valor do Peso argentino no momento que foi feito o programa */
    private final double PESOARGENTINO = 289.48;
    /** valor do Peso Chileno no momento que foi feito o programa */
    private final double PESOCHILENO = 895.53;

    public final String[] OPCOES_CONVERTER_MOEDAS = { "Converter de Euro a Dólar", "Converter de Euro a Reais",
            "Converter de Euro a Libras Esterlinas", "Converter de Euro a Peso argentino",
            " Converter de Euro a Peso Chileno" };

    public double converterReais(double valor) {
        return this.REAL * valor;
    }

    public double converterDollar(double valor) {
        return this.DOLLAR * valor;
    }

    public double converterLibrasEsterlinas(double valor) {
        return this.LIBRASESTERLINAS * valor;
    }

    public double converterPesoArgentino(double valor) {
        return this.PESOARGENTINO * valor;
    }

    public double converterPesoChileno(double valor) {
        return this.PESOCHILENO * valor;
    }

}
