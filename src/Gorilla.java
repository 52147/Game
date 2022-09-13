// Gorilla class extend the Player class and overriding the show() method in Player class, 
// and overloading print() method.
public class Gorilla extends Player {

	private String gorillaName;
	private int gorillaHealth = 10;
	private int numberOfBanana;
	private int velocity;
	
	public Gorilla(String playerName, int playerScore) {
		super(playerName, playerScore);
	}

	public int getVelocity() {
		return velocity;
	}

	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}

	public String getGorillaName() {
		return gorillaName;
	}

	public void setGorillaName(String gorillaName) {
		this.gorillaName = gorillaName;
	}

	public int getGorillaHealth() {
		return gorillaHealth;
	}

	public void setGorillaHealth(int gorillaHealth) {
		this.gorillaHealth = gorillaHealth;
	}

	public int getNumberOfBanana() {
		return numberOfBanana;
	}

	public void setNumberOfBanana(int numberOfBanana) {
		this.numberOfBanana = numberOfBanana;
	}
	// overriding
	public String show() {
		
		if(gorillaHealth < 0) {
			return "dead";
		}
		return "live";
	}
	
	// overloading
	public void print(int x) {

	}
	// overloading
	public void print(int x, int y) {}

}