package sharl;

import java.util.ArrayList;
import java.util.List;

public class Monster extends Entity{

	int levelDifficulty;
	int intelligence;
	boolean hunter;
	Entity target;

	/**
	 * @param levelDifficulty
	 * @param intelligence
	 * @param hunter
	 * @param target
	 */
	public Monster(int levelDifficulty, int intelligence, boolean hunter, Entity target) {
		this.levelDifficulty = levelDifficulty;
		this.intelligence = intelligence;
		this.hunter = hunter;
		this.target = new Entity(target);
	}

	/**
	 * @return the levelDifficulty
	 */
	public int getLevelDifficulty() {
		return levelDifficulty;
	}

	/**
	 * @param levelDifficulty
	 *            the levelDifficulty to set
	 */
	public void setLevelDifficulty(int levelDifficulty) {
		this.levelDifficulty = levelDifficulty;
	}

	/**
	 * @return the intelligence
	 */
	public int getIntelegence() {
		return intelligence;
	}

	/**
	 * @param intelegence
	 *            the intelligence to set
	 */
	public void setIntelegence(int intelegence) {
		this.intelligence = intelegence;
	}

	/**
	 * @return the hunter
	 */
	public boolean isHunter() {
		return hunter;
	}

	/**
	 * @param hunter
	 *            the hunter to set
	 */
	public void setHunter(boolean hunter) {
		this.hunter = hunter;
	}

	/**
	 * @return the target
	 */
	public Entity getTarget() {
		return target;
	}

	/**
	 * @param target
	 *            the target to set
	 */
	public void setTarget(Entity target) {
		this.target = target;
	}

	@Override
	public String toString() {
		return "Monster [levelDifficulty=" + levelDifficulty
				+ ", intelligence=" + intelligence + ", hunter=" + hunter
				+ ", target=" + target.toString() + "]";
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Equipped equip = new Equipped(new Item(2,3,4,"test1",'c'),new Item(2,3,4,"test2",'h'),new Item(2,3,4,"test3",'t'),new Item(2,3,4,"test4",'t'),new Item(2,3,4,"test5",'t'),new Item(2,3,4,"test5",'t'));
		
		List<IStatusEffect> effects = new ArrayList<IStatusEffect>();
		effects.add(new Effects.Fire());
		
		
		Entity e = new Entity("test",10,11,13,effects,20,10,'@',equip,new Inventory());
		
		System.out.println(e.toString());
		
		Monster m=new Monster(10,3,false,e);
		
		System.out.println(m.toString());
		

	}
	

}
