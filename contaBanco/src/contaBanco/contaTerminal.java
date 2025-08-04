package contaBanco;

import java.util.Random;
import java.util.Scanner;

public class contaTerminal {

	public static int account;
	public static String agency;
	public static String clientName;
	public static double balance;
	public static Scanner sacanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		criarConta();
	}
	
	public static void criarConta() {
		Random random = new Random();
		account = random.nextInt(1000);
		agency = "0001";
		System.out.println("---Bem-Vindo ao Nosso Banco---");
		System.out.println("---Insira seus dados para criar a sua conta---");
		System.out.println("Nome Completo: ");
		clientName = sacanner.next();
		System.out.println("Deposito inicial: ");
		balance = sacanner.nextDouble();
		System.out.println("Deposito recebido com sucesso");
		System.out.printf("Parabéns sr(a). %s, \n"
				+ "Aqui estão seus dados bancarios \n"
				+ "Conta: %s \n"
				+ "Agencia: %s \n"
				+ "Saldo: %s \n", clientName, account, agency, balance);
	}
}
