/**
 * 
 */
package sharl;

import java.util.List;

/**
 * @author Macri-man
 * 
 */
public class Entity implements IGameLogic {


	protected String name;
	protected int baseHP;
	protected int baseAtk;
	protected int baseDef;
	protected int HP;
	protected int atk;
	protected int def;
	protected List<IStatusEffect> statuses;
	protected int moveSpeed;
	protected int lightRadius;
	
	@Override
	public void tick() {
		for(IStatusEffect effect : statuses) {
			effect.tick();
		}
	}
	

}
