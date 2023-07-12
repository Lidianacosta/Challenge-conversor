package br.com.conversor.implement;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import br.com.conversor.modelo.Conversor;

public class Main {
    public static void main(String[] args) {

        String qualValorConverter;
        double valorConvertido = 0;
        String retornoParaConverter;
        String qualMoedaConveter;
        String escolhaDaConvercao;
        int sair = 1;

        do {

            escolhaDaConvercao = (String) JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu", -1, null,
                    Conversor.OPCOES_DE_CONVERSAO, Conversor.OPCOES_DE_CONVERSAO);

            if (escolhaDaConvercao == null)
                return;

            switch (escolhaDaConvercao) {
                case "Conversor de Moedas":

                    qualMoedaConveter = (String) JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu", -1,
                            null, Conversor.MOEDA_CONVERTER, args);

                    if (qualMoedaConveter == null)
                        return;

                    switch (qualMoedaConveter) {
                        case "Reais":

                            qualValorConverter = (String) JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu",
                                    -1, null, Conversor.converterParaReais.OPCOES_CONVERTER_MOEDAS, args);

                            if (qualValorConverter == null)
                                return;

                            while (true) {

                                retornoParaConverter = (String) JOptionPane
                                        .showInputDialog("qual o valor da conversão");
                                if (retornoParaConverter == null)
                                    return;

                                try {

                                    valorConvertido = Double.parseDouble(retornoParaConverter);
                                    if (valorConvertido >= 0)
                                        break;
                                    else
                                        JOptionPane.showMessageDialog(null, "Valor inválido", "mensagem", 1);

                                } catch (NumberFormatException e) {
                                    JOptionPane.showMessageDialog(null, "Valor inválido", "mensagem", 1);
                                }

                            }
                            switch (qualValorConverter) {
                                case "Converter de Reais a Dólar":

                                    JOptionPane.showMessageDialog(null,
                                            Conversor.converterParaReais.converterDollar(valorConvertido), "mensagem",
                                            1);
                                    // Conversor.ConverterValor(Conversor.DOLLAR, valorConvertido)
                                    break;
                                case "Converter de Reais a Euro":

                                    JOptionPane.showMessageDialog(null,
                                            Conversor.converterParaReais.converterEuro(valorConvertido), "mensagem",
                                            1);

                                    break;
                                case "Converter de Reais a Libras Esterlinas":

                                    JOptionPane.showMessageDialog(null,
                                            Conversor.converterParaReais.converterLibrasEsterlinas(valorConvertido),
                                            "mensagem", 1);

                                    break;

                                case "Converter de Reais a Peso argentino":

                                    JOptionPane.showMessageDialog(null,
                                            Conversor.converterParaReais.converterPesoArgentino(valorConvertido),
                                            "mensagem", 1);

                                    break;

                                case "Converter de Reais a Peso Chileno":

                                    JOptionPane.showMessageDialog(null,
                                            Conversor.converterParaReais.converterPesoClileno(valorConvertido),
                                            "mensagem", 1);

                                    break;

                                default:
                                    break;
                            }
                            break;

                        case "Dollar":
                            qualValorConverter = (String) JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu",
                                    -1, null, Conversor.converterParaDollar.OPCOES_CONVERTER_MOEDAS, args);

                            if (qualValorConverter == null)
                                return;

