// Player class contains player attribute and get/set method.
public class Player {
	private String playerName;
	private int playerScore;

	public Player(String playerName, int playerScore) {
		super();
		this.playerName = playerName;
		this.playerScore = playerScore;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getPlayerScore() {
		return playerScore;
	}

	public void setPlayerScore(int playerScore) {
		this.playerScore = playerScore;
	}

	// override
	public String show() {

		return playerName + " score is " + playerScore;
	}

}
