
public class Animal {
	public int currx;
	public int curry;
	public Animal() {
		currx = (int)(Math.random() * gameloop.MAX_X);
		curry = (int)(Math.random() * gameloop.MAX_Y);
	}
	public void move() {
		int tempx = (int)(Math.random() * 7);
		int tempy = (int)(Math.random() * 7);
		currx += (tempx-3);
		curry += (tempy-3);
		if(currx > gameloop.MAX_X) currx -= gameloop.MAX_X;
		if(currx < 0) currx += gameloop.MAX_X;
		if(curry > gameloop.MAX_Y) currx -= gameloop.MAX_Y;
		if(curry < 0) currx += gameloop.MAX_Y;
	}
	
}
