package sharl;

public class Monster {

	int levelDifficulty;
	int intelligence;
	boolean hunter;
	Entity target;

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

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
