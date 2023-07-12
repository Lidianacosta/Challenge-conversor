package br.com.conversor.modelo;

public class Dollar {
    /** valor do real no momento que foi feito o programa*/
    private  final double REAL = 4.89;
        /** valor do Euro no momento que foi feito o programa*/
        private final double EURO = 0.91;
        /** valor da Libras Estelinas no momento que foi feito o programa*/
        private final double LIBRASESTERLINAS = 0.77;
        /** valor do Peso argentino no momento que foi feito o programa*/
        private final double PESOARGENTINO = 263.31;
        /** valor do Peso Chileno no momento que foi feito o programa*/
        private final double PESOCHILENO = 814.21;

    public final String[] OPCOES_CONVERTER_MOEDAS = { "Converter de Dólar a Reais", "Converter de Dólar a Euro","Converter de Dólar a Libras Esterlinas", "Converter de Dólar a Peso argentino", " Converter de Dólar a Peso Chileno" };

    public  double converterReais(double valor) {
        return this.REAL * valor;
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

    public double converterPesoChileno(double valor) {
        return this.PESOCHILENO * valor;
    }

    
}
