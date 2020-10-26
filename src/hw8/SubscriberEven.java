package hw8;

public class SubscriberEven implements Subscriber {

	private int eventsHandled;
	private int turnOffThreshold;
	
	public SubscriberEven(int tot) {tot = turnOffThreshold;}
	
	@Override
	public boolean notifySubscriber(Event e) {
		int dv = e.getEventDataValue();
		if (dv % 2 == 0) {
			eventsHandled += 1;
			if (eventsHandled <= turnOffThreshold) {
				System.out.println("SubscriberEvens: Event is Even: " + dv);
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
	
	private void setEventsHandled(int b) {
		eventsHandled = b;
	}
	
	private int getEventsHandled() {
		return eventsHandled;
		
	}

}
