import java.util.ArrayList;

public class Position {
	public int rc;
	public ArrayList<Fox> fc = new ArrayList<Fox>();
	public Position() {
		rc = 0;
		//fc = 0;
	}
	public void addFox(Fox b) {
		fc.add(b);
	}
	public void addRabbit() {
		if(fc.size() > 0) {
			//rc--;
			fc.get(0).Lasteaten = 0;
			fc.remove(0);
			gameloop.news.push("Dead Rabbit");
			gameloop.news.push("New Fox");
		}else {
			rc++;
		}
	}
	public void clear() {
		rc = 0;
		fc.clear();
	}
}
