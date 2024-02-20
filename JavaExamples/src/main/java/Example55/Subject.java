package Example55;

import java.util.ArrayList;
import java.util.List;

// pull data and notify the observers
public interface Subject {
    void register(Observer o);
    void unregister(Observer o);
    void notifyObservers();
}

class AirPollutionAlert implements Subject{
    private double airPollutionIndex;
    // 1. create a list to store the observers
    private List<Observer> observerList;
    // 2. write no-arg constructor and initialize the list
    AirPollutionAlert(){
        observerList = new ArrayList<>();
    }

    public void setAirPollutionIndex(double airPollutionIndex) {
        this.airPollutionIndex = airPollutionIndex;
    }
    // 3. when this is called, add o to the list
    @Override
    public void register(Observer o) {
        observerList.add(o); // <----
    }

    @Override
    public void unregister(Observer o) {
        observerList.remove(o); // <---
    }
    // 4. adjust this solution based on the
    // requirements of the problem set 2A
    @Override
    public void notifyObservers() {
        // notify the observers by calling the update method
        for(Observer observer: observerList){
            observer.update(this.airPollutionIndex);
        }
    }
}
