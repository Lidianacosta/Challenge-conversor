package br.com.conversor.modelo;

public class PesoChileno implements ConversoesMoedas {
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
        return this.PESOARGENTINO;
    }
    @Override
    public double getPesoChileno() {
        return 1;
    }

}
