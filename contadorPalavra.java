import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class contadorPalavra {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite uma palavra: ");
		String palavra = scanner.next();
		
		Map<Character, Integer> contador = new HashMap<>();
		
		for (char c : palavra.toCharArray()) {
			contador.put(c, contador.getOrDefault(c, 0) + 1);
		}
		
		System.out.println("Contagem de caracteres:");
		 for (Map.Entry<Character, Integer> entry : contador.entrySet()) {
			 System.out.println("'" + entry.getKey() + "' aparece " + entry.getValue() + " vez(es)");
		}
		
		scanner.close();

	}

}
