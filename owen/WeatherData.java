package owen;

import java.util.ArrayList;

public class WeatherData {

	private ArrayList<Double> temperatures;

	public void cleanData(double lower, double upper) {
		for (int i = 0; i < temperatures.size(); i += 1) {
			if (temperatures.get(i) > upper || temperatures.get(i) < lower) {
				temperatures.remove(i);
				i -= 1;
			}
		}
	}

	public int longestHeatWave(double threshold) {
		int i = 0;
		int currentRun = 0;
		int longestWave = 0;

		while (i < temperatures.size()) {
			if (temperatures.get(i) > threshold) {
				currentRun += 1;
				if (currentRun > longestWave) {
					longestWave = currentRun;
				}
			} else {
				currentRun = 0;
			}
			i += 1;
		}
		return longestWave;
	}

}
