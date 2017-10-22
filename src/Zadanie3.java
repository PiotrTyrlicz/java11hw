
import java.io.File;
import java.io.FileNotFoundException;
import java.security.KeyStore.Entry;
import java.util.LinkedHashMap;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Zadanie3 {
	
	public void wykonaj() {
		TreeMap<Integer, Integer> liczbyMapa =new TreeMap<>();
		File file = new File("liczby.txt");
		String nextLine;
		int nextInt;
		
		try(Scanner scan = new Scanner(file);) {
	
			int wartosc=0;
			while(scan.hasNextLine()) {
				nextLine = scan.nextLine();
				nextInt=Integer.valueOf(nextLine);
				
				if(liczbyMapa.containsKey(nextInt)) {
					
					wartosc=liczbyMapa.get(nextInt);
					wartosc++;
					
					liczbyMapa.put(nextInt, wartosc);
				}
				if(!(liczbyMapa.containsKey(nextInt)))
					liczbyMapa.put(nextInt, 1);

			
			}
			System.out.println("dana liczba = ilość wystąpień");
			Set<java.util.Map.Entry<Integer, Integer>> entrySet =liczbyMapa.entrySet();
			System.out.println(entrySet);
		}
		 catch(FileNotFoundException e) {
			System.err.println("Plik nie istnieje");
			}
		
	}//wykonaj

}
