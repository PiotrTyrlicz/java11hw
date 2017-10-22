
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Zadanie2 {
	
	Queue<Integer> liczby = new LinkedList<>();
	
	public void wczytaj() {
		Scanner scan1=new Scanner(System.in);
		int liczba;
	
		for(int i=0; i<5; i++) {
			
			System.out.println("Podaj liczbe nr."+(i+1));
			liczba=scan1.nextInt();
			liczby.offer(liczba);
			
		}
	}
	
	public void pokaz() {
		int wynik=0;
		String s = "";
		StringBuilder sB = new StringBuilder(s);
		Iterator<Integer> iterator = liczby.iterator();
		
		while(iterator.hasNext()) {
			Integer next = iterator.next();
			sB.append(next + " + ");
			wynik+=next;
		}
		s=sB.substring(0, sB.length()-3);
		
		System.out.println(s + " = "+ wynik );
		System.out.println(s.length());
	}
	
	
}
