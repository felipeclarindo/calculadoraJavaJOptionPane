// Declarando o pacote onde a classe está localizada
package exceptions;

// Criando uma nova exceção personalizada chamada ValueInvalidException
public class ValueInvalidException extends Exception {
    // Método Construtor que recebe uma mensagem de erro
    public ValueInvalidException(String message) {
        // Chama o construtor da superclasse (Exception) com a mensagem de erro
        super(message);
    }
}
