import java.util.Scanner;
public class Calculadora {

public static final String RESET = "\u001B[0m";
public static final String RED = "\u001B[31m";
public static final String GREEN = "\u001B[32m";
public static final String YELLOW = "\u001B[33m";
public static final String BLUE = "\u001B[34m";
public static final String CYAN = "\u001B[36m";
public static final String PURPLE = "\u001B[35m";
public static final String BOLD = "\u001B[1m";

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int opcao;
    double num1, num2, resultado;

    do {
        System.out.println(CYAN + "╔══════════════════════════════════════════════════╗");
        System.out.println("║               " + BOLD + "CALCULADORA JAVA SUPREME" + RESET + CYAN + "                      ║");
        System.out.println("╠══════════════════════════════════════════════════╣");
        System.out.println("   " + YELLOW + "Código" + RESET + "  ║          " + YELLOW + "Operação" + RESET + "           ");
        System.out.println("╠══════════════════════════════════════════════════╣");
        System.out.println("║     " + GREEN + "1" + RESET + "     ║ Soma                             ");
        System.out.println("║     " + GREEN + "2" + RESET + "     ║ Subtração                        ");
        System.out.println("║     " + GREEN + "3" + RESET + "     ║ Multiplicação                 ");
        System.out.println("║     " + GREEN + "4" + RESET + "     ║ Divisão                          ");
        System.out.println("║     " + RED + "0" + RESET + "     ║ Sair                            ");
        System.out.println("╚══════════════════════════════════════════════════╝" + RESET);
        System.out.print(BOLD + "  Escolha uma opção: " + RESET);
        opcao = sc.nextInt(); 

        if (opcao == 0) {
            System.out.println("\n" + PURPLE + "  Encerrando a calculadora... Até logo!" + RESET);
            break;
        }

        if (opcao < 0 || opcao > 4) {
            System.out.println(RED + "\n   Opção inválida! Tente novamente.\n" + RESET);
            continue;
        }

        System.out.print("\nDigite o primeiro número: ");
        num1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        num2 = sc.nextDouble();

        System.out.println(CYAN + "\n╔══════════════════════════════════════════════════╗" + RESET);

        switch (opcao) {
            case 1:
                resultado = num1 + num2;
                System.out.printf("║ Resultado da %sSoma%s:            %-15.2f║\n", GREEN, RESET, resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.printf("║ Resultado da %sSubtração%s:       %-15.2f║\n", YELLOW, RESET, resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.printf("║ Resultado da %sMultiplicação%s:   %-15.2f║\n", BLUE, RESET, resultado);
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("║ " + RED + "Erro: divisão por zero não é permitida!" + RESET + "     ║");
                } else {
                    resultado = num1 / num2;
                    System.out.printf("║ Resultado da %sDivisão%s:         %-15.2f║\n", PURPLE, RESET, resultado);
                }
                break;
        }

        System.out.println(CYAN + "╚══════════════════════════════════════════════════╝\n" + RESET);

    } while (opcao != 0);

    sc.close();
}
}