                            while (true) {

                                retornoParaConverter = (String) JOptionPane
                                        .showInputDialog("qual o valor da conversão");
                                if (retornoParaConverter == null)
                                    return;

                                try {

                                    valorConvertido = Double.parseDouble(retornoParaConverter);
                                    if (valorConvertido >= 0)
                                        break;
                                    else
                                        JOptionPane.showMessageDialog(null, "Valor inválido", "mensagem", 1);

                                } catch (NumberFormatException e) {
                                    JOptionPane.showMessageDialog(null, "Valor inválido", "mensagem", 1);
                                }

                            }
                            switch (qualValorConverter) {
                                case "Converter de Dólar a Reais":

                                    JOptionPane.showMessageDialog(null,
                                            Conversor.converterParaDollar.converterReais(valorConvertido), "mensagem",
                                            1);
                                    
                                    break;
                                case "Converter de Dólar a Euro":

                                    JOptionPane.showMessageDialog(null,
                                    Conversor.converterParaDollar.converterEuro(valorConvertido), "mensagem",
                                            1);

                                    break;
                                case "Converter de Dólar a Libras Esterlinas":

                                    JOptionPane.showMessageDialog(null,
                                    Conversor.converterParaDollar.converterLibrasEsterlinas(valorConvertido),
                                            "mensagem", 1);

                                    break;

                                case "Converter de Dólar a Peso argentino":

                                    JOptionPane.showMessageDialog(null,
                                    Conversor.converterParaDollar.converterPesoArgentino(valorConvertido),
                                            "mensagem", 1);

                                    break;

                                case "Converter de Dólar a Peso Chileno":

                                    JOptionPane.showMessageDialog(null,
                                    Conversor.converterParaDollar.converterPesoChileno(valorConvertido),
                                            "mensagem", 1);

                                    break;

                                default:
                                    break;
                            }
                            break;

                        case "Euro":

