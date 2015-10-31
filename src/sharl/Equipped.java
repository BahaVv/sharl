package sharl;

public class Equipped {

	Item Primary;
	Item OffHand;
	Item Head;
	Item Chest;
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
	public Equipped(Item primary, Item offHand, Item head, Item chest,
			Item feet, Item accessory) {
		Primary = primary;
		OffHand = offHand;
		Head = head;
		Chest = chest;
		Feet = feet;
		Accessory = accessory;
	}

	/**
	 * @return the primary
	 */
	public Item getPrimary() {
		return Primary;
	}

	/**
	 * @param primary
	 *            the primary to set
	 */
	public void setPrimary(Item primary) {
		this.Primary = primary;
	}

	/**
	 * @return the offHand
	 */
	public Item getOffHand() {
		return OffHand;
	}

	/**
	 * @param offHand
	 *            the offHand to set
	 */
	public void setOffHand(Item offHand) {
		this.OffHand = offHand;
	}

	/**
	 * @return the head
	 */
	public Item getHead() {
		return Head;
	}

	/**
	 * @param head
	 *            the head to set
	 */
	public void setHead(Item head) {
		this.Head = head;
	}

	/**
	 * @return the chest
	 */
	public Item getChest() {
		return Chest;
	}

	/**
	 * @param chest
	 *            the chest to set
	 */
	public void setChest(Item chest) {
		this.Chest = chest;
	}

	/**
	 * @return the feet
	 */
	public Item getFeet() {
		return Feet;
	}

	/**
	 * @param feet
	 *            the feet to set
	 */
	public void setFeet(Item feet) {
		Feet = feet;
	}

	/**
	 * @return the accessory
	 */
	public Item getAccessory() {
		return Accessory;
	}

	/**
	 * @param accessory
	 *            the accessory to set
	 */
	public void setAccessory(Item accessory) {
		Accessory = accessory;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Equipped [Primary=" + Primary + ", OffHand=" + OffHand
				+ ", Head=" + Head + ", Chest=" + Chest + ", Feet=" + Feet
				+ ", Accessory=" + Accessory + "]";
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Equipped equip = new Equipped(new Item(2,3,4,"test1",'c'),new Item(2,3,4,"test2",'h'),new Item(2,3,4,"test3",'t'),new Item(2,3,4,"test4",'t'),new Item(2,3,4,"test5",'t'),new Item(2,3,4,"test5",'t'));
		
		System.out.println(equip.toString());
		
		equip.setAccessory(new Item(3,6,7,"Hello",'H'));
		
		System.out.println(equip.Accessory.toString());
		

	}

}
