// Maps class contains the attribute of map and building height and building width.
public class Map {
	public int map [][];
	private int buildingHeight;
	private int buildingWidth;
	public Map(int row, int col) {
		super();
		map = new int [row][col];
		for (int i = 0; i < map.length; i++) {
			for (int j=0; j< map[0].length;j++) {
				map[i][j] = 1;
			}
		}
		this.buildingHeight = 150/col;
		this.buildingWidth = 150/row;
	}
	public int getBuildingHeight() {
		return buildingHeight;
	}
	public void setBuildingHeight(int buildingHeight) {
		this.buildingHeight = buildingHeight;
	}
	public int getBuildingWidth() {
		return buildingWidth;
	}
	public void setBuildingWidth(int buildingWidth) {
		this.buildingWidth = buildingWidth;
	}
	

}
