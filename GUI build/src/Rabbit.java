
public class Rabbit extends Animal{
	public int reproductionClock;
	public Rabbit() {
		super();
		reproductionClock = 0;
	}
	
	public void move(
		if(reproductionClock > 5) {
			
		}
		int tempx = (int)(Math.random() * 7);
		int tempy = (int)(Math.random() * 7);
		currx += (tempx-3);
		curry += (tempy-3);
		if(currx > gameloop.MAX_X) currx -= gameloop.MAX_X;
		if(currx < 0) currx += gameloop.MAX_X;
		if(curry > gameloop.MAX_Y) currx -= gameloop.MAX_Y;
		if(curry < 0) currx += gameloop.MAX_Y;
		reproductionClock++;
			
	}
}
