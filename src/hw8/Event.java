package hw8;

public class Event {

	
		private int eventSequenceNum;
		private int eventDataValue;
		
		public Event(int sn, int dv){
			eventSequenceNum = sn;
			eventDataValue = dv;
		}
		
		public int getEventSeqNum() {
			return eventSequenceNum;
		}
		
		public int getEventDataValue() {
			return eventDataValue;
		}
		
}
