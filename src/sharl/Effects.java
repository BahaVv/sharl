package sharl;

public class Effects extends BaseStatusEffect {
	
	String name="Generic Effects"; 

	@Override
	public boolean shouldRemain(Entity affected) {
		if (turns < 10) {
			return true;
		}
		return false;
	}

	@Override
	public void doEffect(Entity affected) {
		
	}

	@Override
	public String toString() {
		return "Effects [name=" + name + ", turns=" + turns + "]";
	}

	public static class Poison extends Effects {

		int endturns = 10;
		int dmg = 1;

		@Override
		public boolean shouldRemain(Entity affected) {
			if (turns == endturns) {
				return false;
			}

			/*if (affected.env == something) {
				return false;
			}*/

			return true;
		}

	
		@Override
		public void doEffect(Entity affected) {
			affected.HP -= dmg;
		}

		
		@Override
		public boolean beginEffect(Entity affected) {
			return true;
		}

		
		@Override
		public void endEffect(Entity affected) {
			
		}

		
		@Override
		public void tick() {
			super.tick();
		}

	}

	public static class Fire extends Effects {
		
		String name="Fire Effect";
		int endturns = 10;
		int dmg = 1;
		
		

		
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Fire [name=" + name + ", endturns=" + endturns + ", dmg="
					+ dmg + ", turns=" + turns + "]";
		}


		@Override
		public boolean shouldRemain(Entity affected) {
			if (turns == endturns) {
				return false;
			}
			
			/*if(affected.env==EnvironTypes.Snow){
				return false;
			}*/
			
			return true;
		}

		
		@Override
		public void doEffect(Entity affected) {
			affected.HP -= dmg;
		}

		@Override
		public boolean beginEffect(Entity affected) {
			return true;
		}

		
		@Override
		public void endEffect(Entity affected) {
			
		}

		
		@Override
		public void tick() {
			super.tick();
		}

	}
	
	public static class Bleeding extends Effects {
		
		String name="Bleeding Effect";
		int endturns = 40;

		
		
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Bleeding [name=" + name + ", endturns=" + endturns
					+ ", turns=" + turns + "]";
		}


		@Override
		public boolean shouldRemain(Entity affected) {
			if (turns == endturns) {
				return false;
			}
			return true;
		}

		
		@Override
		public void doEffect(Entity affected) {
			
		}

		@Override
		public boolean beginEffect(Entity affected) {
			return true;
		}

		
		@Override
		public void endEffect(Entity affected) {
			
		}

		
		@Override
		public void tick() {
			super.tick();
		}

	}
	
	public static class Ice extends Effects {
		
		String name="Ice Effect";
		int endturns = 10;
		int moveSpeed = 2;
		
		
		
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Ice [name=" + name + ", endturns=" + endturns
					+ ", moveSpeed=" + moveSpeed + ", turns=" + turns + "]";
		}


		@Override
		public boolean shouldRemain(Entity affected) {
			if (turns == endturns) {
				return false;
			}
			return true;
		}

		
		@Override
		public void doEffect(Entity affected) {
			affected.moveSpeed -= moveSpeed ;
		}

		
		@Override
		public boolean beginEffect(Entity affected) {
			return true;
		}

		
		@Override
		public void endEffect(Entity affected) {
			
			affected.moveSpeed += moveSpeed ;
		}

		
		@Override
		public void tick() {
			super.tick();
		}

	}
	
	public static class Paralysis extends Effects {
		
		String name="Paralysis Effect";
		int endturns = 3;
		int moveSpeed = 0;
		
		
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Paralysis [name=" + name + ", endturns=" + endturns
					+ ", moveSpeed=" + moveSpeed + ", turns=" + turns + "]";
		}


		@Override
		public boolean shouldRemain(Entity affected) {
			if (turns == endturns) {
				return false;
			}
			return true;
		}

		
		@Override
		public void doEffect(Entity affected) {
			int temp=affected.moveSpeed;
			affected.moveSpeed = moveSpeed;
			moveSpeed=temp;
		}

		
		@Override
		public boolean beginEffect(Entity affected) {
			
			return true;
		}

		
		@Override
		public void endEffect(Entity affected) {
			int temp=moveSpeed;
			moveSpeed=affected.moveSpeed;
			affected.moveSpeed=temp;
		}

		
		@Override
		public void tick() {
			super.tick();
		}

	}

}
