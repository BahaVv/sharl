package sharl;

public class Item {

	int atk;
	int hp;
	int def;
	char drawChar;

	String name;

	

	/**
	 * @param atk
	 * @param hp
	 * @param def
	 * @param name
	 * @param drawChar
	 */

	
	public Item(int atk, int hp, int def, String name, char drawChar) {
		this.atk = atk;
		this.hp = hp;
		this.def = def;
		this.name = name;
		this.drawChar = drawChar;
	}
	
	/**
	 * @return the drawChar
	 */
	public char getDrawChar() {
		return drawChar;
	}

	
	/**
	 * @param drawChar
	 *            the drawChar to set
	 */
	public void setDrawChar(char drawChar) {
		this.drawChar = drawChar;
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
	 * @return the hp
	 */
	public int getHp() {
		return this.hp;
	}

	/**
	 * @param hp
	 *            the hp to set
	 */
	public void setHp(int hp) {
		this.hp = hp;
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

	@Override
	public String toString() {
		return "Item [Atk=" + atk + ", Hp=" + hp + ", Def=" + def + ", name="
				+ name + "]";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

}
