package br.com.conversor.modelo;

public class Euro implements ConversoesMoedas{
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
        return 1;
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
