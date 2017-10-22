
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Zadanie1 {
	TreeSet<Integer> set = new TreeSet<>();
	
	Random generator = new Random();
	
	LinkedList list = new LinkedList();
	
	private double srednia;
	
	
	public void setSrednia() {
		this.srednia=sredniaLiczb();
	}
	public double getSrednia() {
		return srednia;
	}
	
	public void losujLiczby() {
		System.out.println("Losowanie liczb");
		int liczbaLosowana;
		for (int i=0; i<50; i++) {
			liczbaLosowana=generator.nextInt(1000);
			if(!(set.contains(liczbaLosowana)))
				set.add(liczbaLosowana);
			else i--;
		}
	}
	
	public void wypiszMaxMin() {
		System.out.println("Najmniejsza: "+set.first());
		System.out.println("Najwi�ksza: "+set.last());

	}
	
	public double sredniaLiczb() {
		Iterator<Integer> iterator = set.iterator();
		double suma=0;
		while(iterator.hasNext()) {
			Integer next = iterator.next();
			suma+=next;
		}
		srednia=suma/set.size();
		System.out.println("Srednia licz to: " + srednia);
		return srednia;
	}
		
	public void wiekszeOdSredniej() {
		Iterator<Integer> iterator = set.iterator();
		while(iterator.hasNext()) {
			Integer next = iterator.next();
			if(next>=srednia) {
				list.add(next);
			}
		}
		System.out.println("Liczby wieksze od sredniej");
		System.out.println(list.toString());
	}
	
	
	public void testZadania1() {
		losujLiczby();
		wypiszMaxMin();
		setSrednia();
		wiekszeOdSredniej();
	}
	
	


}
