
public class Rabbit extends Animal{
	public int reproductionClock;
	public Rabbit() {
		super();
		reproductionClock = 0;
	}
	
	public void move() {
		if(reproductionClock > 2) {
			gameloop.news.push("New Rabbit");
		}
		int tempx = (int)(Math.random() * 3);
		int tempy = (int)(Math.random() * 3);
		currx += (tempx-1);
		curry += (tempy-1);
		if(currx > gameloop.MAX_X) currx -= gameloop.MAX_X;
		if(currx < 0) currx += gameloop.MAX_X;
		if(curry > gameloop.MAX_Y) curry -= gameloop.MAX_Y;
		if(curry < 0) curry += gameloop.MAX_Y;
		gameloop.pos[currx][curry].addRabbit();
		reproductionClock++;
			
	}
}
