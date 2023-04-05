import java.util.Scanner;

public class Freq {

	public static void main(String[] args) {
			Scanner S = new Scanner(System.in);
			String str = S.nextLine();
			int[] fr = new int[str.length()];

			char String[] = str.toCharArray();

			for (int i = 0; i < String.length; i++) {
					fr[i] = 1;
					for (int j = i + 1; j < String.length; j++) {
							if (String[i] == String[j]) {
									fr[i]++;
									String[j] = '0';
							}
					}
			}
			for (int i = 0; i < fr.length; i++) {
					if (String[i] != ' ' && String[i] != '0') {
							System.out.println(String[i] + "---->" + fr[i]);
					}
			}

	}

}