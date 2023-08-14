package br.com.conversor.modelo;

public class InvalideOpcaoException extends RuntimeException {
    
    public InvalideOpcaoException(){
        super("A escolha não estar nos cases previstos!");
    }

    @Override
    public String toString() {
        return "A escolha não estar nos cases previstos!";
    }
}
