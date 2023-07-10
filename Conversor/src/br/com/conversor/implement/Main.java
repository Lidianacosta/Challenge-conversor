package br.com.conversor.implement;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import br.com.conversor.modelo.Conversor;

public class Main {
    public static void main(String[] args) {

        String qualValorConverter;
        double valorConvertido = 0;
        String retornoParaConverter;
        int sair = 1;

    
        do {

            String escolhaDaConvercao = (String) JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu", -1, null, Conversor.OPCOES_DE_CONVERSAO, Conversor.OPCOES_DE_CONVERSAO);

            if (escolhaDaConvercao == null)
                return;

            switch (escolhaDaConvercao) {
                case "Conversor de Moedas":

                    qualValorConverter = (String) JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu", -1, null, Conversor.OPCOES_CONVERTER_MOEDAS, args);

                    if (qualValorConverter == null)
                        return;
                
                    while (true) {

                        retornoParaConverter = (String) JOptionPane.showInputDialog("qual o valor da conversão");
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

                            JOptionPane.showMessageDialog(null,Conversor.ConverterValor(Conversor.DOLLAR, valorConvertido) , "mensagem", 1);

                            break;
                        case "Converter de Reais a Euro":

                            JOptionPane.showMessageDialog(null, Conversor.ConverterValor(Conversor.EURO, valorConvertido), "mensagem", 1);

                            break;
                        case "Converter de Reais a Libras Esterlinas":
                            
                            JOptionPane.showMessageDialog(null, Conversor.ConverterValor(Conversor.LIBRASESTERLINAS, valorConvertido), "mensagem", 1);

                            break;

                        case "Converter de Reais a Peso argentino":

                            JOptionPane.showMessageDialog(null, Conversor.ConverterValor(Conversor.PESOARGENTINO, valorConvertido), "mensagem", 1);

                            break;

                        case "Converter de Reais a Peso Chileno":

                            JOptionPane.showMessageDialog(null, Conversor.ConverterValor(Conversor.PESOCHILENO, valorConvertido), "mensagem", 1);

                            break;

                        default:
                            break;
                    }

                    break;

                case "Conversor de Temperatura":

                    qualValorConverter = (String) JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu", -1, null, Conversor.OPCOES_CONVERTER_TEMPERATURA, args);

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

                        JOptionPane.showMessageDialog(null, new DecimalFormat("#,##0.00").format(Conversor.celsiusFahrenheit(valorConvertido)) + " °F", "mensagem", 1);
                            break;
                        
                        case "Converter de Celsius a Kelvin":

                        JOptionPane.showMessageDialog(null, new DecimalFormat("#,##0.00").format(Conversor.celsiusKelvin(valorConvertido))  + " K", "mensagem", 1);
                            break;
                        
                        case  "Converter de Fahrenheit a Celsius":
                        JOptionPane.showMessageDialog(null,new DecimalFormat("#,##0.00").format(Conversor.fahrenheitCelsius(valorConvertido)) + " °C", "mensagem", 1);
                            break;

                        case "Converter de Fahrenheit a Kelvin":
                        JOptionPane.showMessageDialog(null, new DecimalFormat("#,##0.00").format(Conversor.fahrenheitKelvin(valorConvertido)) + " K", "mensagem", 1);
                            break;
                        
                        case "Converter de Kelvin a Fahrenheit":
                        JOptionPane.showMessageDialog(null, new DecimalFormat("#,##0.00").format(Conversor.kelvinFahrenheit(valorConvertido))  + " °F", "mensagem", 1);
                            break;
                        
                        case "Converter de Kelvin a Celsius":
                        JOptionPane.showMessageDialog(null, new DecimalFormat("#,##0.00").format(Conversor.kelvinCelsius(valorConvertido))  + " °C", "mensagem", 1);
                            break;

                        default:
                            break;
                    }
                    
                    break;

                default:
                    break;
            }
            sair = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Sair ou Continuar", 0);
            if(sair == -1)
                break;
        } while (sair != 1);

        JOptionPane.showMessageDialog(null, "Programa finalizado");

    }

}
