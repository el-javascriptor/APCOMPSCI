package owen;

public class AppointmentBlock {

	private boolean isMinuteFree(int period, int minute) {
		return true;
	};

	private void reserveBlock(int period, int minute, int duration) {};

	public int findFreeBlock(int period, int duration) {
		int i = 0;
		int runLength = 0;
		while (i < (59 - duration)) {
			boolean minuteFree = isMinuteFree(period, i);
			if (minuteFree) {
				runLength += 1;
			} else {
				runLength = 0;
			}
			if (runLength == duration) {
				break;
			}
			i += 1;
		}
		if (i < (59 - duration)) {
			return i;
		} else {
			return -1;
		}
	}

	public boolean makeAppointment(int startPeriod, int endPeriod, int duration) {
		int i = startPeriod;
		boolean time_found = false;
		int time = -1;
		while (i <= endPeriod) {
			int freeBlockInPeriod = findFreeBlock(i, duration);
			if (freeBlockInPeriod != -1) {
				time = freeBlockInPeriod;
				time_found = true;
				break;
			} else {
				i += 1;
			}
		}
		if (time_found) {
			reserveBlock(i, time, duration);
			return true;
		} else {
			return false;
		}
	}
}