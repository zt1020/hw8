package hw8;

public class hw8 {

	public static void main(String[] args) {
		PublisherImpl pub = new PublisherImpl();
		SubscriberOdds subodd = new SubscriberOdds(21);
		SubscriberEven subeven = new SubscriberEven(14);
		SubscriberThrees subthree = new SubscriberThrees(10);
		pub.registerSubscriber(subodd);
		pub.registerSubscriber(subeven);
		pub.registerSubscriber(subthree);
		pub.runSimulation();

	}

}
