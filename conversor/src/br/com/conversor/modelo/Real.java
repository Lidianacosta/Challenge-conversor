package br.com.conversor.modelo;

public class Real  implements ConversoesMoedas {

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
    @Override
    public double getReal() {
        return 1;
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
        return this.PESOCHILENO;
    }

}
