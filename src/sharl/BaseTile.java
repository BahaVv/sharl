package sharl;

public abstract class BaseTile implements ITile {
	
	protected Inventory inv;

	@Override
	public void tick() {

	}

	@Override
	public void onEntityWalks(Entity stepper) {
		
	}

	@Override
	public Inventory getInventory() {
		return inv;
	}

}
