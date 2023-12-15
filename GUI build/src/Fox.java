
public class Fox extends Animal {
	public int Lasteaten;
	public Fox() {
		super();
		Lasteaten = 0;
	}
	public void move() {
		if(Lasteaten > 2) {
			gameloop.news.push("Dead Fox");
		}
		int tempx = (int)(Math.random() * 7);
		int tempy = (int)(Math.random() * 7);
		currx += (tempx-3);
		curry += (tempy-3);
		if(currx > gameloop.MAX_X) currx -= gameloop.MAX_X;
		if(currx < 0) currx += gameloop.MAX_X;
		if(curry > gameloop.MAX_Y) curry -= gameloop.MAX_Y;
		if(curry < 0) curry += gameloop.MAX_Y;
		//reproductionClock++;
		gameloop.pos[currx][curry].addFox(this);
		Lasteaten++;
	}
}
