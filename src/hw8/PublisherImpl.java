package hw8;

import java.util.List;

public class PublisherImpl implements Publisher {

	
	private List<Subscriber> subscribers;
	
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
	public void notifySubscribers() {
		// TODO Auto-generated method stub

	}

	private Event generateEvent() {
		return null;
		
	}
	
	public void runSimulation() {
		
		
		
	}
	
	
}
