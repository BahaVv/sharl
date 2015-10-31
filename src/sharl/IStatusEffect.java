package sharl;

public interface IStatusEffect {
	boolean beginEffect(Entity affected); // Begin affecting the entity; returns whether or not this effect is at all applicable
	boolean shouldRemain(Entity affected); // Should this effect continue on this entity? Return false to remove
	void doEffect(Entity affected); // Do the actual effect (play with a stat, etc.)
	void endEffect(Entity affected); // Stop affecting this entity (revert any changes to stats, etc.)
	void tick(); // A game tick has passed, update counters
}
