package S03T02N1;

public interface Observable {
	void registerObserver(Observer observer);
	void removeObserver(Observer observer);
	void notifyObservers();
}
