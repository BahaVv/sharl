package sharl;

import java.util.Random;

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
	
	public Rect rect() {
		return new Rect(0, 0, width(), height());
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
	
	public void drawRect(Rect r, ITile tile) {
		Vector orig = r.Origin();
		Vector opp = r.Opposite();
		int x, y;
		for(x = orig.iX(); x < opp.iX(); x++)
			for(y = orig.iY(); y < opp.iY(); y++) 
				setAt(x, y, tile);
	}
	
	Vector[] ORTHOGONALS = {new Vector(1, 0), new Vector(0, 1), new Vector(-1, 0), new Vector(0, -1)};
	
	public void generate(Random rand, ITile solid, ITile empty) {
		Rect r = rect();
		int w = r.Size().iX(), h = r.Size().iY();
		drawRect(r, solid);
		
		// Make a center room
		Vector center = r.Origin().add(r.Opposite()).mul(0.5);
		Vector size = new Vector(5 + rand.nextInt(5), 5 + rand.nextInt(5));
		drawRect(Rect.fromOpposite(center.sub(size.mul(0.5)), center.add(size.mul(0.5))), empty);
		
		// For a while...
		int rooms = 10 + rand.nextInt(30);
		for(int room = 0; room < rooms; room++) {
			// Choose a point that's on a wall somewhere
			boolean found = false;
			Vector point = new Vector();
			Vector adjacent = new Vector();
			while(!found) {
				point = new Vector(rand.nextInt(w), rand.nextInt(h));
				for(int oi = 0; oi < ORTHOGONALS.length; oi++) {
					adjacent = point.add(ORTHOGONALS[oi]);
					if(at(point) != at(adjacent)) {
						found = true;
						break;
					}
				}
			}
			// Make sure point is consistently in the wall (and adjacent is on the floor)
			if(at(point) == empty) {
				Vector temp = point;
				point = adjacent;
				adjacent = temp;
			}
			// Get the in-facing normal vector of that wall
			Vector normal = point.sub(adjacent);
			// ...and now flip the adjacent over to the wall and the point just beyond it
			adjacent = point;
			point = adjacent.add(normal);
			// Choose a size for the new room
			Vector sz = new Vector(1 + rand.nextInt(10), 1 + rand.nextInt(10));
			// Find a room alignment (opposite) that has at least one axis aligned to the normal
			Vector opp;
			if(normal.iX() == 0) {
				// Normal is along Y, choose random X
				opp = new Vector(2*rand.nextInt(2) - 1, normal.iY());
			} else {
				// Normal is along X, choose random Y
				opp = new Vector(normal.iX(), 2*rand.nextInt(2) - 1);
			}
			Rect room = Rect.fromOpposite(point, opp).normalize();
			// Compute expanded room for boundary-checking
			Rect bounds = new Rect(room.Origin().sub(1), room.Size().add(2));
			// Check that the boundary is clear to be carved out
			found = false;
			for(int x = bounds.Origin().iX(); x < bounds.Opposite().iX(); x++) {
				for(int y = bounds.origin.iY(); y < bounds.Opposite().iY(); y++)
					if(at(x, y) != solid) {
						found = true;
						break;
					}
				if(found)
					break;
			}
			if(found)
				continue;
			// Carve dat room
			setAt(adjacent, empty);
			drawRect(room, empty);
			// ...loop.
		}
		
		// Region carved!
	}
}
