package S03T02N1;

import java.util.ArrayList;

public class AgenteBolsa implements Observable{

	private ArrayList<Observer> observers;
	private double ibmPrice;
	private double applePrice;
	private double googlePrice;
	
	//Constructor
	public AgenteBolsa() {
		observers = new ArrayList<Observer>();
	}
	@Override
	public void registerObserver(Observer observer) {
			observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		int observerIndex = observers.indexOf(observer);
		observers.remove(observerIndex);
	}

	@Override
	public void notifyObservers() {
		for (Observer i : observers) {
			i.update(ibmPrice, applePrice, googlePrice);
		}
	}
	
	public void setPrices(double newIBMPrice, double newApplePrice, double newGooglePrice) {
		ibmPrice = newIBMPrice;
		applePrice = newApplePrice;
		googlePrice= newGooglePrice;
		notifyObservers();
	}

}
