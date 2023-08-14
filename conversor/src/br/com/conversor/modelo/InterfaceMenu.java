package br.com.conversor.modelo;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class InterfaceMenu {

    public static String menu(String[] opcoesDeConversao){
        return (String) JOptionPane.showInputDialog(null, "Qual tipo de conversão", "Escolha de Conversão", -1, null,opcoesDeConversao, null);
    }

    public static String valor(){
        return  JOptionPane.showInputDialog("qual o valor da conversão");
    }

    public static int sair(){
        return JOptionPane.showConfirmDialog(null, "Deseja continuar ?", "sair", 0);
    }

    public static void mensagem(Object mensagem){
        JOptionPane.showMessageDialog(null,mensagem);
    }

    public static void mensagem(Object mensagem,String format ){
        JOptionPane.showMessageDialog(null, new DecimalFormat(format).format(mensagem));
    }
}
