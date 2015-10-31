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
	protected char drawchar;
	
	protected int env;
	
	Inventory invt;
	Equipped equip;
	
	/**
	 * @param name
	 * @param baseHP
	 * @param baseAtk
	 * @param baseDef
	 * @param statuses
	 * @param moveSpeed
	 * @param lightRadius
	 * @param drawchar
	 * @param equip
	 */
	public Entity(String name, int baseHP, int baseAtk, int baseDef,
			List<IStatusEffect> statuses, int moveSpeed, int lightRadius,
			char drawchar, Equipped equip, Inventory invt) {
		this.name = name;
		this.baseHP = this.HP = baseHP;
		this.baseAtk = this.atk = baseAtk;
		this.baseDef = this.def = baseDef;
		this.statuses = statuses;
		this.moveSpeed = moveSpeed;
		this.lightRadius = lightRadius;
		this.drawchar = drawchar;
		this.equip = equip;
		this.invt=invt;
	}

	/**
	 * @return the drawchar
	 */
	public char getDrawchar() {
		return drawchar;
	}

	/**
	 * @param drawchar the drawchar to set
	 */
	public void setDrawchar(char drawchar) {
		this.drawchar = drawchar;
	}

	/**
	 * @return the invt
	 */
	public Inventory getInvt() {
		return invt;
	}

	/**
	 * @param invt the invt to set
	 */
	public void setInvt(Inventory invt) {
		this.invt = invt;
	}

	/**
	 * @return the equip
	 */
	public Equipped getEquip() {
		return equip;
	}

	/**
	 * @param equip the equip to set
	 */
	public void setEquip(Equipped equip) {
		this.equip = equip;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the baseHP
	 */
	public int getBaseHP() {
		return baseHP;
	}

	/**
	 * @param baseHP
	 *            the baseHP to set
	 */
	public void setBaseHP(int baseHP) {
		this.baseHP = baseHP;
	}

	/**
	 * @return the baseAtk
	 */
	public int getBaseAtk() {
		return baseAtk;
	}

	/**
	 * @param baseAtk
	 *            the baseAtk to set
	 */
	public void setBaseAtk(int baseAtk) {
		this.baseAtk = baseAtk;
	}

	/**
	 * @return the baseDef
	 */
	public int getBaseDef() {
		return baseDef;
	}

	/**
	 * @param baseDef
	 *            the baseDef to set
	 */
	public void setBaseDef(int baseDef) {
		this.baseDef = baseDef;
	}

	/**
	 * @return the hP
	 */
	public int getHP() {
		return HP;
	}

	/**
	 * @param hP
	 *            the hP to set
	 */
	public void setHP(int hP) {
		HP = hP;
	}

	/**
	 * @return the atk
	 */
	public int getAtk() {
		return atk;
	}

	/**
	 * @param atk
	 *            the atk to set
	 */
	public void setAtk(int atk) {
		this.atk = atk;
	}

	/**
	 * @return the def
	 */
	public int getDef() {
		return def;
	}

	/**
	 * @param def
	 *            the def to set
	 */
	public void setDef(int def) {
		this.def = def;
	}

	/**
	 * @return the statuses
	 */
	public List<IStatusEffect> getStatuses() {
		return statuses;
	}

	/**
	 * @param statuses
	 *            the statuses to set
	 */
	public void setStatuses(List<IStatusEffect> statuses) {
		this.statuses = statuses;
	}

	/**
	 * @return the moveSpeed
	 */
	public int getMoveSpeed() {
		return moveSpeed;
	}

	/**
	 * @param moveSpeed
	 *            the moveSpeed to set
	 */
	public void setMoveSpeed(int moveSpeed) {
		this.moveSpeed = moveSpeed;
	}

	/**
	 * @return the lightRadius
	 */
	public int getLightRadius() {
		return lightRadius;
	}

	/**
	 * @param lightRadius
	 *            the lightRadius to set
	 */
	public void setLightRadius(int lightRadius) {
		this.lightRadius = lightRadius;
	}

	@Override
	public void tick() {
		for (IStatusEffect effect : statuses) {
			effect.tick();
		}
	}

	@Override
	public String toString() {
		return "Entity [name=" + name + ", baseHP=" + baseHP + ", baseAtk="
				+ baseAtk + ", baseDef=" + baseDef + ", HP=" + HP + ", atk="
				+ atk + ", def=" + def + ", statuses=" + statuses
				+ ", moveSpeed=" + moveSpeed + ", lightRadius=" + lightRadius
				+ ", drawchar=" + drawchar + ", env=" + env + ", invt=" + invt
				+ ", equip=" + equip + "]";
	}

}
