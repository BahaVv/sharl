package sharl;

import java.util.ArrayList;
import java.util.List;

public class World {
	Region region;
	List<Entity> entities;
	
	public World() {
		region = new Region();
		entities = new ArrayList<Entity>();
	}
	
	public void step() {
		for(Entity e : entities) {
			e.tick();
		}
	}
}
