package sharl;

public class Equipped {
	
	Item primary;
	Item offHand;
	Item head;
	Item chest;
	Item Feet;
	Item Accessory;
	
	/**
	 * @param primary
	 * @param offHand
	 * @param head
	 * @param chest
	 * @param feet
	 * @param accessory
	 */
	public Equipped(Item primary, Item offHand, Item head, Item chest, Item feet, Item accessory) {
		//super();
		this.primary = primary;
		this.offHand = offHand;
		this.head = head;
		this.chest = chest;
		this.Feet = feet;
		this.Accessory = accessory;
	}

	/**
	 * @return the primary
	 */
	private Item getPrimary() {
		return primary;
	}

	/**
	 * @param primary
	 *            the primary to set
	 */
	private void setPrimary(Item primary) {
		this.primary = primary;
	}

	/**
	 * @return the offHand
	 */
	private Item getOffHand() {
		return offHand;
	}

	/**
	 * @param offHand
	 *            the offHand to set
	 */
	private void setOffHand(Item offHand) {
		this.offHand = offHand;
	}

	/**
	 * @return the head
	 */
	private Item getHead() {
		return head;
	}

	/**
	 * @param head
	 *            the head to set
	 */
	private void setHead(Item head) {
		this.head = head;
	}

	/**
	 * @return the chest
	 */
	private Item getChest() {
		return chest;
	}

	/**
	 * @param chest
	 *            the chest to set
	 */
	private void setChest(Item chest) {
		this.chest = chest;
	}

	/**
	 * @return the feet
	 */
	private Item getFeet() {
		return Feet;
	}

	/**
	 * @param feet
	 *            the feet to set
	 */
	private void setFeet(Item feet) {
		Feet = feet;
	}

	/**
	 * @return the accessory
	 */
	private Item getAccessory() {
		return Accessory;
	}

	/**
	 * @param accessory
	 *            the accessory to set
	 */
	private void setAccessory(Item accessory) {
		Accessory = accessory;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
