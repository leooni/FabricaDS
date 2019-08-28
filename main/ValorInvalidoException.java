//Classe com a exeção que verifica se os dados são válidos

package main;

class ValorInvalidoException extends RuntimeException {
    ValorInvalidoException(String message) {
        super(message);
    }
}
