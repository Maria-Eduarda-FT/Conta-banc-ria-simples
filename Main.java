import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        int resp, cont=0;// cont é só um exemplo
        String nome;
        double val;
        contaBancaria conta = null;
        
	    do{
		System.out.println("Banco de dinheiro");
		System.out.println("1-Criar conta");
		System.out.println("2-Depósito");
		System.out.println("3-Saque");
		System.out.println("4-Informações da conta");
		System.out.println("5-Sair");
		resp = scanner.nextInt();
		scanner.nextLine(); // Limpa o buffer
		 
		if (resp == 1) {
            System.out.println("Digite seu nome completo:");
            nome = scanner.nextLine();
            conta = new contaBancaria(nome, cont); //perde referencia do obj se cria mais de uma
            System.out.println("Conta criada com sucesso!");
        }
        else if (resp == 2 && conta != null) {
            System.out.println("Digite o valor do depósito:");
            val = scanner.nextDouble();
            conta.depositar(val);
        }
        else if (resp == 3 && conta != null) {
            System.out.println("Digite o valor do saque:");
            val = scanner.nextDouble();
            conta.sacar(val);
        }
        else if (resp == 4 && conta != null) {
            conta.exibirInformacoes();
        }
        else if (resp == 2 || resp == 3 || resp == 4) {
                System.out.println("Por favor, crie uma conta primeiro.");
            }
		cont++;
	    }while(resp != 5);
	}
}
