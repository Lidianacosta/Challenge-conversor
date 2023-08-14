package br.com.conversor.modelo;

public class Conversorr {

    /** escolha da conversão */
    public final static String[] OPCOES_DE_CONVERSAO = { "Conversor de Moedas", "Conversor de Temperatura" };
    /** Escolha qual moeda para conversão */
    public static final String[] MOEDA_CONVERTER = { "Real", "Dollar", "Euro", "Libras Esterlinas", "Peso argentino", "Peso Chileno" };

    public static final String[] CONVERTER_TEMPERATURA = {"Kelvin", "Fahrenheit", "Celsius" };

    public static final String[] OPCOES_CONVERTER_TEMPERATURA = {"Converter para Kelvin", "Converter para Fahrenheit", "Converter para Celsius" };

    public static final String[] OPCOES_CONVERTER_MOEDAS = { "Converter para Real", "Converter para Dollar", "Converter para Euro", "Converter para Libras Esterlinas", "Converter para Peso argentino", " Converter para Peso Chileno" };

    private static double valorParaConverter;

    public static void setValorParaConverter(double valorParaConverter) {
        Conversorr.valorParaConverter = valorParaConverter;
    }

    public double converterMoedas(String opcao, ConversoesMoedas object) throws InvalideOpcaoException {

        switch (opcao) {
            case "Converter para Real":

                return object.getReal() * Conversorr.valorParaConverter;

            case "Converter para Dollar":

                return object.gatDollar() * Conversorr.valorParaConverter;

            case "Converter para Euro":

                return object.getEuro() * Conversorr.valorParaConverter;

            case "Converter para Libras Esterlinas":

                return object.getLibrasEsterlinas() * Conversorr.valorParaConverter;

            case "Converter para Peso Argentino":

                return object.getPesoArgentino() * Conversorr.valorParaConverter;

            case "Converter para Peso Chileno":

                return object.getPesoChileno() * Conversorr.valorParaConverter;
            default:
                throw new InvalideOpcaoException();
        }
    }

    public double converterTemperatura(String opcao, ConversoesTemperatura object) throws InvalideOpcaoException {

        switch (opcao) {
            case "Converter para Fahrenheit":

                return object.ConverterParaFahrenheit(Conversorr.valorParaConverter);

            case "Converter para Celsius":

                return object.ConverterParaCelsius(Conversorr.valorParaConverter);

            case "Converter para Kelvin":

                return object.ConverterParaKelvin(Conversorr.valorParaConverter);

            default:
                throw new InvalideOpcaoException();
        }
    }

    public static double ConverterNumeroDouble(String valor) {
        return Double.parseDouble(valor);
    }

    public static double trataNumero(String valor) throws ValorInvalidoException {
        double valorConvertido = 0;
        try {
            valorConvertido = ConverterNumeroDouble(valor);
            if (Conversorr.isvalidNunber(valorConvertido))
                return valorConvertido;
        } catch (NumberFormatException e) {
            throw new ValorInvalidoException();
        }
        throw new ValorInvalidoException();
    }

    public static void setEVerificaNumeroConverter(String valor) {
        setValorParaConverter(trataNumero(valor));
    }

    public static void setNumeroConverter(String valor) {
        setValorParaConverter(ConverterNumeroDouble(valor));
    }

    public static boolean isvalidNunber(double valor) {
        return (valor >= 0);
    }
}
