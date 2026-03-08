package EnumDetails;

	public enum Challenge97 {
		MONDAY(true),
		TUESDAY(true),
		WEDNESDAY(true),
		THURSDAY(true),
		FRIDAY(true),
		SATURDAY(false),
		SUNDAY(false); 
		
		private final boolean isWeekday;
		 
		Challenge97(boolean isWeekday){
			this.isWeekday=isWeekday;
		}
		
		public String getType() {
			return isWeekday? "Weekday":"Weekend";
		}
		
	}
