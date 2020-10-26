package hw8;

public class SubscriberOdds implements Subscriber {

	private int eventsHandled = 0;
	private int turnOffThreshold;
	
	public SubscriberOdds(int tot) {tot = turnOffThreshold;}
	
	@Override
	public boolean notifySubscriber(Event e) {
		int dv = e.getEventDataValue();
		if (dv % 2 != 0) {
			eventsHandled += 1;
			if (eventsHandled <= turnOffThreshold) {
				System.out.println("SubscriberOdds: Event is odd: " + dv);
				return true;
			}
		}
		else if (eventsHandled % 40 == 0){
				
			eventsHandled = 0;
				
			}
		else{
			return false;
		}
		return false;
		
	}
	
	private void setEventsHandled(Boolean b) {
		
	}
	
	private Boolean getEventsHandled() {
		return null;
		
	}


}
