// Declarando o pacote onde a classe esta localizada
package module;
// Importando excessão
import exceptions.ValueInvalidException;

// Criação da Classe
public class Calculadora {
    // Declarando os Metodos
    // Menu
    public String menu() {
        return"Calculadora"
            + "\n[1] Somar"
            + "\n[2] Subtrair"
            + "\n[3] Dividir"
            + "\n[4] Multiplicar"
            + "\n[5] Sair";
    }
    // Soma
    public int somar(int numero1, int numero2) {
        return numero1 + numero2;
    }
    // Divisao
    public double dividir(int numero1, int numero2) throws ValueInvalidException {
        if (numero2 == 0) {
            throw new ValueInvalidException("O Valor do dividendo não pode ser 0!");
        } else {
            return (double) numero1 / numero2;
        }
    }
    // Subtracao
    public int subtrair(int numero1, int numero2) {
        return numero1 - numero2;
    }
    // Multiplicacao
    public int mutiplicar(int numero1, int numero2) {
        return numero1 * numero2;
    }
}
