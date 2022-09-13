// GorillaGame class implement GorillaConsole interface.
// specific how function in GameConsole interface work
public class GorillaGame implements GameConsole {
	

	@Override
	public void jump() {
		System.out.println("jump");

	}

	@Override
	public void squat() {
		System.out.println("squat");

	}

	@Override
	public void left() {
		System.out.println("left");

	}

	@Override
	public void right() {
		System.out.println("right");

	}

	@Override
	public void attack() {
		System.out.println("attack");
		
	}

}
