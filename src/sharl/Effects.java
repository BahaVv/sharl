package sharl;

public class Effects extends BaseStatusEffect {

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

	public class Poison extends Effects {

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

	public class Fire extends Effects {

		int endturns = 10;
		int dmg = 1;

		
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
	
	public class Bleeding extends Effects {

		int endturns = 40;

		
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
	
	public class Ice extends Effects {

		int endturns = 10;
		int moveSpeed = 2;

		
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
	
	public class Paralysis extends Effects {

		int endturns = 3;
		int moveSpeed = 0;

		
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
