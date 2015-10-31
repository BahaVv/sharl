package sharl;

public interface ITile extends IGameLogic {
	boolean isWalkable();
	boolean isTransparent();
	void onEntityWalks(Entity stepper);
	Inventory getInventory();
}
