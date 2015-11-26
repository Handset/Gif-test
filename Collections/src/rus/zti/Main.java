package rus.zti;
import java.util.*;


public class Main {
	private static ArrayList<mobile> mobiles = new ArrayList<mobile>();
	private static Random r = new Random();

	
	public static void main(String[] args) {
	
		for(int i=0;i<3;i++){
			mobiles.add(new mobile(r.nextInt(99999), "Iphone", "zti"));
		}
		for(mobile m: mobiles){
			System.out.println(m.getNumber()+ " " + m.getName()+ " " + m.getChif());
		}
	}

	}