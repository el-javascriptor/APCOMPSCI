package owen;

public class BoxOfCandy {

	private Candy[][] box;

	public boolean moveCandyToFirstRow(int col) {
		// [row][column]
		if (box[0][col] != null) {
			return true;
		} else {
			boolean candyFound = false;
			for (int i = 0; i < box.length(); i += 1) {
				if (box[i][col] != null) {
					candyFound = true;
					box[0][col] = box[i][col]
					box[i][col] = null;
					break;
				}
			}
			if (candyFound) {
				return true;
			} else {
				return false;
			}
		}
	}
	
	public removeNextByFlavor(String flavor) {
		Candy foundCandy = null;
		boolean break_ = false;
		for (int i = box.length() - 1; i > 0; i -= 1) {
			for (int j = 0; j < box[0].length(); j += 1) {
				if (box[i][j].flavor.equals(flavor)) {
					foundCandy = box[i][j];
					box[i][j] = null;
					break_ = true;
					break;
					
				// whoops forgot the } here.
			}
			if (break_) {
				break;
			}
		}
		return foundCandy;
	}
}
