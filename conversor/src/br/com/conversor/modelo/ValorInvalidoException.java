package br.com.conversor.modelo;

public class ValorInvalidoException extends RuntimeException{
    public ValorInvalidoException(){
        super("valor invalido");
    }

    @Override
    public String toString() {
        return "Valor Invalido";
    }
}
