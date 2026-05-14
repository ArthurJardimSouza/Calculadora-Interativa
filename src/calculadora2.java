import java.util.Scanner;

public class calculadora2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean sair = false;

		while (sair == false) {
			System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
			System.out.println("                                   [   CALCMASTER 3000   ]");
			System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
			System.out.println("");
			System.out.println("==================TECLADO===================");
			System.out
					.println("|                               [1]       [2]       [3]           [+]                  ");
			System.out.println(
					"|                               [4]       [5]       [6]           [-]                   ");
			System.out.println(
					"|                               [7]       [8]       [9]           [*]                   ");
			System.out
					.println("|                               [0]       [.]        [R]          [^]                  ");
			System.out
					.println("|                               [Enter]            [/]                                 ");
			System.out.println("============================================");
			System.out.println(" Escolha a operação (+, - , * , ^ , R , / ) ou pressione 0 para sair: ");
			String escolha = input.nextLine();
			if (escolha.equals("0")) {
				System.out.println("Fim do programa. ");
				break;
			}

			else if (escolha.equals("+")) {

				System.out.println("Informe o primeiro número da equação ");
				int num1 = input.nextInt();

				System.out.println("Informe o segundo número da equação ");
				int num2 = input.nextInt();

				double resultado = num1 + num2;
				input.nextLine();

				System.out.println("============================================");

				System.out.println(
						" |                                        Processando...                                            |");

				System.out.println("============================================");

				System.out.println("|                                    Resultado da Adição: " + resultado
						+ "                                  |");

				System.out.println("============================================");
				System.out.println("|                                        Fim da Operação !"
						+ "                                        |");
				System.out.println("============================================");
				System.out.println("|      pressione 0 para sair ou qualquer tecla para voltar ao menu      |");
				String escolha2 = input.nextLine();
				System.out.println("");
				for (int i = 0; i < 40; i++) {
					System.out.println("");
				}
				if (escolha2.equals("0")) {
					System.out.println("============================================");
					System.out.println(
							"|                                        Fim do programa!                                         |");
					System.out.println("============================================");
					sair = true;
					break;

				}

			} else if (escolha.equals("-")) {

				System.out.println("Informe o primeiro número da equação  ");
				int num1 = input.nextInt();

				System.out.println("Informe o segundo número da equação  ");
				int num2 = input.nextInt();

				double resultado = num1 - num2;
				input.nextLine();

				System.out.println("============================================");

				System.out.println(
						" |                                         Processando...                                            |");

				System.out.println("============================================");

				System.out.println("|                                    Resultado da Subtração: " + resultado
						+ "                                  |");

				System.out.println("============================================");
				System.out.println("|                                        Fim da Operação !"
						+ "                                        |");
				System.out.println("============================================");
				System.out.println("| pressione 0 para sair ou qualquer tecla para voltar ao menu | ");
				String escolha2 = input.nextLine();
				System.out.println("============================================");
				System.out.println("");
				for (int i = 0; i < 40; i++) {
					System.out.println("");
				}
				if (escolha2.equals("0")) {
					System.out.println("============================================");
					System.out.println(
							"|                                        Fim do programa!                                        |");
					System.out.println("============================================");
					sair = true;
					break;

				}

			} else if (escolha.equals("*")) {

				System.out.println("Informe o primeiro número da equação  ");
				int num1 = input.nextInt();

				System.out.println("Informe o segundo número da equação  ");
				int num2 = input.nextInt();

				double resultado = num1 * num2;
				input.nextLine();

				System.out.println("============================================");

				System.out.println(
						" |                                         Processando...                                            |");

				System.out.println("============================================");

				System.out.println("|                                    Resultado da Multiplicação: " + resultado
						+ "                                  |");

				System.out.println("============================================");
				System.out.println("|                                        Fim da Operação !"
						+ "                                        |");
				System.out.println("============================================");
				System.out.println("| pressione 0 para sair ou enter para voltar ao menu | ");
				String escolha2 = input.nextLine();
				System.out.println("============================================");
				System.out.println("");
				for (int i = 0; i < 40; i++) {
					System.out.println("");
				}
				if (escolha2.equals("0")) {

					System.out.println("============================================");
					System.out.println(
							"|                                        Fim do programa!                                         |");
					System.out.println("============================================");
					sair = true;
					break;

				}
			} else if (escolha.equals("^")) {

				System.out.println("Informe o primeiro número da equação  ");
				int num1 = input.nextInt();

				System.out.println("Informe o segundo número da equação  ");
				int num2 = input.nextInt();

				double resultado = Math.pow(num1, num2);
				input.nextLine();

				System.out.println("============================================");

				System.out.println(
						" |                                         Processando...                                            |");

				System.out.println("============================================");

				System.out.println("|                                    Resultado da Potenciação: " + resultado
						+ "                                  |");

				System.out.println("============================================");
				System.out.println("|                                        Fim da Operação !"
						+ "                                        |");
				System.out.println("============================================");
				System.out.println("| pressione 0 para sair ou enter para voltar ao menu | ");
				String escolha2 = input.nextLine();
				System.out.println("============================================");
				System.out.println("");
				for (int i = 0; i < 40; i++) {
					System.out.println("");

				}
				if (escolha2.equals("0")) {

					System.out.println("============================================");
					System.out.println(
							"|                                        Fim do programa!                                         |");
					System.out.println("============================================");
					sair = true;
					break;

				}

			} else if (escolha.equals("R")) {

				System.out.println("Informe o número da equação  ");
				int num = input.nextInt();

				if (num <= 0) {

					System.out.println("|                     Numero inválido                   |");
				}

				double resultado = Math.sqrt(num);
				input.nextLine();

				System.out.println("============================================");

				System.out.println(
						" |                                         Processando...                                            |");

				System.out.println("============================================");

				System.out.println("|                                    Resultado da Radiciação: " + resultado
						+ "                                  |");

				System.out.println("============================================");
				System.out.println("|                                        Fim da Operação !"
						+ "                                         |");
				System.out.println("============================================");
				System.out.println("| pressione 0 para sair ou enter para voltar ao menu | ");
				String escolha2 = input.nextLine();
				System.out.println("============================================");
				System.out.println("");
				for (int i = 0; i < 40; i++) {
					System.out.println("");

				}
				if (escolha2.equals("0")) {

					System.out.println("============================================");
					System.out.println(
							"|                                        Fim do programa!                                         |");
					System.out.println("============================================");
					sair = true;
					break;

				}

			} else if (escolha.equals("/")) {

				System.out.println("Informe o primeiro número da equação  ");
				double num1 = input.nextInt();

				System.out.println("Informe o segundo número da equação  ");
				double num2 = input.nextInt();

				double resultado = num1 / num2;
				input.nextLine();

				System.out.println("============================================");

				System.out.println(
						" |                                         Processando...                                            |");

				System.out.println("============================================");

				System.out.println("|                                    Resultado da Divisão: " + resultado
						+ "                                  |");

				System.out.println("============================================");
				System.out.println("|                                        Fim da Operação !"
						+ "                                        |");
				System.out.println("============================================");
				System.out.println("| pressione 0 para sair ou qualquer tecla para voltar ao menu | ");
				String escolha2 = input.nextLine();
				System.out.println("============================================");
				System.out.println("");
				for (int i = 0; i < 40; i++) {
					System.out.println("");
				}
				if (escolha2.equals("0")) {
					System.out.println("============================================");
					System.out.println(
							"|                                        Fim do programa!                                         |");
					System.out.println("============================================");
					sair = true;
					break;

				}

			} else {System.out.println("============================================");
			System.out.println("|                                         Caractére Inválido !                                        |");
			System.out.println("============================================");
			System.out.println("| pressione 0 para sair ou qualquer tecla para voltar ao menu | ");
			String escolha2 = input.nextLine();
			System.out.println("============================================");
			System.out.println("");
			for (int i = 0; i < 40; i++) {
				System.out.println("");
			}
			if (escolha2.equals("0")) {
				System.out.println("============================================");
				System.out.println(
						"|                                        Fim do programa!                                         |");
				System.out.println("============================================");
				sair = true;
				break;

			}
				

				}

			}
		}
	}
