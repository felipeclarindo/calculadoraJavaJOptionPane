// Importações necessárias
import javax.swing.JOptionPane; // Para exibir caixas de diálogo
import module.Calculadora; // Classe que contém as operações da calculadora
import exceptions.ValueInvalidException; // Exceção personalizada para tratar valores inválidos

// Classe principal que contém o método main
public class Main {
    public static void main(String[] args) {
        // Instância da Calculadora para realizar as operações
        Calculadora calc = new Calculadora();
        
        // Variável para controlar a continuidade do programa
        boolean continuar = true;
        
        // Variáveis para armazenar os números informados pelo usuário
        int numero1, numero2;
        
        // Variável para armazenar o input do usuário
        String input;
        
        // Loop principal do programa
        while (continuar) {
            try {
                // Exibe o menu da calculadora 
                input = JOptionPane.showInputDialog(null, calc.menu());
                // Verifica se o usuario selecionou cancelar ou fechou a janela
                if (input == null) {
                    // Verifica se ele deseja mesmo sair
                    int confirmacao = JOptionPane.showConfirmDialog(null, "Deseja mesmo sair? ");
                    // Verifica a resposta do usuario
                    if (confirmacao == 0) {
                        // Encerra o programa
                        JOptionPane.showMessageDialog(null, "Programa Finalizado!"); // Mostra a mensagem "Programa Finalizado!"
                        continuar = false; // Encera o loop 
                        break; // Para o codigo
                    }
                }
                // Obtém a opção do usuário
                int opcao = Integer.parseInt(input);

                // Executa a operação correspondente à opção escolhida
                switch (opcao) {
                    case 1:
                        // Solicita os números para realizar a soma
                        input = JOptionPane.showInputDialog(null, "Informe o primeiro valor: ");
                        numero1 = Integer.parseInt(input);
                        input = JOptionPane.showInputDialog(null, "Informe o segundo valor: ");
                        numero2 = Integer.parseInt(input);

                        // Realiza a soma e exibe o resultado
                        int resultadoSoma = calc.somar(numero1, numero2);
                        JOptionPane.showMessageDialog(null, "A soma de " + numero1 + " e " + numero2 + " é igual a: " + resultadoSoma);
                        break;

                    case 2:
                        // Solicita os números para realizar a subtração
                        input = JOptionPane.showInputDialog(null, "Informe o primeiro número: ");
                        numero1 = Integer.parseInt(input);
                        input = JOptionPane.showInputDialog(null, "Informe o segundo valor: ");
                        numero2 = Integer.parseInt(input);

                        // Realiza a subtração e exibe o resultado
                        int resultadoSubtracao = calc.subtrair(numero1, numero2);
                        JOptionPane.showMessageDialog(null, "A subtração de " + numero1 + " e " + numero2 + " é igual : " + resultadoSubtracao);
                        break;
                        
                    case 3:
                        // Solicita os números para realizar a divisão
                        input = JOptionPane.showInputDialog(null, "Informe o primeiro valor: ");
                        numero1 = Integer.parseInt(input);
                        input = JOptionPane.showInputDialog(null, "Informe o segundo valor: ");
                        numero2 = Integer.parseInt(input);
                        
                        // Realiza a divisão e exibe o resultado
                        double resultadoDivisao = calc.dividir(numero1, numero2);
                        JOptionPane.showMessageDialog(null, "A divisão de " + numero1 + " e " + numero2 + " é igual a: " + resultadoDivisao);
                        break;

                    case 4: 
                        // Solicita os números para realizar a multiplicação
                        input = JOptionPane.showInputDialog(null, "Informe o primeiro número: ");
                        numero1 = Integer.parseInt(input);
                        input = JOptionPane.showInputDialog(null, "Informe o segundo número: ");
                        numero2 = Integer.parseInt(input);

                        // Realiza a multiplicação e exibe o resultado
                        int resultadoMultiplicacao = calc.mutiplicar(numero1, numero2);
                        JOptionPane.showMessageDialog(null, "A multiplicação de " + numero1 + " e " + numero2 + " é igual a: " + resultadoMultiplicacao);
                        break;

                    case 5 :
                        // Pede uma confirmação do usuario para finalizar o programa
                        int confirmar = JOptionPane.showConfirmDialog(null, "Deseja mesmo sair? ");
                        if (confirmar == 0) {
                            JOptionPane.showMessageDialog(null, "Programa Encerrado! ");
                            continuar = false; // Encerra o loop e finaliza o programa
                            break;
                        } else {
                            continue; // Volta para o início do loop e exibe o menu novamente
                        }

                    default:
                        JOptionPane.showMessageDialog(null, "Opção Inválida"); // Mensagem de erro para opções inválidas
                        break;
                }
            } catch (ValueInvalidException e) {
                JOptionPane.showMessageDialog(null, "O Valor do dividendo não pode ser 0!"); // Exibe mensagem de erro para divisão por zero
            } catch(NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, Informe um valor válido!"); // Exibe mensagem de erro para valores inválidos
            }
        }
    }
}
