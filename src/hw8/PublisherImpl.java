package hw8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PublisherImpl implements Publisher {

	
	private List<Subscriber> subscribers = new ArrayList<Subscriber>();
	
	@Override
	public void registerSubscriber(Subscriber s) {
		// TODO Auto-generated method stub
		subscribers.add(s);
	}

	@Override
	public void unregisterSubscriber(Subscriber s) {
		// TODO Auto-generated method stub
		subscribers.remove(s);
	}

	@Override
	public void notifySubscribers(Event e) {
		for (Subscriber subscriber: subscribers) {
			subscriber.notifySubscriber(e);
		}

	}

	private Event generateEvent(int i, int dv) {
		Event e = new Event(i, dv);
		return e;
		
	}
	
	public void runSimulation() {
		Random r = new Random();
		for(int i = 0; i<200; i++) {
			Event e = generateEvent(i, r.nextInt() );
			System.out.println(e.getEventSeqNum() + " " + e.getEventDataValue());
			notifySubscribers(e);
			
		}
		
		
	}
	
	
}
