package sharl;

public class Item {
	
	Integer Atk;
	Integer Hp;
	Integer Def;

	String name;

	/**
	 * @param atk
	 * @param hp
	 * @param def
	 * @param name
	 */
	public Item(Integer atk, Integer hp, Integer def, String name) {
		// super();
		Atk = atk;
		Hp = hp;
		Def = def;
		this.name = name;
	}

	/**
	 * @return the hp
	 */
	private int getHp() {
		return Hp;
	}

	/**
	 * @param hp
	 *            the hp to set
	 */
	private void setHp(Integer hp) {
		Hp = hp;
	}

	/**
	 * @return the def
	 */
	private int getDef() {
		return Def;
	}

	/**
	 * @param def
	 *            the def to set
	 */
	private void setDef(Integer def) {
		Def = def;
	}

	/**
	 * @return the atk
	 */
	private int getAtk() {
		return Atk;
	}

	/**
	 * @param atk
	 *            the atk to set
	 */
	private void setAtk(Integer atk) {
		Atk = atk;
	}

	/**
	 * @return the name
	 */
	private String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	private void setName(String name) {
		this.name = name;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
