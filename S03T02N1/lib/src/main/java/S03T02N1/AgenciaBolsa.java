package S03T02N1;

public class AgenciaBolsa implements Observer{
	private double ibmPrice;
	private double applePrice;
	private double googlePrice;
	
	private static int observerIDTracker = 0;
	private int observerID;
	
	private Observable agenteBolsa;
	
	public AgenciaBolsa(Observable agenteBolsa) {
		this.agenteBolsa = agenteBolsa;
		this.observerID = ++observerIDTracker;
		agenteBolsa.registerObserver(this);
	}
	
	public void printPrices() {
        System.out.println(observerID + "\nIBM: " + ibmPrice + "\nApple: " + applePrice + "\nGoogle: " + googlePrice + "\n");
	}
	@Override
	public void update(double ibmPrice, double applePrice, double googlePrice) {	
		this.ibmPrice = ibmPrice;
		this.applePrice = applePrice;
		this.googlePrice = googlePrice;
		printPrices();
	}

}
