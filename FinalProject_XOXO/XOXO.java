package finalProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class XOXO {

	static char[] xoTable = { '1', '2', '3', '4', '5', '6', '7', '8', '9' };
	final char X = 'x';
	final char O = 'o';
	Random random = new Random();

	public static void main(String[] args) {
		new XOXO().game();

	}

	void game() {
		printXO();

		while (true) {
			turnPlayer();
			if (win(X)) {
				System.out.println("YOU WIN!");
				break;
			}
			if (isFull()) {
				System.out.println("!!!DRAW!!!");
				break;
			}
			turnComp();
			printXO();
			if (win(O)) {
				System.out.println("COMPUTER WIN!");
				break;
			}
			if (isFull()) {
				System.out.println("!!!DRAW!!!");
				break;
			}
		}
		System.out.println("GAME OVER.");
		printXO();
	}

	void printXO() {
		for (int i = 0; i < 9; i++) {
			System.out.print(xoTable[i] + " ");
			if ((i + 1) % 3 == 0) {
				System.out.println();
			}
		}
	}

	void turnPlayer() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input;
		int num = 0;
		do {
			System.out.println("Enter X (1...9):");
			try {
				num = Integer.parseInt(reader.readLine());
			} catch (NumberFormatException e) {
				System.out.println("Please enter a number");
				num = 0;
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} while (!isCellValid(num));
		xoTable[num - 1] = X;
	}

	void turnComp() {
		int num;
		do {
			num = random.nextInt(8) + 1;
		} while (!isCellValid(num));
		xoTable[num - 1] = O;
	}

	boolean isCellValid(int num) {
		if (num < 1 || num > 9) {
			System.out.println("Please choose other cell");
			return false;
		}
		return (xoTable[num - 1] == '1' || xoTable[num - 1] == '2' || xoTable[num - 1] == '3' || xoTable[num - 1] == '4'
				|| xoTable[num - 1] == '5' || xoTable[num - 1] == '6' || xoTable[num - 1] == '7'
				|| xoTable[num - 1] == '8' || xoTable[num - 1] == '9');
	}

	boolean win(char xo) {
		for (int i = 0; i < 9; i += 3) {
			if (xoTable[i] == xo && xoTable[i + 1] == xo && xoTable[i + 2] == xo)
				return true;
		}
		for (int i = 0; i < 2; i++) {
			if (xoTable[i] == xo && xoTable[i + 3] == xo && xoTable[i + 6] == xo)
				return true;
		}
		if ((xoTable[0] == xo && xoTable[4] == xo && xoTable[8] == xo)
				|| (xoTable[2] == xo && xoTable[4] == xo && xoTable[6] == xo))
			return true;
		return false;
	}

	boolean isFull() {
		for (int i = 0; i < 9; i++)
			if (xoTable[i] == '1' || xoTable[i] == '2' || xoTable[i] == '3' || xoTable[i] == '4' || xoTable[i] == '5'
					|| xoTable[i] == '6' || xoTable[i] == '7' || xoTable[i] == '8' || xoTable[i] == '9') {
				return false;
			}
		return true;
	}

}