package sharl;

public class Region {
	ITile[][] space;
	
	Region(int width, int height) {
		space = new ITile[width][];
		for(int i = 0; i < width; i++) {
			space[i] = new ITile[height];
		}
	}
	
	public int width() {
		return space.length;
	}
	
	public int height() {
		return space[0].length;
	}
	
	public ITile at(int x, int y) {
		return space[x][y];
	}
	
	public ITile at(Vector v) {
		return at(v.iX(), v.iY());
	}
	
	public void setAt(int x, int y, ITile tile) {
		space[x][y] = tile;
	}
	
	public void setAt(Vector v, ITile tile) {
		setAt(v.iX(), v.iY(), tile);
	}
	
	public void drawRect() {}
}
