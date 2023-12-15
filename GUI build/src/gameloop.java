import java.util.*;
import java.util.concurrent.TimeUnit;
public class gameloop {
	public static final int MAX_X = 50;
	public static final int MAX_Y = 20;
	public static final int ANIMAL_COUNT = 20;
	public static ArrayList<Rabbit> rabbits = new ArrayList<Rabbit>();
	public static ArrayList<Fox> foxes = new ArrayList<Fox>();
	public static Stack<String> news = new Stack<String>();
	public static Position[][] pos = new Position[MAX_X+1][MAX_Y+1]; 
	
	public static void main(String[] args) {
		for(int i = 0; i < ANIMAL_COUNT; i++) {
			rabbits.add(new Rabbit());
			foxes.add(new Fox());
		}
		for(int x = 0; x <= MAX_X; x++) {
			for(int y = 0; y <= MAX_Y; y++) {
				pos[x][y] = new Position();
			}
		}
		while(rabbits.size() != 0 && foxes.size() != 0) {
			doturn();
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void doturn() {
		for(Fox f: foxes) {
			f.move();
		}
		for(Rabbit r: rabbits) {
			r.move();
		}
		while(!news.isEmpty()) {
			String n = news.pop();
			switch(n) {
				case "Dead Fox":
					foxes.remove(0);
					break;
				case "Dead Rabbit":
					rabbits.remove(0);
					break;
				case "New Fox":
					foxes.add(new Fox());
					break;
				case "New Rabbit":
					rabbits.add(new Rabbit());
					break;
					
			}
		}
		for(int x = 0; x <= MAX_Y; x++) {
			for(int y = 0; y <= MAX_X; y++) {
				if(pos[y][x].fc.size() > 0) {
					System.out.print("F");
				}else if(pos[y][x].rc > 0) {
					System.out.print("R");
				} else {
					System.out.print("/");
				}
				pos[y][x].clear();
			}
			System.out.println();
		}
		System.out.println("Fox count: " + foxes.size());
		System.out.println("Rabbit count: " + rabbits.size());
	}
}
