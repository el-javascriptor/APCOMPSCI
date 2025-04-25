package owen;

public class Sign {

	private String message = "";
	private int numLines = 0;

	Sign(String msg, int width) {
		numLines = (int) (msg.length / width) + msg.length() % width;

		for (int i = 0; i < numLines; i += width) {
			if ((i + width) < msg.length()) {
				message += msg.substring(i, width) + ";";
			} else {
				message += msg.substring(i);
			}
		}
	}

	public int numberOfLines() {
		return numLines;
	}

	public String getLines() {
		if (String(";").equals(message.substring(message.length() - 1))) {
			return message.substring(message.length() - 2);
		} else {
			return message;
		}
	}
	
}
