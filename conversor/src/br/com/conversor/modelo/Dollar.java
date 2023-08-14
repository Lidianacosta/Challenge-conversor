package br.com.conversor.modelo;

public class Dollar implements ConversoesMoedas {

    /** valor do real no momento que foi feito o programa */
    private final double REAL = 4.89;
    /** valor do Euro no momento que foi feito o programa */
    private final double EURO = 0.91;
    /** valor da Libras Estelinas no momento que foi feito o programa */
    private final double LIBRASESTERLINAS = 0.77;
    /** valor do Peso argentino no momento que foi feito o programa */
    private final double PESOARGENTINO = 263.31;
    /** valor do Peso Chileno no momento que foi feito o programa */
    private final double PESOCHILENO = 814.21;

    @Override
    public double getReal() {
        return this.REAL;
    }
    @Override
    public double gatDollar() {
        return 1;
    }
    @Override
    public double getEuro() {
        return this.EURO;
    }
    @Override
    public double getLibrasEsterlinas() {
        return this.LIBRASESTERLINAS;
    }
    @Override
    public double getPesoArgentino() {
        return this.PESOARGENTINO;
    }
    @Override
    public double getPesoChileno() {
        return this.PESOCHILENO;
    }

}
