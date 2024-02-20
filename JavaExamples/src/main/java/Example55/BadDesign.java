package Example55;

public class BadDesign {
}

class WidgetA{

    void displayDataOnScreen(){
        // do the stuff
    }

    void getDataFromServer(){
        //do the stuff
    }
}

class WidgetB{

    void displayDataOnScreen(){
        // do the stuff
    }

    void getDataFromServer(){
        //do the stuff
    }

}

/***
 * Solution ==> Encapsulate what varies
 * Single Responsibility Principle
 * (1) Separate class to get data from server
 * (2) Widget classes are "Observers" of the data
 * ==> Loose coupling --> introduce an interface for each class
 */