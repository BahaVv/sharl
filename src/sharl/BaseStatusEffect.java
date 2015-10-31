package sharl;

public abstract class BaseStatusEffect implements IStatusEffect {
	
	protected int turns;
	
	BaseStatusEffect() {
		turns = 0;
	}

	@Override
	public boolean beginEffect(Entity affected) {
		return true;
	}

	@Override
	public void endEffect(Entity affected){
			
	}
	
	@Override
	public void tick() {
		turns += 1;
	}

}