                            qualValorConverter = (String) JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu",
                                    -1, null, Conversor.converterParaEuro.OPCOES_CONVERTER_MOEDAS, args);

                            if (qualValorConverter == null)
                                return;

                            while (true) {

                                retornoParaConverter = (String) JOptionPane
                                        .showInputDialog("qual o valor da conversão");
                                if (retornoParaConverter == null)
                                    return;

                                try {

                                    valorConvertido = Double.parseDouble(retornoParaConverter);
                                    if (valorConvertido >= 0)
                                        break;
                                    else
                                        JOptionPane.showMessageDialog(null, "Valor inválido", "mensagem", 1);

                                } catch (NumberFormatException e) {
                                    JOptionPane.showMessageDialog(null, "Valor inválido", "mensagem", 1);
                                }

                            }
                            switch (qualValorConverter) {
                                case "Converter de Euro a Dólar":

                                    JOptionPane.showMessageDialog(null,
                                            Conversor.converterParaEuro.converterDollar(valorConvertido), "mensagem",
                                            1);
                                    break;
                                case "Converter de Euro a Reais":

                                    JOptionPane.showMessageDialog(null,
                                            Conversor.converterParaEuro.converterReais(valorConvertido), "mensagem",
                                            1);

                                    break;
                                case "Converter de Euro a Libras Esterlinas":

                                    JOptionPane.showMessageDialog(null,
                                            Conversor.converterParaEuro.converterLibrasEsterlinas(valorConvertido),
                                            "mensagem", 1);

                                    break;

                                case "Converter de Euro a Peso argentino":

                                    JOptionPane.showMessageDialog(null,
                                            Conversor.converterParaEuro.converterPesoArgentino(valorConvertido),
                                            "mensagem", 1);

                                    break;

                                case "Converter de Euro a Peso Chileno":

                                    JOptionPane.showMessageDialog(null,
                                            Conversor.converterParaEuro.converterPesoChileno(valorConvertido),
                                            "mensagem", 1);

                                    break;

                                default:
                                    break;
                            }
                            break;

                        case "Libras Esterlinas":
                            qualValorConverter = (String) JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu",
                                    -1, null, Conversor.converterParaLibrasEsterlinas.OPCOES_CONVERTER_MOEDAS, args);

                            if (qualValorConverter == null)
                                return;

                            while (true) {

                                retornoParaConverter = (String) JOptionPane
                                        .showInputDialog("qual o valor da conversão");
                                if (retornoParaConverter == null)
                                    return;

                                try {

                                    valorConvertido = Double.parseDouble(retornoParaConverter);
                                    if (valorConvertido >= 0)
                                        break;
                                    else
                                        JOptionPane.showMessageDialog(null, "Valor inválido", "mensagem", 1);

                                } catch (NumberFormatException e) {
                                    JOptionPane.showMessageDialog(null, "Valor inválido", "mensagem", 1);
                                }

                            }
                            switch (qualValorConverter) {
                                case "Converter de Libras Esterlinas a Dólar":

                                    JOptionPane.showMessageDialog(null,
                                            Conversor.converterParaLibrasEsterlinas.converterDollar(valorConvertido), "mensagem",
                                            1);
                                    // Conversor.ConverterValor(Conversor.DOLLAR, valorConvertido)
                                    break;
                                case "Converter de Libras Esterlinas a Euro":

                                    JOptionPane.showMessageDialog(null,
                                            Conversor.converterParaLibrasEsterlinas.converterEuro(valorConvertido), "mensagem",
                                            1);

                                    break;
                                case "Converter de Libras Esterlinas a Reais":

                                    JOptionPane.showMessageDialog(null,
                                            Conversor.converterParaLibrasEsterlinas.converterReais(valorConvertido),
                                            "mensagem", 1);

                                    break;

                                case "Converter de Libras Esterlinas a Peso argentino":

                                    JOptionPane.showMessageDialog(null,
                                            Conversor.converterParaLibrasEsterlinas.converterPesoArgentino(valorConvertido),
                                            "mensagem", 1);

                                    break;

                                case "Converter de Libras Esterlinas a Peso Chileno":

                                    JOptionPane.showMessageDialog(null,
                                            Conversor.converterParaLibrasEsterlinas.converterPesoClileno(valorConvertido),
                                            "mensagem", 1);

                                    break;

                                default:
                                    break;
                            }
                            break;

                        case "Peso Argentino":
                            qualValorConverter = (String) JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu",
                                    -1, null, Conversor.converterParaPesoArgentino.OPCOES_CONVERTER_MOEDAS, args);

                            if (qualValorConverter == null)
                                return;

                            while (true) {

                                retornoParaConverter = (String) JOptionPane
                                        .showInputDialog("qual o valor da conversão");
                                if (retornoParaConverter == null)
                                    return;

                                try {

                                    valorConvertido = Double.parseDouble(retornoParaConverter);
                                    if (valorConvertido >= 0)
                                        break;
                                    else
                                        JOptionPane.showMessageDialog(null, "Valor inválido", "mensagem", 1);

                                } catch (NumberFormatException e) {
                                    JOptionPane.showMessageDialog(null, "Valor inválido", "mensagem", 1);
                                }

                            }
                            switch (qualValorConverter) {
                                case "Converter de Peso Argentino a Dólar":

                                    JOptionPane.showMessageDialog(null,
                                            Conversor.converterParaPesoArgentino.converterDollar(valorConvertido), "mensagem",
                                            1);
                                    // Conversor.ConverterValor(Conversor.DOLLAR, valorConvertido)
                                    break;
                                case "Converter de Peso Argentino a Euro":

                                    JOptionPane.showMessageDialog(null,
                                            Conversor.converterParaPesoArgentino.converterEuro(valorConvertido), "mensagem",
                                            1);

                                    break;
                                case "Converter de Peso Argentino a Libras Esterlinas":

                                    JOptionPane.showMessageDialog(null,
                                            Conversor.converterParaPesoArgentino.converterLibrasEsterlinas(valorConvertido),
                                            "mensagem", 1);

                                    break;

                                case "Converter de Peso Argentino a Reais":

                                    JOptionPane.showMessageDialog(null,
                                            Conversor.converterParaPesoArgentino.converterReais(valorConvertido),
                                            "mensagem", 1);

                                    break;

                                case "Converter de Peso Argentino a Peso Chileno":

                                    JOptionPane.showMessageDialog(null,
                                            Conversor.converterParaPesoArgentino.converterPesoClileno(valorConvertido),
                                            "mensagem", 1);

                                    break;

                                default:
                                    break;
                            }
                            break;

                        case "Peso Chileno":
                            qualValorConverter = (String) JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu",
                                    -1, null, Conversor.converterParaPesoChileno.OPCOES_CONVERTER_MOEDAS, args);

                            if (qualValorConverter == null)
                                return;

                            while (true) {

                                retornoParaConverter = (String) JOptionPane
                                        .showInputDialog("qual o valor da conversão");
                                if (retornoParaConverter == null)
                                    return;

                                try {

                                    valorConvertido = Double.parseDouble(retornoParaConverter);
                                    if (valorConvertido >= 0)
                                        break;
                                    else
                                        JOptionPane.showMessageDialog(null, "Valor inválido", "mensagem", 1);

                                } catch (NumberFormatException e) {
                                    JOptionPane.showMessageDialog(null, "Valor inválido", "mensagem", 1);
                                }

                            }
                            switch (qualValorConverter) {
                                case "Converter de Peso Chileno a Dólar":

                                    JOptionPane.showMessageDialog(null,
                                            Conversor.converterParaPesoChileno.converterDollar(valorConvertido), "mensagem",
                                            1);
                                    
                                    break;
                                case "Converter de Peso Chileno a Euro":

                                    JOptionPane.showMessageDialog(null,
                                            Conversor.converterParaPesoChileno.converterEuro(valorConvertido), "mensagem",
                                            1);

                                    break;
                                case "Converter de Peso Chileno a Libras Esterlinas":

                                    JOptionPane.showMessageDialog(null,
                                            Conversor.converterParaPesoChileno.converterLibrasEsterlinas(valorConvertido),
                                            "mensagem", 1);

                                    break;

                                case "Converter de Peso Chileno a Peso argentino":

                                    JOptionPane.showMessageDialog(null,
                                            Conversor.converterParaPesoChileno.converterPesoArgentino(valorConvertido),
                                            "mensagem", 1);

                                    break;

                                case "Converter de Peso Chileno a Reais":

                                    JOptionPane.showMessageDialog(null,
                                            Conversor.converterParaPesoChileno.converterReais(valorConvertido),
                                            "mensagem", 1);

                                    break;

                                default:
                                    break;
                            }
                            break;
                        default:
                            break;
                    }

                    break;

                case "Conversor de Temperatura":

                    qualValorConverter = (String) JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu", -1,
                            null, Conversor.OPCOES_CONVERTER_TEMPERATURA, args);

                    if (qualValorConverter == null)
                        return;

                    while (true) {

                        retornoParaConverter = (String) JOptionPane.showInputDialog("qual o valor da conversão");

                        if (retornoParaConverter == null)
                            return;

                        try {
                            valorConvertido = Double.parseDouble(retornoParaConverter);
                            break;
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "Valor inválido", "mensagem", 1);
                        }
                    }

                    switch (qualValorConverter) {
                        case "Converter de Celsius a Fahrenheit":

                            JOptionPane.showMessageDialog(null,
                                    new DecimalFormat("#,##0.00").format(Conversor.celsiusFahrenheit(valorConvertido))
                                            + " °F",
                                    "mensagem", 1);
                            break;

                        case "Converter de Celsius a Kelvin":

                            JOptionPane.showMessageDialog(null,
                                    new DecimalFormat("#,##0.00").format(Conversor.celsiusKelvin(valorConvertido))
                                            + " K",
                                    "mensagem", 1);
                            break;

                        case "Converter de Fahrenheit a Celsius":
                            JOptionPane.showMessageDialog(null,
                                    new DecimalFormat("#,##0.00").format(Conversor.fahrenheitCelsius(valorConvertido))
                                            + " °C",
                                    "mensagem", 1);
                            break;

                        case "Converter de Fahrenheit a Kelvin":
                            JOptionPane.showMessageDialog(null,
                                    new DecimalFormat("#,##0.00").format(Conversor.fahrenheitKelvin(valorConvertido))
                                            + " K",
                                    "mensagem", 1);
                            break;

                        case "Converter de Kelvin a Fahrenheit":
                            JOptionPane.showMessageDialog(null,
                                    new DecimalFormat("#,##0.00").format(Conversor.kelvinFahrenheit(valorConvertido))
                                            + " °F",
                                    "mensagem", 1);
                            break;

                        case "Converter de Kelvin a Celsius":
                            JOptionPane.showMessageDialog(null,
                                    new DecimalFormat("#,##0.00").format(Conversor.kelvinCelsius(valorConvertido))
                                            + " °C",
                                    "mensagem", 1);
                            break;

                        default:
                            break;
                    }

                    break;

                default:
                    break;
            }
            sair = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Sair ou Continuar", 0);
            if (sair == -1)
                break;
        } while (sair != 1);

        JOptionPane.showMessageDialog(null, "Programa finalizado");

    }

}
