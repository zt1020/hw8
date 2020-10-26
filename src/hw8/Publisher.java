package hw8;

public interface Publisher {
	
	public void registerSubscriber(Subscriber s);
	public void unregisterSubscriber(Subscriber s);
	public void notifySubscribers(Event e);
	
}
