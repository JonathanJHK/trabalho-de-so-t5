import java.util.ArrayList;
import java.util.Random;

/**
 * 
 * 
 * @author Renan Bennati Dias
 * @author Jonathan Heidy Kinjo
 *
 *         Para compilar o trabalho rode "javac Main.java" no root do trabalho
 *         Para rodar o trabalho rode "java Main 1000 30 2017 3000"
 */
public class Main {

	public static void main(String[] args) {

		/**
		 * Caso nao haja argumentos suficiente uma mensagem de erro e mostrada
		 * para o usuario.
		 */
		if (args.length < 4) {
			System.out.println("Quantidade de argumentos faltando.");
			System.exit(1);
		}

		/**
		 * Pega a quantidade de cilindro
		 */
		int nc = Integer.parseInt(args[0]);

		/**
		 * Pega a posicao inicial do cabecote
		 */
		int ci = Integer.parseInt(args[1]);

		/**
		 * Pega o valor do seed.
		 */
		int seed = Integer.parseInt(args[2]);

		/**
		 * Pega quantidade de solicitacoes
		 */
		int ns = Integer.parseInt(args[3]);

		ArrayList<Integer> listnc = new ArrayList<Integer>();
		Random rng = new Random(seed);

		for (int i = 0; i < ns; i++) {
			listnc.add(rng.nextInt(nc));
		}
		ArrayList<Integer> listnc0 = new ArrayList<Integer>();
		listnc0.addAll(listnc);

		FCFS fcfs = new FCFS(listnc);
		fcfs.sheduling(ci);

		SSTF sstf = new SSTF(listnc);
		sstf.sheduling(ci);

		LOOK look = new LOOK(listnc0);
		look.sheduling(ci);

	}

}
