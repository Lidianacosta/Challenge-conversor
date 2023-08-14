package br.com.conversor.implement;

import br.com.conversor.modelo.Celsius;
import br.com.conversor.modelo.Conversorr;
import br.com.conversor.modelo.Dollar;
import br.com.conversor.modelo.Euro;
import br.com.conversor.modelo.Fahrenheit;
import br.com.conversor.modelo.Kelvin;
import br.com.conversor.modelo.LibrasEsterlinas;
import br.com.conversor.modelo.PesoArgentino;
import br.com.conversor.modelo.PesoChileno;
import br.com.conversor.modelo.Real;
import br.com.conversor.modelo.ValorInvalidoException;
import br.com.conversor.modelo.InterfaceMenu;
import br.com.conversor.modelo.InvalideOpcaoException;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int sair = 1;
        double valorConvertido = 0;
        String escolha;
        Conversorr conversor = new Conversorr();

        do {

            escolha = InterfaceMenu.menu(Conversorr.OPCOES_DE_CONVERSAO);

            try {

                switch (escolha) {
                    case "Conversor de Moedas":
                        escolha = InterfaceMenu.menu(Conversorr.MOEDA_CONVERTER);

                        switch (escolha) {
                            case "Real":
                                escolha = InterfaceMenu.menu(Conversorr.OPCOES_CONVERTER_MOEDAS);
                                Conversorr.setEVerificaNumeroConverter(InterfaceMenu.valor());
                                valorConvertido = conversor.converterMoedas(escolha, new Real());

                                break;
                            case "Dollar":
                                escolha = InterfaceMenu.menu(Conversorr.OPCOES_CONVERTER_MOEDAS);
                                Conversorr.setEVerificaNumeroConverter(InterfaceMenu.valor());
                                valorConvertido = conversor.converterMoedas(escolha, new Dollar());

                                break;

                            case "Euro":

                                escolha = InterfaceMenu.menu(Conversorr.OPCOES_CONVERTER_MOEDAS);
                                Conversorr.setEVerificaNumeroConverter(InterfaceMenu.valor());
                                valorConvertido = conversor.converterMoedas(escolha, new Euro());

                                break;
                            case "Libras Esterlinas":
                                escolha = InterfaceMenu.menu(Conversorr.OPCOES_CONVERTER_MOEDAS);

                                Conversorr.setEVerificaNumeroConverter(InterfaceMenu.valor());
                                valorConvertido = conversor.converterMoedas(escolha, new LibrasEsterlinas());

                                break;
                            case "Peso argentino":
                                escolha = InterfaceMenu.menu(Conversorr.OPCOES_CONVERTER_MOEDAS);

                                Conversorr.setEVerificaNumeroConverter(InterfaceMenu.valor());
                                valorConvertido = conversor.converterMoedas(escolha, new PesoArgentino());

                                break;
                            case "Peso Chileno":

                                escolha = InterfaceMenu.menu(Conversorr.OPCOES_CONVERTER_MOEDAS);

                                Conversorr.setEVerificaNumeroConverter(InterfaceMenu.valor());
                                valorConvertido = conversor.converterMoedas(escolha, new PesoChileno());

                                break;

                            default:
                                break;
                        }
                        InterfaceMenu.mensagem(valorConvertido);
                        break;
                    case "Conversor de Temperatura":
                        escolha = InterfaceMenu.menu(Conversorr.CONVERTER_TEMPERATURA);
                        switch (escolha) {
                            case "Fahrenheit":
                                escolha = InterfaceMenu.menu(Conversorr.OPCOES_CONVERTER_TEMPERATURA);
                                Conversorr.setNumeroConverter(InterfaceMenu.valor());
                                valorConvertido = conversor.converterTemperatura(escolha, new Fahrenheit());
                                break;

                            case "Celsius":
                                escolha = InterfaceMenu.menu(Conversorr.OPCOES_CONVERTER_TEMPERATURA);
                                Conversorr.setNumeroConverter(InterfaceMenu.valor());
                                valorConvertido = conversor.converterTemperatura(escolha, new Celsius());
                                break;

                            case "Kelvin":
                                escolha = InterfaceMenu.menu(Conversorr.OPCOES_CONVERTER_TEMPERATURA);
                                Conversorr.setNumeroConverter(InterfaceMenu.valor());
                                valorConvertido = conversor.converterTemperatura(escolha, new Kelvin());
                                break;

                            default:
                                throw new InvalideOpcaoException();
                        }

                        InterfaceMenu.mensagem(valorConvertido, "#,##0.00" );
                        break;
                    default:
                        break;
                }

            } catch (NullPointerException e) {

            } catch( ValorInvalidoException | InvalideOpcaoException e){
                InterfaceMenu.mensagem(e);
            } finally {
                sair = InterfaceMenu.sair();
            }

        } while (sair == 0);
    }

}