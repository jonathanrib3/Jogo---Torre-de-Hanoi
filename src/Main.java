import java.util.Scanner;
public class Main {
	public static void main(String args[]) throws Exception{
		int escolha = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Com quantos discos deseja iniciar a torre principal? ");
		JogoDeHanoi jogo = new JogoDeHanoi(Integer.parseInt(sc.nextLine()));


		while(escolha != 5){

			System.out.println("1 - Fazer jogada   2 - Verificar se terminou    3 - Numero de jogadas 4 - Verificar as torres  5 - Sair");
			escolha = Integer.parseInt(sc.nextLine());
			switch(escolha){
				case 1:

					System.out.println("Escolha abaixo respectivamente torre fonte e torre destino sendo: \n" +
							"1 - torrePrincipal\n" +
							"2 - torre 2\n" +
							"3 - torre 3");
					try {
						System.out.println(jogo.escolhaTorre(Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
					}
					catch (Exception e){
						System.out.println("Escolha inválida");
					}
					break;
				case 2:
					System.out.println(jogo.isTerminado());
					break;
				case 3:
					System.out.println(jogo.getNumeroDeJogadas());
					break;
				case 4:
					System.out.println(jogo);
					break;
				case 5:
					System.out.println("Programa encerrado!");
					break;
				default:
			}
		}
	}
}
