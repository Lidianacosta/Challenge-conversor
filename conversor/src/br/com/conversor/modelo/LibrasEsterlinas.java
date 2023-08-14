package br.com.conversor.modelo;

public class LibrasEsterlinas implements ConversoesMoedas{
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
        return 1;
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
