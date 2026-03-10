package Challenges90to102;

public enum TrafficColor {
	RED(9000),
	YELLOW(1000),
	GREEN(3000);
		private final int onTimeInMills;
	
		private TrafficColor(int onTimeInMills) {
			this.onTimeInMills = onTimeInMills;
		}

		public int getOnTimeInMills() { 
			return onTimeInMills;
		}
}
