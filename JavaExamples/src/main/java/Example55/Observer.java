package Example55;

public interface Observer{
    void update(double airPollutionIndex);
}

// widgets that need data!
class Subscriber implements Observer{
    private Subject subject;
    private String observerId;
    public static String outputMessage = "";

    public Subscriber(String observerId, Subject subject){
        this.subject=subject;
        this.observerId = observerId;
        // observer register itself  with subject
        this.subject.register(this);		// register itself
    }

    // Once the data comes in, the observer is free to do
    // what it wants with it,
    // subject will call the update method
    @Override
    public void update(double airPollutionIndex) {
        String s = this.observerId + " received notification: " + airPollutionIndex;
        System.out.println(s);
        outputMessage += (s + " ");
    }
}

