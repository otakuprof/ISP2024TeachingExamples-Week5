package Example51;

public class TestBusTicket {

    public static void main(String[] args) {

        BusFareConcrete busFareConcrete = new BusFareConcrete();
        // pass the busFareConcrete object to busTicket
        // busTicket has-a busFareConcrete object
        // HAS-A relationship, Composition
        BusTicket busTicket = new BusTicket("20", busFareConcrete);

        // if you need to change bus fares, cannot modify existing well-tested code
        // only solution is to inherit from BusFareConcrete and override

    }
}
