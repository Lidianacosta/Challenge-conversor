package br.com.conversor.modelo;

public class PesoArgentino implements ConversoesMoedas {
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

    @Override
    public double getReal() {
        return this.REAL;
    }
    @Override
    public double gatDollar() {
        return this.DOLLAR;
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
        return 1;
    }
    @Override
    public double getPesoChileno() {
        return this.PESOCHILENO;
    }
}
